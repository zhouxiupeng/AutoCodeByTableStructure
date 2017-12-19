/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model.abstractModel;

import com.code.config.Config;
import com.code.util.StringUtil;

public abstract class AbstractField extends Symbol {
	public String note;
	public String noteMain;
	public String name;
	public String nameFU;
	public String nameAL;
	public String nameAU;
	public String email;
	public String author;
	public String time;
	public String timeDay;
	public String timeMonth;
	public String timeYear;
	public String mybatisParaPrefix = "#{";

	public String mybatisParaSuffix = "}";

	public AbstractField() {
		this.email = Config.getInstall().email;
		this.author = Config.getInstall().author;

		this.time = StringUtil.getFormatTime(System.currentTimeMillis(),
				"yyyy-MM-dd HH:mm:ss");
		this.timeDay = StringUtil.getFormatTime(System.currentTimeMillis(),
				"yyyy-MM-dd");
		this.timeMonth = StringUtil.getFormatTime(System.currentTimeMillis(),
				"yyyy-MM");
		this.timeYear = StringUtil.getFormatTime(System.currentTimeMillis(),
				"yyyy");
	}

	public String getNote() {
		if (this.note == null) {
			this.note = "";
		}
		return this.note;
	}

	public void setNote(String note) {
		if (note == null) {
			note = "";
		}
		this.note = note;

		this.noteMain = StringUtil.getMainStr(note);
	}

	public String getNoteMain() {
		return this.noteMain;
	}

	public void setName(String name) {
		this.name = name;
		this.nameFU = StringUtil.firstToUpperCase(name);
		this.nameAU = name.toUpperCase();
		this.nameAL = name.toLowerCase();
	}

	public String getName() {
		return this.name;
	}

	public String getNameFU() {
		return this.nameFU;
	}

	public String getNameAL() {
		return this.nameAL;
	}

	public String getNameAU() {
		return this.nameAU;
	}

	public String getEmail() {
		return this.email;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getTime() {
		return this.time;
	}

	public String getTimeDay() {
		return this.timeDay;
	}

	public String getTimeMonth() {
		return this.timeMonth;
	}

	public String getTimeYear() {
		return this.timeYear;
	}

	public String getMybatisParaPrefix() {
		return this.mybatisParaPrefix;
	}

	public String getMybatisParaSuffix() {
		return this.mybatisParaSuffix;
	}

	public int hashCode() {
		return this.name.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof AbstractField) {
			AbstractField f = (AbstractField) obj;
			if (getName().equals(f.getName())) {
				return true;
			}
		}
		return false;
	}
}