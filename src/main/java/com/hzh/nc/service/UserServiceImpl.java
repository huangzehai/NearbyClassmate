package com.hzh.nc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzh.nc.dao.UserDao;
import com.hzh.nc.model.User;

@Service
public class UserServiceImpl implements UserService {
   @Resource
   private UserDao userDao;
	public void addOrSaveUser(User user) {
		userDao.addOrSaveUser(user);
	}

	public void deleteUser(User User) {
		userDao.deleteUser(User);
	}

	public void getUser(String mobile) {
		userDao.getUser(mobile);
	}

}
