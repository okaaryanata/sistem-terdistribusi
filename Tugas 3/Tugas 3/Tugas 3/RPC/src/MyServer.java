import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
  try{
    LocateRegistry.createRegistry(5000);
    Adder stub=new AdderRemote();
    Naming.rebind("rmi://10.20.1.54:5000/testrmi",stub);
  }
  catch(Exception e){
    System.out.println(e);
  }
}
}
