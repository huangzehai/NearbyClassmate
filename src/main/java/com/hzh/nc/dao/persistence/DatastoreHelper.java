package com.hzh.nc.dao.persistence;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
@Configuration
public class DatastoreHelper {
	private static final String MODEL_PACKAGE="com.hzh.nc.model";
	private static final String DB="classmate";
	private static  Datastore dataStore;
	
	@Bean
	public static Datastore getDataStore(){
		if(dataStore==null){
			final Morphia morphia = new Morphia();
			// tell Morphia where to find your classes
			// can be called multiple times with different packages or classes
			morphia.mapPackage(MODEL_PACKAGE);
			// create the Datastore connecting to the default port on the local host
			dataStore = morphia.createDatastore(new MongoClient("localhost"), DB);
//			datastore.ensureIndexes();
		}
		return dataStore;
		
	}
	

}
