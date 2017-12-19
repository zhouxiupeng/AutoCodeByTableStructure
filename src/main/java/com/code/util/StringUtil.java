/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.util;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	public static String firstToUpperCase(String str) {
		if ((str == null) || (str.length() < 1)) {
			return str;
		}
		String s = str.substring(0, 1).toUpperCase() + str.substring(1);
		return s;
	}

	public static String firstToLowerCase(String str) {
		String s = str.substring(0, 1).toLowerCase() + str.substring(1);
		return s;
	}

	public static String getFormatTime(long time, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(new Date(time));
		return str;
	}

	public static String tableNameToClassName(String tableName) {
		String className = firstToUpperCase(replaceUnderlineAndfirstToUpper(tableName));
		return className;
	}

	public static String columnNameToPropertityName(String columnName) {
		String columnNameLowerCase = columnName.toLowerCase();
		String propertyName = replaceUnderlineAndfirstToUpper(columnNameLowerCase);
		return propertyName;
	}

	public static String replaceUnderlineAndfirstToUpper(String tableName) {
		String className = tableName;

		int index = className.indexOf("_");

		while (index != -1) {
			className = className.substring(0, index)
					+ className.substring(index + 1, index + 2).toUpperCase()
					+ className.substring(index + 2);
			index = className.indexOf("_");
		}

		return className;
	}

	public static String bbToStr(byte[] bb) {
		String str = "";
		try {
			str = new String(bb, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String getMainStr(String str) {
		String[] ss = { " ", ":", ",", ";", "(", ".", "：", "，", "；", "（", "",
				"。" };

		return str.substring(0, getFirstIndex(str, ss));
	}

	public static int getFirstIndex(String str, String[] ss)
  {
    int index = 2147483647;
    for (String s : ss) {
      int i = str.indexOf(s);
      if ((i < index) && (i > 0)) {
        index = i;
      }
    }
    if (index == 2147483647) {
      index = str.length();
    }
    return index;
  }

	public static boolean isNotEmpty(String str) {
		return ((str != null) && (!("".equals(str))));
	}

	public static void main(String[] args) {
		String str = "是否有发票。1：有；0：无；";
		System.out.println(getMainStr(str));
	}
}