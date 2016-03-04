import static org.junit.Assert.assertNotNull;
import mongo.MongoConnect;

import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoConnectTest {

	@Test
	public void testGetConnection() {
		DB db = new MongoConnect().getConnection("test");
		assertNotNull("Not Null", db);
		System.out.println(db);
		
	}

}
