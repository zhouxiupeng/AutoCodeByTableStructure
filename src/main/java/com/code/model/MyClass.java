/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model;

import com.code.model.abstractModel.AbstractDBField;
import com.code.util.StringUtil;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MyClass extends AbstractDBField
{
  public String packageName;
  public String moduleName;
  public String noModuleName;
  public String noModuleNameFU;
  public String noModuleNameAL;
  public String noModuleNameAU;
  private List<Property> pkPropertyList;
  private List<Property> fkPropertyList;
  private List<Property> propertyList;
  private List<Property> noPKpropertyList;

  public MyClass()
  {
    this.pkPropertyList = new ArrayList();

    this.fkPropertyList = new ArrayList();

    this.propertyList = new ArrayList();

    this.noPKpropertyList = new ArrayList(); }

  public String getPackageName() {
    return this.packageName; }

  public void setPackageName(String packageName) {
    this.packageName = packageName; }

  public String getModuleName() {
    return this.moduleName; }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName; }

  public String getNoModuleName() {
    return this.noModuleName; }

  public void setNoModuleName(String noModuleName) {
    this.noModuleName = noModuleName;
    this.noModuleNameFU = StringUtil.firstToUpperCase(noModuleName);
    this.noModuleNameAU = noModuleName.toUpperCase();
    this.noModuleNameAL = noModuleName.toLowerCase(); }

  public String getNoModuleNameFU() {
    return this.noModuleNameFU; }

  public void setNoModuleNameFU(String noModuleNameFU) {
    this.noModuleNameFU = noModuleNameFU; }

  public String getNoModuleNameAL() {
    return this.noModuleNameAL; }

  public void setNoModuleNameAL(String noModuleNameAL) {
    this.noModuleNameAL = noModuleNameAL; }

  public String getNoModuleNameAU() {
    return this.noModuleNameAU; }

  public void setNoModuleNameAU(String noModuleNameAU) {
    this.noModuleNameAU = noModuleNameAU; }

  public List<Property> getPropertyList() {
    return this.propertyList; }

  public void setPropertyList(List<Property> propertyList) {
    this.propertyList = propertyList; }

  public List<Property> getPkPropertyList() {
    return this.pkPropertyList; }

  public void setPkPropertyList(List<Property> pkPropertyList) {
    this.pkPropertyList = pkPropertyList; }

  public List<Property> getFkPropertyList() {
    return this.fkPropertyList; }

  public void setFkPropertyList(List<Property> fkPropertyList) {
    this.fkPropertyList = fkPropertyList; }

  public List<Property> getNoPKpropertyList() {
    return this.noPKpropertyList; }

  public void setNoPKpropertyList(List<Property> noPKpropertyList) {
    this.noPKpropertyList = noPKpropertyList; }

  public static void main(String[] args) {
    MyClass m = new MyClass();
    System.out.println(m);
  }
}