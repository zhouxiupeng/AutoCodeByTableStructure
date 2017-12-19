/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.util;

import com.code.model.DropDown;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DropDownListUtil
{
  private static final Logger LOGGER = LoggerFactory.getLogger("DropDownListUtil");
  public static final int MAX_STATUS = 9999;
  public static final String[] CLEAR_SYMBOL = { " ", "、", ".", "。", ",", "，", " ", "  ", " ", ":", "：", ";", "；" };

  public static List<DropDown> getDropDownListByNote(String note)
  {
    try
    {
      List list = getDropDownList(note);
      return list;
    }
    catch (Exception e) {
      LOGGER.error("判断备注【{}】是否是下拉框的时候，出现异常【{}】！但不影响系统后续运行。", new Object[] { note, e.getMessage() }); }
    return null;
  }

  private static List<DropDown> getDropDownList(String note)
  {
    if (note == null) {
      return null;
    }

    Set<String> set = new LinkedHashSet<String>();
    for (int i = 9999; i >= 0; --i) {
      set.add("-" + i);
      set.add(String.valueOf(i));
    }

    String strTemp = note;
    Map<Object,DropDown> treeMap = new TreeMap<Object,DropDown>();
    for (String s : set) {
      int index = strTemp.indexOf(s);
      if (index > 0) {
        DropDown dd = new DropDown();
        dd.setId(Integer.valueOf(s).intValue());
        dd.setIndex(index);

        treeMap.put(Integer.valueOf(index), dd);
        String temp = "";
        for (int i = 0; i < s.length(); ++i) {
          temp = temp + "a";
        }
        strTemp = strTemp.replace(s, temp);
      }

    }

    List<DropDown> list = new ArrayList<DropDown>();
    for (DropDown dd : treeMap.values()) {
      list.add(dd);
    }

    for (int i = 0; i < list.size() - 1; ++i) {
      DropDown dd = (DropDown)list.get(i);
      DropDown ddNext = (DropDown)list.get(i + 1);
      dd.setNext(ddNext);
    }

    for (int i = 0; i < list.size(); ++i) {
      DropDown dd = (DropDown)list.get(i);
      if (dd.getNext() != null)
      {
        String name = note.substring(dd.getIndex(), dd.getNext().getIndex());
        name = name.replaceAll(dd.getId() + "", "");
        name = clearSymbol(name);
        dd.setName(name);
      } else {
        String name = note.substring(dd.getIndex(), note.length());
        name = name.replaceAll(dd.getId() + "", "");
        name = clearSymbol(name);
        dd.setName(name);
      }

    }

    if (list.size() <= 1)
    {
      return null;
    }
    for (DropDown dd : list) {
      if ((dd.getName() == null) || ("".equals(dd.getName())))
      {
        return null;
      }

    }

    Map<Object,DropDown> treeMap2 = new TreeMap<Object,DropDown>();
    for (DropDown dd : list) {
      treeMap2.put(Integer.valueOf(dd.getId()), dd);
    }
    List<DropDown> resultList = new ArrayList<DropDown>();
    for (DropDown dd : treeMap2.values()) {
      resultList.add(dd);
    }

    for (DropDown dd : resultList) {
      LOGGER.debug(dd.getId() + " - " + dd.getName());
    }

    return resultList;
  }

  public static String clearSymbol(String str)
  {
    String resultStr = str;
    for (String s : CLEAR_SYMBOL)
    {
      resultStr = resultStr.replace(s, "");
    }

    return resultStr;
  }

  public static void main(String[] args)
  {
    DropDownListUtil t = new DropDownListUtil();
    String str = "优惠券状态：0、无效，1，待支付  2已完成99未下单 11取消 32、支付中88支付成功";
    List list = getDropDownListByNote(str);
    System.out.println(list);
  }
}