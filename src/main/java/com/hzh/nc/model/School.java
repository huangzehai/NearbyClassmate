package com.hzh.nc.model;

import java.util.List;

public class School extends Group {
	public School(String name) {
		super(name);
	}

	private List<Class> classes;
	/** 区别同名学校*/
	private Address address;
}
