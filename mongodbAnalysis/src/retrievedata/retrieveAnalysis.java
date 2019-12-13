

package retrievedata;

import mongodbanalysis.*;
import java.net.UnknownHostException;

public class retrieveAnalysis {


    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
 	mongoAnalysis mongo=new mongoAnalysis();
        //mongo.insert1000();
        mongo.insert200();
    }
}
