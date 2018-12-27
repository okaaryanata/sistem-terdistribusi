import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder{
  AdderRemote()throws RemoteException{
    super();
  }

  @Override
        public int tambah(int x,int y){
          return x+y;
        }
  @Override
        public int kurang(int x,int y){
          return x-y;
        }
  @Override
        public int kali(int x,int y){
          return x*y;
        }
  @Override
        public int bagi(int x,int y){
          return x/y;
        }
}