/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.config;

import java.io.Serializable;

public class CoderConfig implements Serializable {
	private String type;
	private String method;
	private String tempFile;
	private boolean isWriteToProject;
	private String outFilePath;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTempFile() {
		return this.tempFile;
	}

	public void setTempFile(String tempFile) {
		this.tempFile = tempFile;
	}

	public boolean isWriteToProject() {
		return this.isWriteToProject;
	}

	public void setWriteToProject(boolean isWriteToProject) {
		this.isWriteToProject = isWriteToProject;
	}

	public String getOutFilePath() {
		return this.outFilePath;
	}

	public void setOutFilePath(String outFilePath) {
		this.outFilePath = outFilePath;
	}
}