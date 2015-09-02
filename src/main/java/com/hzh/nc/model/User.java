package com.hzh.nc.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
@Entity
public class User {
	@Id
	private ObjectId id;
	private String name;
	private String nickname;
	/** 头像. */
	private String avatar;
	private Sex sex;
	private Date birthday;
	private Address birthplace;
	private Address currentResidence;
	private String password;
	@Reference(lazy=true)
	private List<Interest> interests;
	private String job;
	@Reference(lazy=true)
	private List<User> friends;
	@Reference(lazy=true)
	private List<School> schools;

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(Address birthplace) {
		this.birthplace = birthplace;
	}

	public Address getCurrentResidence() {
		return currentResidence;
	}

	public void setCurrentResidence(Address currentResidence) {
		this.currentResidence = currentResidence;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Interest> getInterests() {
		return interests;
	}

	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nickname=" + nickname + ", avatar=" + avatar + ", sex=" + sex
				+ ", birthday=" + birthday + ", birthplace=" + birthplace + ", currentResidence=" + currentResidence
				+ ", password=" + password + ", interests=" + interests + ", job=" + job + ", friends=" + friends + "]";
	}

}
