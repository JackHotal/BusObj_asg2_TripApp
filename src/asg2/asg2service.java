package asg2;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import dblib.Database;
import java.util.List;

@WebService()
public class asg2service {

  Database db;

  public asg2service() {  db = new Database("ism6236","ism6236bo");  }

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }


  @WebMethod
  public String[] book(String cid, float com, List<String> segList) {
    return db.book(cid, com, segList);
  }

  @WebMethod
  public List<String> List(String cid)  {
    return db.List(cid);
  }

  @WebMethod
  public List<String> getCustomerTrips(String tid)  {
    return db.getCustomerTrips(tid);
  }

  @WebMethod
  public String List1(String tidE, String oidE) { return db.List(tidE, oidE); }

  @WebMethod
  public int edit(String tidE, String oidE, String priceE) { return db.edit(tidE, oidE, priceE); }

  public static void main(String[] argv) {
    Object implementor = new asg2service ();
    String address = "http://localhost:9000/asg2_service";
    Endpoint.publish(address, implementor);
  }
}
