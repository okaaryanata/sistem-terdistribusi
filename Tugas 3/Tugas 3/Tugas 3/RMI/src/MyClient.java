import java.rmi.*;
import java.util.Scanner;

public class MyClient{

static int x = 1, y = 1;
int pilih;
public static void main(String args[]){
  int pilih;
  try{
    Adder stub=(Adder)Naming.lookup("rmi://192.168.1.13:5000/testrmi");
    Scanner input = new Scanner(System.in);  

     System.out.println("KALKULATOR SEDERHANA");
     System.out.println("1.Tambah");
     System.out.println("2.Kurang");
     System.out.println("3.Kali");
     System.out.println("4.Bagi");
     System.out.print("CHOSE NUMBER = ");
     pilih = input.nextInt();   
     System.out.print("Bilangan Ke 1 = ");
     x = input.nextInt();
     System.out.print("Bilangan Ke 2 = ");
     y = input.nextInt();
          
        switch(pilih){
            case 1:
            System.out.println(stub.tambah(x,y));
            break;
            case 2:
            System.out.println(stub.kurang(x,y));
            break;
            case 3:
            System.out.println(stub.kali(x,y));
            break;
            case 4:
            System.out.println(stub.bagi(x,y));
            break;
        }
    
  }
  catch(Exception e){
  }
}
}
