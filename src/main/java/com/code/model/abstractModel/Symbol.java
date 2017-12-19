/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model.abstractModel;

public abstract class Symbol extends AbstractObject {
	public String fenHao;
	public String maoHao;
	public String douHao;
	public String shuXian;
	public String xiaHuaXian;
	public String jianHao;
	public String jingHao;
	public String meiYuanFuHao;
	public String zuoZhongKuoHao;
	public String youZhongKuoHao;
	public String zuoDaKuoHao;
	public String youDaKuoHao;
	public String at;

	public Symbol() {
		this.fenHao = ";";

		this.maoHao = ":";

		this.douHao = ",";

		this.shuXian = "|";

		this.xiaHuaXian = "_";

		this.jianHao = "-";

		this.jingHao = "#";

		this.meiYuanFuHao = "$";

		this.zuoZhongKuoHao = "[";

		this.youZhongKuoHao = "]";

		this.zuoDaKuoHao = "{";

		this.youDaKuoHao = "}";

		this.at = "@";
	}

	public String getFenHao() {
		return this.fenHao;
	}

	public void setFenHao(String fenHao) {
		this.fenHao = fenHao;
	}

	public String getMaoHao() {
		return this.maoHao;
	}

	public void setMaoHao(String maoHao) {
		this.maoHao = maoHao;
	}

	public String getDouHao() {
		return this.douHao;
	}

	public void setDouHao(String douHao) {
		this.douHao = douHao;
	}

	public String getShuXian() {
		return this.shuXian;
	}

	public void setShuXian(String shuXian) {
		this.shuXian = shuXian;
	}

	public String getXiaHuaXian() {
		return this.xiaHuaXian;
	}

	public void setXiaHuaXian(String xiaHuaXian) {
		this.xiaHuaXian = xiaHuaXian;
	}

	public String getJianHao() {
		return this.jianHao;
	}

	public void setJianHao(String jianHao) {
		this.jianHao = jianHao;
	}

	public String getJingHao() {
		return this.jingHao;
	}

	public void setJingHao(String jingHao) {
		this.jingHao = jingHao;
	}

	public String getMeiYuanFuHao() {
		return this.meiYuanFuHao;
	}

	public void setMeiYuanFuHao(String meiYuanFuHao) {
		this.meiYuanFuHao = meiYuanFuHao;
	}

	public String getZuoZhongKuoHao() {
		return this.zuoZhongKuoHao;
	}

	public void setZuoZhongKuoHao(String zuoZhongKuoHao) {
		this.zuoZhongKuoHao = zuoZhongKuoHao;
	}

	public String getYouZhongKuoHao() {
		return this.youZhongKuoHao;
	}

	public void setYouZhongKuoHao(String youZhongKuoHao) {
		this.youZhongKuoHao = youZhongKuoHao;
	}

	public String getZuoDaKuoHao() {
		return this.zuoDaKuoHao;
	}

	public void setZuoDaKuoHao(String zuoDaKuoHao) {
		this.zuoDaKuoHao = zuoDaKuoHao;
	}

	public String getYouDaKuoHao() {
		return this.youDaKuoHao;
	}

	public void setYouDaKuoHao(String youDaKuoHao) {
		this.youDaKuoHao = youDaKuoHao;
	}

	public String getAt() {
		return this.at;
	}

	public void setAt(String at) {
		this.at = at;
	}
}