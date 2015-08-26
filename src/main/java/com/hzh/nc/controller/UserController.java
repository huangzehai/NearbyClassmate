package com.hzh.nc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.hzh.nc.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/get")
	@JsonView(User.class)
	public User get() {
		User user = new User();
		user.setName("Tom");
		return user;
	}
}
