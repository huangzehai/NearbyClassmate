package com.hzh.nc.model;

public class Group {
    private String name;
    private String icon;
    public Group(String name){
    	this.name=name;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Group [name=" + name + ", icon=" + icon + "]";
	}
}
