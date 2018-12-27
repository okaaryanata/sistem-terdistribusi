import java.util.*;
import org.apache.xmlrpc.*;


public class JavaClient {
   public static void main (String [] args) {
   
      try {
         XmlRpcClient server = new XmlRpcClient("http://localhost:8888/RPC2"); 
         Vector params = new Vector();
         
         params.addElement(new Integer(17));
         params.addElement(new Integer(13));

         Object result = server.execute("sample.sum", params);

         int sum = ((Integer) result).intValue();
         System.out.println("The sum is: "+ sum);

      } catch (Exception exception) {
         System.err.println("JavaClient: " + exception);
      }
   }
}
