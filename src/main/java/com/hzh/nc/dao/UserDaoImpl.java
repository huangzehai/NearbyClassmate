package com.hzh.nc.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hzh.nc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private Datastore datastore;
	
	public void addOrSaveUser(User user) {
		if (user.getFriends() != null) {
			datastore.save(user.getFriends());
		}
		if (user.getSchools() != null) {
			datastore.save(user.getSchools());
		}
		datastore.save(user);
	}

	public void deleteUser(User User) {
		final Query<User> overPaidQuery = datastore.createQuery(User.class).field("id").equal(User.getId());
		datastore.delete(overPaidQuery);
	}

	public User getUser(String mobile) {
		final Query<User> query = datastore.createQuery(User.class).field("mobile").equal(mobile);
		return query.get();
	}

}
