package com.hzh.nc.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Repository;

import com.hzh.nc.dao.persistence.DatastoreHelper;
import com.hzh.nc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	public void addOrSaveUser(User user) {
		Datastore datastore = DatastoreHelper.getDataStore();
		if (user.getFriends() != null) {
			datastore.save(user.getFriends());
		}
		if (user.getSchools() != null) {
			datastore.save(user.getSchools());
		}
		datastore.save(user);
	}

	public void deleteUser(User User) {
		Datastore datastore = DatastoreHelper.getDataStore();
		final Query<User> overPaidQuery = datastore.createQuery(User.class).field("id").equal(User.getId());
		datastore.delete(overPaidQuery);
	}

	public User getUser(String mobile) {
		Datastore datastore = DatastoreHelper.getDataStore();
		final Query<User> query = datastore.createQuery(User.class).field("mobile").equal(mobile);
		return query.get();
	}

}
