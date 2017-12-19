/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.log;

import java.io.PrintStream;
import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogStart {
	private static final Logger LOGGER = LoggerFactory.getLogger("LogStart");

	static {
		System.out.println("开始初始化log4j...");

		DOMConfigurator.configure("conf/log4j.xml");
		LOGGER.info("log4j初始化成功...");
	}
}