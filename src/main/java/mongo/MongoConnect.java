package mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnect {

	private DB db;
	
	public DB getConnection(String dbName){
//		if (db != null){
//			return db;
//		}
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			db = mongoClient.getDB(dbName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return db;
	}
	
}
