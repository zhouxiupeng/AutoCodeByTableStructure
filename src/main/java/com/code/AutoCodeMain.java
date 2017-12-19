/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code;

import com.code.config.Config;
import com.code.db.DBUtils;
import com.code.freemarker.FreeMarkerWriter;
import com.code.log.LogStart;
import com.code.model.MyClass;
import com.code.util.StringUtil;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoCodeMain
{
  private static final Logger LOGGER = LoggerFactory.getLogger("AutoCodeMain");

  public static void main(String[] args)
    throws Exception
  {
    AutoCodeMain coder = new AutoCodeMain();

    coder.code();
  }

  public void code()
    throws Exception
  {
    new LogStart();
    LOGGER.info("################## ��ʼ���ɴ��� #################");

    String[] types = { "TABLE" };

    List myClassList = new ArrayList();

    Connection jdbcConnection = DBUtils.getConnetion();
    for (String table : Config.getInstall().tableList) {
      table = table.trim();
      List<MyClass> myClasses = DBUtils.getMyClassList(jdbcConnection, types, table);

      for (MyClass myClass : myClasses)
      {
        code(myClass);
      }

      myClassList.addAll(myClasses);
    }

    codeDubooXml(myClassList);

    LOGGER.info("���ݿ����������{}��", new Object[] { Integer.valueOf(myClassList.size()) });

    LOGGER.info("################## ����������� ##################");
  }

  public static void code(MyClass myClass)
  {
    String moduleName = myClass.getModuleName() + "//";

    String packageName = myClass.getPackageName();

    if (!("".equals(packageName)))
    {
      packageName = packageName.replaceFirst(".", "") + "//";
    }

    
    if (Config.getInstall().isWriteToProject)
    {
      boolean isForceWriteToProject = Config.getInstall().isForceWriteToProject;

      String po = Config.getInstall().po + packageName + myClass.getNameFU() + ".java";
      String mapper = Config.getInstall().mapper + packageName + myClass.getNameFU() + "Mapper.xml";

      String dao = Config.getInstall().dao + packageName + "I"+myClass.getNameFU() + "Dao.java";
      String daoImpl = Config.getInstall().daoImpl + packageName + myClass.getNameFU() + "DaoImpl.java";

      String service = Config.getInstall().service + packageName +"I"+ myClass.getNameFU() + "Service.java";
      String serviceImpl = Config.getInstall().serviceImpl + packageName + myClass.getNameFU() + "ServiceImpl.java";
      String controller = Config.getInstall().controller + packageName + myClass.getNameFU() + "Controller.java";

      String indexJsp = Config.getInstall().jsp + moduleName + myClass.getNoModuleName() + ".index.jsp";

      String indexJs = Config.getInstall().js + moduleName + "js//" + myClass.getNoModuleName() + ".index.js";

      String editJsp = Config.getInstall().jsp + moduleName + myClass.getNoModuleName() + ".edit.jsp";

      String editJs = Config.getInstall().js + moduleName + "js//" + myClass.getNoModuleName() + ".edit.js";

      String detailJsp = Config.getInstall().jsp + moduleName + myClass.getNoModuleName() + ".detail.jsp";

      String detailJs = Config.getInstall().js + moduleName + "js//" + myClass.getNoModuleName() + ".detail.js";

      if (StringUtil.isNotEmpty(Config.getInstall().po)) FreeMarkerWriter.write("Object.java", po, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().mapper)) FreeMarkerWriter.write("ObjectMapperFor" + DBUtils.getMapperSuffix() + ".xml", mapper, myClass, isForceWriteToProject);

      if (StringUtil.isNotEmpty(Config.getInstall().dao)) FreeMarkerWriter.write("ObjectDao.java", dao, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().daoImpl)) FreeMarkerWriter.write("ObjectDaoImpl.java", daoImpl, myClass, isForceWriteToProject);

      if (StringUtil.isNotEmpty(Config.getInstall().service)) FreeMarkerWriter.write("ObjectService.java", service, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().serviceImpl)) FreeMarkerWriter.write("ObjectServiceImpl.java", serviceImpl, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().controller)) FreeMarkerWriter.write("ObjectController.java", controller, myClass, isForceWriteToProject);

      if (StringUtil.isNotEmpty(Config.getInstall().jsp)) FreeMarkerWriter.write("Object.index.jsp", indexJsp, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().js)) FreeMarkerWriter.write("Object.index.js", indexJs, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().jsp)) FreeMarkerWriter.write("Object.edit.jsp", editJsp, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().js)) FreeMarkerWriter.write("Object.edit.js", editJs, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().jsp)) FreeMarkerWriter.write("Object.detail.jsp", detailJsp, myClass, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().js)) FreeMarkerWriter.write("Object.detail.js", detailJs, myClass, isForceWriteToProject);

    }

    String objectName2 = Config.getInstall().outputPath + "po//" + moduleName + myClass.getNameFU() + ".java";
    String mapper2 = Config.getInstall().outputPath + "mapper//" + moduleName + myClass.getNameFU() + "Mapper.xml";
    String iDaoName2 = Config.getInstall().outputPath + "dao//" + moduleName + myClass.getNameFU() + "Dao.java";

    String iServiceName2 = Config.getInstall().outputPath + "service//" + moduleName + myClass.getNameFU() + "Service.java";
    String serviceName2 = Config.getInstall().outputPath + "serviceImpl//" + moduleName + myClass.getNameFU() + "ServiceImpl.java";
    String controller2 = Config.getInstall().outputPath + "controller//" + moduleName + myClass.getNameFU() + "Controller.java";

    String indexJsp2 = Config.getInstall().outputPath + "jsp//" + moduleName + myClass.getNoModuleName() + ".index.jsp";

    String indexJs2 = Config.getInstall().outputPath + "js//" + moduleName + myClass.getNoModuleName() + ".index.js";

    String editJsp2 = Config.getInstall().outputPath + "jsp//" + moduleName + myClass.getNoModuleName() + ".edit.jsp";

    String editJs2 = Config.getInstall().outputPath + "js//" + moduleName + myClass.getNoModuleName() + ".edit.js";

    String detailJsp2 = Config.getInstall().outputPath + "jsp//" + moduleName + myClass.getNoModuleName() + ".detail.jsp";

    String detailJs2 = Config.getInstall().outputPath + "js//" + moduleName + myClass.getNoModuleName() + ".detail.js";

    FreeMarkerWriter.write("Object.java", objectName2, myClass, true);
    FreeMarkerWriter.write("ObjectMapperFor" + DBUtils.getMapperSuffix() + ".xml", mapper2, myClass, true);

    FreeMarkerWriter.write("ObjectDao.java", iDaoName2, myClass, true);

    FreeMarkerWriter.write("ObjectService.java", iServiceName2, myClass, true);
    FreeMarkerWriter.write("ObjectServiceImpl.java", serviceName2, myClass, true);
    FreeMarkerWriter.write("ObjectController.java", controller2, myClass, true);

    FreeMarkerWriter.write("Object.index.jsp", indexJsp2, myClass, true);
    FreeMarkerWriter.write("Object.index.js", indexJs2, myClass, true);
    FreeMarkerWriter.write("Object.edit.jsp", editJsp2, myClass, true);
    FreeMarkerWriter.write("Object.edit.js", editJs2, myClass, true);
    FreeMarkerWriter.write("Object.detail.jsp", detailJsp2, myClass, true);
    FreeMarkerWriter.write("Object.detail.js", detailJs2, myClass, true);
  }

  public static void codeDubooXml(List<MyClass> myClassList)
  {
    Map map = new HashMap();
    map.put("myClassList", myClassList);

    if (Config.getInstall().isWriteToProject)
    {
      boolean isForceWriteToProject = Config.getInstall().isForceWriteToProject;

      String dubooProviderName = Config.getInstall().dubooProvider + "spring-duboo-provider.xml";
      String dubooConsumerName = Config.getInstall().dubooConsumer + "spring-duboo-consumer.xml";

      String tempJspName = Config.getInstall().tempJsp + "temp.jsp";

      if (StringUtil.isNotEmpty(Config.getInstall().dubooProvider)) FreeMarkerWriter.write("spring-duboo-provider.xml", dubooProviderName, map, isForceWriteToProject);
      if (StringUtil.isNotEmpty(Config.getInstall().dubooConsumer)) FreeMarkerWriter.write("spring-duboo-consumer.xml", dubooConsumerName, map, isForceWriteToProject);

      if (StringUtil.isNotEmpty(Config.getInstall().tempJsp)) FreeMarkerWriter.write("temp.jsp", tempJspName, map, true);

    }

    String dubooProviderName = Config.getInstall().outputPath + "spring-duboo-provider.xml";
    String dubooConsumerName = Config.getInstall().outputPath + "spring-duboo-consumer.xml";

    String tempJspName = Config.getInstall().outputPath + "temp.jsp";

    FreeMarkerWriter.write("spring-duboo-provider.xml", dubooProviderName, map, true);
    FreeMarkerWriter.write("spring-duboo-consumer.xml", dubooConsumerName, map, true);

    FreeMarkerWriter.write("temp.jsp", tempJspName, map, true);
  }
}