package com.hzh.nc.dao;

import com.hzh.nc.model.User;

public interface UserDao {
   void addUser(User user);
   void updateUser(User user);
   void deleteUser(User User);
   void getUser(String mobile);
   void getUser(long id);
}
