package com.hzh.nc.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity
public class Interest {
	@Id
	private ObjectId id;
	private String name;
	private Level level = Level.Nomal;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Interest [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
}
