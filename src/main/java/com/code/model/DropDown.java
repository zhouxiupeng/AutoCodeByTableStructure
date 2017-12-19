/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.model;

import com.code.model.abstractModel.AbstractObject;

public class DropDown extends AbstractObject {
	private int id;
	private String name;
	private int index;
	private DropDown next;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public DropDown getNext() {
		return this.next;
	}

	public void setNext(DropDown next) {
		this.next = next;
	}
}