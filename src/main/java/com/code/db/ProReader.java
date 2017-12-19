/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.db;

import com.code.config.Config;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

public class ProReader {
	private Properties properties = null;
	private static ProReader instance = null;

	public static synchronized ProReader getInstance() {
		if (instance == null) {
			instance = new ProReader();
		}
		return instance;
	}

	private ProReader() {
		try {
			this.properties = new Properties();
			InputStream is = new FileInputStream(Config.getInstall().configPath
					+ "jdbc.properties");
			this.properties.load(is);
		} catch (IOException e) {
			System.err.println("读取属性文件失败，请确认文件是否存在！");
		}
	}

	public String getProperty(String key) {
		return this.properties.getProperty(key);
	}

	public static void main(String[] args) {
		System.out.println(getInstance().getProperty("database.url"));
	}
}