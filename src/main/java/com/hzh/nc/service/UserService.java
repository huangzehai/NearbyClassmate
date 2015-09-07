package com.hzh.nc.service;

import com.hzh.nc.model.User;

public interface UserService {
	void addOrSaveUser(User user);

	void deleteUser(User User);

	void getUser(String mobile);
}
