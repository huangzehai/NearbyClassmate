package com.hzh.nc.model;

import java.util.List;

public class Class extends Group {
	/** ��ѧ���. */
	private int entranceYear;
	private List<User> students;

	public Class(String name, int year) {
		super(name);
		this.entranceYear = year;
	}

	public int getEntranceYear() {
		return entranceYear;
	}

	public void setEntranceYear(int entranceYear) {
		this.entranceYear = entranceYear;
	}

	public List<User> getStudents() {
		return students;
	}

	public void setStudents(List<User> students) {
		this.students = students;
	}
}
