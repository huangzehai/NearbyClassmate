package com.hzh.nc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzh.nc.dao.UserDao;
import com.hzh.nc.model.User;

@Service
public class UserServiceImpl implements UserService {
   @Resource
   private UserDao userDao;
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User User) {
		// TODO Auto-generated method stub
		
	}

	public void getUser(String mobile) {
		// TODO Auto-generated method stub
		
	}

	public void getUser(long id) {
		// TODO Auto-generated method stub
		
	}

}
