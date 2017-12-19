/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.db;

import com.code.config.Config;
import com.code.model.MyClass;
import com.code.model.Property;
import com.code.parser.JavaTypeResolverDefaultImpl;
import com.code.parser.JdbcTypeNameTranslator;
import com.code.util.DropDownListUtil;
import com.code.util.StringUtil;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtils
{
  public static Connection getConnetion()
    throws Exception
  {
    String diver = ProReader.getInstance().getProperty("jdbc.driverClassName");
    String url = ProReader.getInstance().getProperty("jdbc.url");
    String user = ProReader.getInstance().getProperty("jdbc.username");
    String password = ProReader.getInstance().getProperty("jdbc.password");

    Properties props = new Properties();
    props.setProperty("user", user);
    props.setProperty("password", password);
    props.setProperty("remarks", "true");
    props.setProperty("useInformationSchema", "true");

    Connection conn = DriverManager.getConnection(url, props);

    return conn;
  }

  public static int getDBType()
  {
    String diver = ProReader.getInstance().getProperty("jdbc.driverClassName");
    if (diver.toLowerCase().contains("mysql"))
      return 1;
    if (diver.toLowerCase().contains("oracle"))
      return 2;
    if (diver.toLowerCase().contains("sqlserver"))
      return 3;
    if (diver.toLowerCase().contains("db2"))
      return 4;
    if (diver.toLowerCase().contains("sybase")) {
      return 5;
    }
    return 1;
  }

  public static String getMapperSuffix()
  {
    String diver = ProReader.getInstance().getProperty("jdbc.driverClassName");
    if (diver.toLowerCase().contains("mysql"))
      return "Mysql";
    if (diver.toLowerCase().contains("oracle"))
      return "Oracle";
    if (diver.toLowerCase().contains("sqlserver"))
      return "SqlServer";
    if (diver.toLowerCase().contains("db2"))
      return "DB2";
    if (diver.toLowerCase().contains("sybase")) {
      return "Sybase";
    }
    return "Mysql";
  }

  public Connection getConnection(String username, String password, String host, String port, String database)
  {
    Connection con = null;
    Properties props = new Properties();
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String url = "jdbc:oracle:thin:@" + host + ":" + port + ":" + database;

      props.setProperty("user", username);
      props.setProperty("password", password);
      props.setProperty("remarks", "true");

      con = DriverManager.getConnection(url, props);
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  }

  public static List<MyClass> getMyClassList(Connection con, String[] types, String table)
    throws Exception
  {
    List l = new ArrayList();
    DatabaseMetaData dm = con.getMetaData();
    String catalog = null;
    String schema = null;

    ResultSet rs = dm.getTables(catalog, schema, table, types);
    while (rs.next()) {
      String tabelName = rs.getString("TABLE_NAME");

      String tableNameNoPrefix = tabelName;
      for (String tableFix : Config.getInstall().tableFixs) {
        if (tabelName.indexOf(tableFix) == 0) {
          tableNameNoPrefix = tabelName.substring(tableFix.length());
          break;
        }

      }

      String cat = rs.getString("TABLE_CAT");
      String schem = rs.getString("TABLE_SCHEM");
      String remarks = rs.getString("REMARKS");

      String moduleName = tableNameNoPrefix.split("_")[0].toLowerCase();

      String name = StringUtil.columnNameToPropertityName(tableNameNoPrefix);

      String noModuleName = name;
      if (tableNameNoPrefix.split("_").length > 1) {
        noModuleName = StringUtil.columnNameToPropertityName(tableNameNoPrefix.substring(tableNameNoPrefix.indexOf("_") + 1));
      }

      String packageName = null;

      if (Config.getInstall().isSubpackage)
        packageName = "." + moduleName;
      else {
        packageName = "";
      }

      MyClass myClass = new MyClass();
      myClass.setDbName(tabelName);
      myClass.setName(name);
      myClass.setNote(remarks);
      myClass.setModuleName(moduleName);
      myClass.setPackageName(packageName);
      myClass.setNoModuleName(noModuleName);

      ResultSet rspk = dm.getPrimaryKeys(cat, schem, tabelName);
      List pkPropertyList = getPkColumns(rspk, dm, cat, schem, tabelName);
      myClass.setPkPropertyList(pkPropertyList);

      ResultSet rsc = dm.getColumns(cat, schem, tabelName, null);
      myClass.setPropertyList(getColumns(rsc));

      ResultSet rsfk = dm.getPrimaryKeys(cat, schem, tabelName);
      List fkPropertyList = getFkColumns(rsfk, dm, cat, schem, tabelName);
      myClass.setFkPropertyList(fkPropertyList);

      List noPKpropertyList = new ArrayList();
      noPKpropertyList.addAll(myClass.getPropertyList());
      noPKpropertyList.removeAll(myClass.getPkPropertyList());
      myClass.setNoPKpropertyList(noPKpropertyList);

      l.add(myClass);
    }
    return l;
  }

  private static List<Property> getPkColumns(ResultSet rs, DatabaseMetaData dm, String cat, String schem, String tabelName)
    throws Exception
  {
    List l = new ArrayList();
    while (rs.next()) {
      String cloumName = rs.getString("COLUMN_NAME");
      ResultSet rsc = dm.getColumns(cat, schem, tabelName, cloumName);
      if (rsc.next())
        l.add(getColumn(rsc));
    }
    return l;
  }

  private static List<Property> getFkColumns(ResultSet rs, DatabaseMetaData dm, String cat, String schem, String tabelName)
    throws Exception
  {
    List l = new ArrayList();
    while (rs.next()) {
      String cloumName = rs.getString("COLUMN_NAME");
      ResultSet rsc = dm.getColumns(cat, schem, tabelName, cloumName);
      if (rsc.next())
        l.add(getColumn(rsc));
    }
    return l;
  }

  private static List<Property> getColumns(ResultSet rs)
    throws Exception
  {
    List l = new ArrayList();
    while (rs.next()) {
      l.add(getColumn(rs));
    }
    return l;
  }

  public static Property getColumn(ResultSet rs)
    throws Exception
  {
    Property p = new Property();
    String cloumName = rs.getString("COLUMN_NAME");
    int nullable = rs.getInt("NULLABLE");
    int size = rs.getInt("COLUMN_SIZE");
    int dataType = rs.getInt("DATA_TYPE");
    int digits = rs.getInt("DECIMAL_DIGITS");
    String remarks = rs.getString("REMARKS");

    p.setDbName(cloumName);
    p.setName(StringUtil.columnNameToPropertityName(cloumName));
    p.setNullable(nullable);
    p.setSize(size);
    p.setDataType(dataType);
    p.setDigits(digits);
    p.setNote(remarks);

    List dropDownList = DropDownListUtil.getDropDownListByNote(p.getNote());
    if ((dropDownList == null) || (dropDownList.isEmpty())) {
      p.setIsDropDown("false");
    } else {
      p.setIsDropDown("true");
      p.setDropDownList(dropDownList);
    }

    String javaFullType = new JavaTypeResolverDefaultImpl().calculateJavaTypeName(p);
    String jdbcType = JdbcTypeNameTranslator.getJdbcTypeName(dataType);

    p.setJavaFullType(javaFullType);
    p.setJdbcType(jdbcType);

    return p;
  }
}