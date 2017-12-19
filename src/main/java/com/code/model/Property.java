/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model;

import com.code.model.abstractModel.AbstractDBField;
import java.util.ArrayList;
import java.util.List;

public class Property extends AbstractDBField
{
  private String javaType;
  private String javaFullType;
  private String jdbcType;
  private int nullable;
  private int size;
  private int dataType;
  private int digits;
  private List<DropDown> dropDownList;

  public Property()
  {
    this.dropDownList = new ArrayList();
  }

  public String getJavaType() {
    return this.javaType; }

  public void setJavaType(String javaType) {
    this.javaType = javaType; }

  public String getJavaFullType() {
    return this.javaFullType; }

  public void setJavaFullType(String javaFullType) {
    this.javaFullType = javaFullType;
    String javaType = javaFullType.substring(javaFullType.lastIndexOf(".") + 1);
    this.javaType = javaType; }

  public String getJdbcType() {
    return this.jdbcType; }

  public void setJdbcType(String jdbcType) {
    this.jdbcType = jdbcType; }

  public int getNullable() {
    return this.nullable; }

  public void setNullable(int nullable) {
    this.nullable = nullable; }

  public int getSize() {
    return this.size; }

  public void setSize(int size) {
    this.size = size; }

  public int getDataType() {
    return this.dataType; }

  public void setDataType(int dataType) {
    this.dataType = dataType; }

  public int getDigits() {
    return this.digits; }

  public void setDigits(int digits) {
    this.digits = digits;
  }
}