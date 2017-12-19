/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger("ExcelUtil");

	public static int getExcelIndex(String columnName) {
		int index = 0;
		char[] cc = columnName.toCharArray();
		for (int i = 0; i < cc.length; ++i) {
			char c = cc[i];
			int n = (c - 'A' + 1) * (int) Math.pow(26.0D, cc.length - 1 - i);
			index += n;
		}
		index -= 1;
		return index;
	}

	public static XSSFCell getCellByAddress(XSSFWorkbook workbook, String refers) {
		String[] ss = refers.split("!");
		String sheetName = ss[0];

		LOGGER.debug("refers【{}】, sheetName【{}】, address【{}】 ", new Object[] {
				refers, ss[0], ss[1] });

		String[] ii = ss[1].split("\\$");
		int c = getExcelIndex(ii[1]);
		int r = Integer.valueOf(ii[2]).intValue() - 1;

		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);

		return cell;
	}
}