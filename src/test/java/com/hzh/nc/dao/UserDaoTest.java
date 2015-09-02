package com.hzh.nc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.hzh.nc.model.School;
import com.hzh.nc.model.Sex;
import com.hzh.nc.model.User;


public class UserDaoTest {
 private UserDao userDao=new UserDaoImpl();
	@Test
	public void testAddUser() {
		User alex =new User();
		alex.setName("Alex");
		alex.setJob("Software engineer");
		alex.setSex(Sex.Male);
		alex.setBirthday(new Date());
		alex.setMobile("18655559999");
		
		User kate=new User();
		kate.setName("Kate");
		List<User> friends=new ArrayList<>();
		friends.add(kate);
		alex.setFriends(friends);
		
		School school=new School("ZUST");
		List<School> schools=new ArrayList<>();
		schools.add(school);
		alex.setSchools(schools);
		userDao.addOrSaveUser(alex);
	}
	
	@Test
	public void testGetUser(){
		String mobile="18655559999";
		User user=userDao.getUser(mobile);
		Assert.assertNotNull("User should not be null.",user);
		Assert.assertEquals("Alex", user.getName());
	}
	
	@Test
	public void testDeleteUser(){
		String mobile="18655559999";
		User user=userDao.getUser(mobile);
		userDao.deleteUser(user);
	}

}
