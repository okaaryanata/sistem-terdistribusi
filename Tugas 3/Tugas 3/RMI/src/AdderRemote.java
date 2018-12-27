import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder{
  AdderRemote()throws RemoteException{
    super();
  }

  @Override
        public int sum(int x,int y){
          return x+y;
        }
  @Override
        public int subtraction(int x,int y){
          return x-y;
        }
  @Override
        public int multiple(int x,int y){
          return x*y;
        }
  @Override
        public int division(int x,int y){
          return x/y;
        }
}