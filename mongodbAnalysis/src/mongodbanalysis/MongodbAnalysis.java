package mongodbanalysis;

import java.net.UnknownHostException;

public class MongodbAnalysis {

    public static void main(String[] args) throws UnknownHostException {
        //TODO code application logic here
         mongoAnalysis mongo = new mongoAnalysis();
         //mongo.delete1000();
         //mongo.insert1000();
         //mongo.insert200();
         //mongo.delete200();
         
        //System.out.println("<<RetrievedwithoutConnection>>");
        //mongo.average1000connection();
        mongo.average1000interfunction();
        

    }
}
