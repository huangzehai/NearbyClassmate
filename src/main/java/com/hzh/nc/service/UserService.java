package com.hzh.nc.service;

import com.hzh.nc.model.User;

public interface UserService {
	void addUser(User user);

	void updateUser(User user);

	void deleteUser(User User);

	void getUser(String mobile);

	void getUser(long id);
}
