/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.parser;

import com.code.model.Property;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class JavaTypeResolverDefaultImpl
{
  protected List<String> warnings;
  protected Properties properties;
  protected boolean forceBigDecimals;
  protected Map<Integer, JdbcTypeInformation> typeMap;

  public JavaTypeResolverDefaultImpl()
  {
    this.properties = new Properties();
    this.typeMap = new HashMap();

    this.typeMap.put(Integer.valueOf(2003), new JdbcTypeInformation("ARRAY", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(-5), new JdbcTypeInformation("BIGINT", new FullyQualifiedJavaType(Long.class.getName())));

    this.typeMap.put(Integer.valueOf(-2), new JdbcTypeInformation("BINARY", new FullyQualifiedJavaType("byte[]")));

    this.typeMap.put(Integer.valueOf(-7), new JdbcTypeInformation("BIT", new FullyQualifiedJavaType(Boolean.class.getName())));

    this.typeMap.put(Integer.valueOf(2004), new JdbcTypeInformation("BLOB", new FullyQualifiedJavaType("byte[]")));

    this.typeMap.put(Integer.valueOf(16), new JdbcTypeInformation("BOOLEAN", new FullyQualifiedJavaType(Boolean.class.getName())));

    this.typeMap.put(Integer.valueOf(1), new JdbcTypeInformation("CHAR", new FullyQualifiedJavaType(String.class.getName())));

    this.typeMap.put(Integer.valueOf(2005), new JdbcTypeInformation("CLOB", new FullyQualifiedJavaType(String.class.getName())));

    this.typeMap.put(Integer.valueOf(70), new JdbcTypeInformation("DATALINK", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(91), new JdbcTypeInformation("DATE", new FullyQualifiedJavaType(Date.class.getName())));

    this.typeMap.put(Integer.valueOf(2001), new JdbcTypeInformation("DISTINCT", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(8), new JdbcTypeInformation("DOUBLE", new FullyQualifiedJavaType(Double.class.getName())));

    this.typeMap.put(Integer.valueOf(6), new JdbcTypeInformation("FLOAT", new FullyQualifiedJavaType(Double.class.getName())));

    this.typeMap.put(Integer.valueOf(4), new JdbcTypeInformation("INTEGER", new FullyQualifiedJavaType(Integer.class.getName())));

    this.typeMap.put(Integer.valueOf(2000), new JdbcTypeInformation("JAVA_OBJECT", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(-4), new JdbcTypeInformation("LONGVARBINARY", new FullyQualifiedJavaType("byte[]")));

    this.typeMap.put(Integer.valueOf(-1), new JdbcTypeInformation("LONGVARCHAR", new FullyQualifiedJavaType(String.class.getName())));

    this.typeMap.put(Integer.valueOf(0), new JdbcTypeInformation("NULL", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(1111), new JdbcTypeInformation("OTHER", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(7), new JdbcTypeInformation("REAL", new FullyQualifiedJavaType(Float.class.getName())));

    this.typeMap.put(Integer.valueOf(2006), new JdbcTypeInformation("REF", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(5), new JdbcTypeInformation("SMALLINT", new FullyQualifiedJavaType(Short.class.getName())));

    this.typeMap.put(Integer.valueOf(2002), new JdbcTypeInformation("STRUCT", new FullyQualifiedJavaType(Object.class.getName())));

    this.typeMap.put(Integer.valueOf(92), new JdbcTypeInformation("TIME", new FullyQualifiedJavaType(Date.class.getName())));

    this.typeMap.put(Integer.valueOf(93), new JdbcTypeInformation("TIMESTAMP", new FullyQualifiedJavaType(Date.class.getName())));

    this.typeMap.put(Integer.valueOf(-6), new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Byte.class.getName())));

    this.typeMap.put(Integer.valueOf(-3), new JdbcTypeInformation("VARBINARY", new FullyQualifiedJavaType("byte[]")));

    this.typeMap.put(Integer.valueOf(12), new JdbcTypeInformation("VARCHAR", new FullyQualifiedJavaType(String.class.getName())));
  }

  public void addConfigurationProperties(Properties properties)
  {
  }

  public FullyQualifiedJavaType calculateJavaType(Property m)
  {
    JdbcTypeInformation jdbcTypeInformation = (JdbcTypeInformation)this.typeMap.get(Integer.valueOf(m.getDataType()));

    if (jdbcTypeInformation == null);
    FullyQualifiedJavaType answer;
    switch (m.getDataType())
    {
    case 2:
    case 3:
      if ((m.getDigits() > 0) || (m.getSize() > 18) || (this.forceBigDecimals)) {
         answer = new FullyQualifiedJavaType(BigDecimal.class.getName()); break; }
      if (m.getSize() > 9) {
         answer = new FullyQualifiedJavaType(Long.class.getName()); break;  }
      if (m.getSize() > 4) {
         answer = new FullyQualifiedJavaType(Integer.class.getName()); break; 
      }
      answer = new FullyQualifiedJavaType(Short.class.getName());

      break;
    default:
      answer = jdbcTypeInformation.getFullyQualifiedJavaType();
      break;

    }

     return answer;
  }

  public String calculateJavaTypeName(Property p) {
    FullyQualifiedJavaType t = calculateJavaType(p);
    return t.getFullyQualifiedName();
  }

  public String calculateJdbcTypeName(Property introspectedColumn)
  {
    JdbcTypeInformation jdbcTypeInformation = (JdbcTypeInformation)this.typeMap.get(Integer.valueOf(introspectedColumn.getDataType()));

    if (jdbcTypeInformation == null);
    String answer;
    switch (introspectedColumn.getDataType())
    {
    case 3:
      answer = "DECIMAL";
      break;
    case 2:
      answer = "NUMERIC";
      break;
    default:
      answer = jdbcTypeInformation.getJdbcTypeName();
      break;

    }

    return answer;
  }

  public void setWarnings(List<String> warnings)
  {
    this.warnings = warnings;
  }

  private static class JdbcTypeInformation
  {
    private String jdbcTypeName;
    private FullyQualifiedJavaType fullyQualifiedJavaType;

    public JdbcTypeInformation(String jdbcTypeName, FullyQualifiedJavaType fullyQualifiedJavaType) {
      this.jdbcTypeName = jdbcTypeName;
      this.fullyQualifiedJavaType = fullyQualifiedJavaType;
    }

    public String getJdbcTypeName() {
      return this.jdbcTypeName;
    }

    public FullyQualifiedJavaType getFullyQualifiedJavaType() {
      return this.fullyQualifiedJavaType;
    }
  }
}