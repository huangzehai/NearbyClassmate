package com.hzh.nc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonView;
import com.hzh.nc.model.Response;
import com.hzh.nc.model.School;
import com.hzh.nc.model.Sex;
import com.hzh.nc.model.User;
import com.hzh.nc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/get")
	@JsonView(User.class)
	public User get() {
		User user = new User();
		user.setName("Tom");
		return user;
	}
	
	@RequestMapping("/update")
	@JsonView(User.class)
	public Response update() {
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
		userService.addOrSaveUser(alex);
		return Response.SUCCESS;
	}
}
