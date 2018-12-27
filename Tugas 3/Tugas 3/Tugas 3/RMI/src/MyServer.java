import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
  try{
    LocateRegistry.createRegistry(8888);
    Adder stub=new AdderRemote();
    Naming.rebind("rmi://192.168.1.13:8888/testrmi",stub);
  }
  catch(Exception e){
    System.out.println(e);
  }
}
}
