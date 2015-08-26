package com.hzh.nc.model;

import java.util.Date;
import java.util.List;

public class User {
	private long id;
	private String name;
	private String nickname;
	/** Í·Ïñ. */
	private String avatar;
	private Sex sex;
	private Date birthday;
	private Address birthplace;
	private Address currentResidence;
	private String password;
	private List<Interest> interests;
	private String job;
	// friend's id.
	private List<User> friends;

}
