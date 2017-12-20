/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.config;

import com.code.model.abstractModel.AbstractObject;
import com.code.util.FileUtil;
import com.code.util.StringUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class Config extends AbstractObject
{
  private static Config config;
  public String dbName;
  public String configPath;
  public String outputPath;
  public String time;
  public String timeDay;
  public String timeMonth;
  public String timeYear;
  public String author;
  public String email;
  public boolean isWriteToProject;
  public boolean isForceWriteToProject;
  public boolean isSubpackage;
  public String[] tableFixs;
  public String po;
  public String entity;
  public String mapper;
  public String service;
  public String dao;
  public String daoImpl;
  public String serviceImpl;
  public String controller;
  public String jsp;
  public String js;
  public String tempJsp;
  public String dubooProvider;
  public String dubooConsumer;
  public List<CoderConfig> coderConfigList;
  public List<String> tableList;
  public List<String> jdbcList;
  
  //add by zxp 模版路径，默认空
  public String markerPath="";

  public Config()
  {
    this.configPath = System.getProperty("file.separator") + System.getProperty("user.dir") + System.getProperty("file.separator") + "conf" + System.getProperty("file.separator");

    this.outputPath = System.getProperty("file.separator") + System.getProperty("user.dir") + System.getProperty("file.separator") + "code" + System.getProperty("file.separator");

    this.time = StringUtil.getFormatTime(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss");
    this.timeDay = StringUtil.getFormatTime(System.currentTimeMillis(), "yyyy-MM-dd");
    this.timeMonth = StringUtil.getFormatTime(System.currentTimeMillis(), "yyyy-MM");
    this.timeYear = StringUtil.getFormatTime(System.currentTimeMillis(), "yyyy");

    this.coderConfigList = new ArrayList();

    this.tableList = FileUtil.readLines(new File(this.configPath + "tables.txt"));

    this.jdbcList = FileUtil.readLines(new File(this.configPath + "jdbc.properties"));

    initConfig(this.configPath + "config.xml");
  }

  public static Config getInstall()
  {
    if (config == null) {
      config = new Config();
    }
    return config;
  }

  public void initConfig(String fileName)
  {
    Document doc = null;
    try {
      SAXBuilder sb = new SAXBuilder();
      File file = new File(fileName);
      doc = sb.build(file);
    } catch (Exception e) {
      e.printStackTrace();
    }
    Element root = doc.getRootElement();

    this.isWriteToProject = Boolean.valueOf(root.getAttributeValue("isWriteToProject")).booleanValue();

    this.isForceWriteToProject = Boolean.valueOf(root.getAttributeValue("isForceWriteToProject")).booleanValue();

    this.isSubpackage = Boolean.valueOf(root.getAttributeValue("isSubpackage", "true")).booleanValue();
    this.tableFixs = root.getAttributeValue("tableFixs").split(",");
    if(StringUtil.isNotEmpty(root.getAttributeValue("marker_path"))){
    	markerPath=root.getAttributeValue("marker_path");
    }

    if (this.isWriteToProject) {
      this.po = root.getAttributeValue("po");
      this.entity = root.getAttributeValue("entity");
      this.dbName = root.getAttributeValue("dbname");
      this.mapper = root.getAttributeValue("mapper");
      this.dao = root.getAttributeValue("dao");
      this.daoImpl = root.getAttributeValue("daoImpl");
      this.service = root.getAttributeValue("service");
      this.serviceImpl = root.getAttributeValue("serviceImpl");

      this.controller = root.getAttributeValue("controller");
      this.jsp = root.getAttributeValue("jsp");
      this.js = root.getAttributeValue("js");

      this.tempJsp = root.getAttributeValue("tempJsp");

      this.dubooProvider = root.getAttributeValue("dubooProvider");
      this.dubooConsumer = root.getAttributeValue("dubooConsumer");
    }

    this.author = "代码自动生成";//StringUtil.bbToStr(new byte[] { 65, 117, 116, 111, 67, 111, 100, 101 });
    this.email = "113857118@qq.com";//StringUtil.bbToStr(new byte[] { 51, 48, 57, 52, 52, 52, 51, 53, 57, 64, 113, 113, 46, 99, 111, 109 });
  }
}