package com.hzh.nc.model;

public class Interest {
	private String name;
	private Level level = Level.Nomal;

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
		return "Interest [name=" + name + ", level=" + level + "]";
	}
}
