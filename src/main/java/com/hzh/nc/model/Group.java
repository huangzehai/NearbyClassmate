package com.hzh.nc.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class Group {
	@Id
	private ObjectId id;
	private String name;
	private String icon;
	private List<Activity> activities;

	public Group(String name) {
		this.name = name;
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

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", icon=" + icon + ", activities=" + activities + "]";
	}
}
