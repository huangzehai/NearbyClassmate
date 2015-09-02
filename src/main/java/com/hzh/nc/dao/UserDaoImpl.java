package com.hzh.nc.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Repository;

import com.hzh.nc.dao.persistence.DatastoreHelper;
import com.hzh.nc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	public void addUser(User user) {
		Datastore datastore = DatastoreHelper.getDataStore();
		if (user.getFriends() != null) {
			datastore.save(user.getFriends());
		}
		if (user.getSchools() != null) {
			datastore.save(user.getSchools());
		}
		datastore.save( user);
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

	public void getUser(ObjectId id) {
		// TODO Auto-generated method stub

	}

}
