import java.rmi.*;
public interface Adder extends Remote{
public int tambah(int x,int y)throws RemoteException;
public int kurang(int x,int y)throws RemoteException;
public int kali(int x,int y)throws RemoteException;
public int bagi(int x,int y)throws RemoteException;
} 