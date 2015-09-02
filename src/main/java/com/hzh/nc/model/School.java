package com.hzh.nc.model;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;
@Entity
public class School extends Group {
	public School(String name) {
		super(name);
	}

	private List<Class> classes;
    /** 通过地址区分同名学校.*/
	private Address address;
	
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [classes=" + classes + ", address=" + address + "]";
	}
	
}
