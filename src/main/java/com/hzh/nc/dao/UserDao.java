package com.hzh.nc.dao;

import com.hzh.nc.model.User;

public interface UserDao {
   void addOrSaveUser(User user);
   void deleteUser(User User);
   User getUser(String mobile);
}
