package mongodbanalysis;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mongoAnalysis {

    public mongoAnalysis() {
    }

    public void insert1000() throws UnknownHostException {
        LocalTime startedTime = LocalTime.now();
        System.out.println(startedTime);
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("jericho");
            DBCollection collection = db.getCollection("insert1000");
            for (int i = 1; i < 1001; i++) {
                BasicDBObject insert1000 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(insert1000);
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime);
    }

    public void delete1000() throws UnknownHostException {
        LocalTime startedTime = LocalTime.now();
        System.out.println(startedTime);
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("jericho");
            System.out.println("Connected to database!");
            DBCollection collection = db.getCollection("insert1000");

            for (int i = 1; i < 1001; i++) {
                BasicDBObject delete1000 = new BasicDBObject("col1", i);
                //query.append("age", 25);
                collection.remove(delete1000);
                System.out.println("Suuccessfully deleted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error connecting to database!");
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime);
    }

    public void insert200() throws UnknownHostException {
        LocalTime startedTime = LocalTime.now();
        System.out.println(startedTime);
        try {
            for (int i = 1; i < 201; i++) {
                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
                mongoLogger.setLevel(Level.SEVERE);
                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("jericho");
                DBCollection collection = db.getCollection("insert200");
                BasicDBObject insert200 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(insert200);
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime);
    }

    public void delete200() throws UnknownHostException {
        LocalTime startedTime = LocalTime.now();
        System.out.println(startedTime);
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("jericho");
            System.out.println("Connected to database!");
            DBCollection collection = db.getCollection("insert200");

            for (int i = 1; i < 1001; i++) {
                BasicDBObject delete1000 = new BasicDBObject("col1", i);
                //query.append("age", 25);
                collection.remove(delete1000);
                System.out.println("Suuccessfully deleted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error connecting to database!");
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime);
    }

    public void average1000connection() throws UnknownHostException {
//        LocalTime startedTime = LocalTime.now();
//        System.out.println("Started:" + startedTime);
//        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
//        mongoLogger.setLevel(Level.SEVERE);
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//        DB db = mongoClient.getDB("jericho");
//        //DBCollection collection = db.getCollection("mongoanalysis");
//        DBCollection coll = db.getCollection("insert1000");
//        System.out.println("Collection has selected successfully");
//        DBCursor cursor = coll.find();
//        DBObject dbo = coll.findOne("_id");
//        int index = 1;
//        while (cursor.hasNext()) {
//            //String id= (String) dbo.get("_id");
//            int col1 = (int) dbo.get("$col1");
//            //int col2= (int) dbo.get("col2");
//            System.out.println(col1);
//            //System.out.println("Inserted Document: " + index);
//            //System.out.println(cursor.next());
//            index++;
//        }
//        LocalTime endTime = LocalTime.now();
//        System.out.println("Ended:" + endTime);
        LocalTime startedTime = LocalTime.now();
        System.out.println("Started:" + startedTime);
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("jericho");
        //DBCollection collection = db.getCollection("mongoanalysis");
        DBCollection coll = db.getCollection("insert1000");

        System.out.println("Collection has selected successfully");
        DBCursor cursor = coll.find();
        DBObject dbo = coll.findOne();
        int index = 1;
        while (cursor.hasNext()) {
            String id = (String) dbo.get("_id");
            int col1 = (int) dbo.get("col1");
            int col2 = (int) dbo.get("col2");
            System.out.println("COL1:" + col1);
            //System.out.println("Inserted Document: " + index);
            System.out.println(cursor.next());
            index++;
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("Ended:" + endTime);
    }

    public void average1000interfunction() throws UnknownHostException {
        LocalTime startedTime = LocalTime.now();
        System.out.println(startedTime);
//        try {
//            int start = 1;
//            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
//            mongoLogger.setLevel(Level.SEVERE);
//            MongoClient mongoClient = new MongoClient("localhost", 27017);
//            DB db = mongoClient.getDB("jericho");
//            System.out.println("Connected to database!");
//            DBObject groupFields = new BasicDBObject("_id", null);
//            groupFields.put("Average", new BasicDBObject("$avg", "$col1"));
//            DBObject group = new BasicDBObject("$group", groupFields);
//            AggregationOutput output = db.getCollection("insert1000").aggregate(group);
//            Iterable<DBObject> list = output.results();
//            for (int i = 1; i < 6; i++) {
//                System.out.println(list);
//            }
//
//        } catch (SecurityException e) {
//            System.out.println(e);
//        }

        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to database!");
            for (int i = 1; i < 6; i++) {
//                DBObject groupFields = new BasicDBObject("_id", null);
//                groupFields.put("Average", new BasicDBObject("$avg", "$col" + i));
//                DBObject group = new BasicDBObject("$group", groupFields);
//                AggregationOutput output = db.getCollection("sqltesting").aggregate(group);
//                Iterable<DBObject> list = output.results();
//                System.out.println(list);
                DBObject groupFields = new BasicDBObject("_id", null);
                groupFields.put("col1", new BasicDBObject("$avg", "$col1"));
                DBObject group = new BasicDBObject("$group", groupFields);
                AggregationOutput output = db.getCollection("insert1000").aggregate(group);
                Iterable<DBObject> list = output.results();
//                while(list.iterator().hasNext()) {
//                    System.out.println(list.iterator().next());
//                }
                System.out.println("List:" + list);
            }
        } catch (SecurityException e) {
            System.out.println(e);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("Ended:" + endTime);
    }
}
