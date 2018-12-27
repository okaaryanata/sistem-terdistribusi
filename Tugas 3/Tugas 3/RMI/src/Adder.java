import java.rmi.*;
public interface Adder extends Remote{
public int sum(int x,int y)throws RemoteException;
public int subtraction(int x,int y)throws RemoteException;
public int multiple(int x,int y)throws RemoteException;
public int division(int x,int y)throws RemoteException;
} 