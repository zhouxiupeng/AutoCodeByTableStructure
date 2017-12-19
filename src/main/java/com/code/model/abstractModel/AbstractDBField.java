/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model.abstractModel;

import com.code.model.DropDown;
import com.code.util.StringUtil;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDBField extends AbstractField
{
  public String dbName;
  public String dbNameFU;
  public String dbNameAL;
  public String dbNameAU;
  private String isDropDown;
  private List<DropDown> dropDownList;

  public AbstractDBField()
  {
    this.dropDownList = new ArrayList(); }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName)
  {
    this.dbName = dbName;
    this.dbNameFU = StringUtil.firstToUpperCase(dbName);
    this.dbNameAU = dbName.toUpperCase();
    this.dbNameAL = dbName.toLowerCase();
  }

  public String getDbNameFU() {
    return this.dbNameFU; }

  public String getDbNameAL() {
    return this.dbNameAL; }

  public String getDbNameAU() {
    return this.dbNameAU;
  }

  public String getIsDropDown() {
    return this.isDropDown;
  }

  public void setIsDropDown(String isDropDown) {
    this.isDropDown = isDropDown;
  }

  public List<DropDown> getDropDownList() {
    return this.dropDownList;
  }

  public void setDropDownList(List<DropDown> dropDownList) {
    this.dropDownList = dropDownList;
  }
}