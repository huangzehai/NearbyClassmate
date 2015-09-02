package com.hzh.nc.dao;

import org.bson.types.ObjectId;

import com.hzh.nc.model.User;

public interface UserDao {
   void addUser(User user);
   void updateUser(User user);
   void deleteUser(User User);
   void getUser(String mobile);
   void getUser(ObjectId id);
}
