/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.freemarker;

import com.code.config.Config;
import com.code.util.FileUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FreeMarkerWriter {
	private static final Logger LOGGER = LoggerFactory
			.getLogger("FreeMarkerWriter");

	static String fileName = System.getProperty("file.separator")
			+ System.getProperty("user.dir")
			+ System.getProperty("file.separator") + "freeMarkerTemp"+Config.getInstall().markerPath
			+ System.getProperty("file.separator");

	public static void write(String templateFileName, String outFileFullName,
			Object data) {
		write(templateFileName, outFileFullName, data, true);
	}

	public static void write(String templateFileName, String outFileFullName,
			Object data, boolean isCoverIfExists) {
		Integer iValid = checkValid(templateFileName);
		if(iValid==0) {
			LOGGER.debug("模版"+templateFileName+"不存在，不需要生成");
			return;
		}
		
		if ((outFileFullName.endsWith(".jsp"))
				|| (outFileFullName.endsWith(".js"))
				|| (outFileFullName.endsWith(".txt"))) {
			iValid = 1;
		}
		if (iValid<0) {
			throw new RuntimeException(fileName + templateFileName
					+ " is a Invalid FreeMarker template");
		}

		if (data instanceof Map) {
			Map map = (Map) data;
			map.put("author", Config.getInstall().author);
			map.put("email", Config.getInstall().email);
			map.put("time", Config.getInstall().time);
			map.put("timeDay", Config.getInstall().timeDay);
			map.put("timeMonth", Config.getInstall().timeMonth);
			map.put("timeYear", Config.getInstall().timeYear);
		}

		File outFile = new File(outFileFullName);

		if (outFile.exists()) {
			if (!(isCoverIfExists)) {
				return;
			}
			if (!(isCoverIfExists))
				;
		} else {
			outFile = FileUtil.makeDirAndFile(outFileFullName);
		}

		Configuration cfg = new Configuration();
		FileOutputStream fos = null;
		try {
			cfg.setDirectoryForTemplateLoading(new File(fileName));

			Template t = cfg.getTemplate(templateFileName, "utf-8");
			fos = new FileOutputStream(new File(outFileFullName));

			t.process(data, new OutputStreamWriter(fos, "utf-8"));

			LOGGER.info("生成文件：【" + outFileFullName + "】");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
   /**
    * 校验成功，返回1，模版不存在，不需要检验返回0，校验失败返回-1
    * @param templateFileName
    * @return
    */
	public static Integer checkValid(String templateFileName) {
		File file = new File(fileName + templateFileName);
		//add by zxp 20171218
		if(!file.exists()) {
			return 0;
		}
		boolean hasEmail = false;
		boolean hasAuthor = false;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				if (line.contains("${email}")) {
					hasEmail = true;
				}
				if (line.contains("${author}")) {
					hasAuthor = true;
				}
				if ((hasEmail) && (hasAuthor)) {
					return 1;
				}
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if( ((hasEmail) && (hasAuthor))) {
			return 1;
		}
		return -1;
	}
}