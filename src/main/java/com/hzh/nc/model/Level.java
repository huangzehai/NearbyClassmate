package com.hzh.nc.model;

public enum Level {
	Hate(1), Dislike(2), Nomal(3), LIKE(4), Favorite(5);
	private int value;
	Level(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
