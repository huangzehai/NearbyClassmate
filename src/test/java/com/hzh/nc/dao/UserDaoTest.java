package com.hzh.nc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.hzh.nc.model.School;
import com.hzh.nc.model.Sex;
import com.hzh.nc.model.User;

public class UserDaoTest {

	@Test
	public void testAddUser() {
		UserDao userDao=new UserDaoImpl();
		User alex =new User();
		alex.setName("Alex");
		alex.setJob("Software engineer");
		alex.setSex(Sex.Male);
		alex.setBirthday(new Date());
		
		User kate=new User();
		kate.setName("Kate");
		List<User> friends=new ArrayList<>();
		friends.add(kate);
		alex.setFriends(friends);
		
		School school=new School("ZUST");
		List<School> schools=new ArrayList<>();
		schools.add(school);
		alex.setSchools(schools);
		userDao.addUser(alex);
	}

}
