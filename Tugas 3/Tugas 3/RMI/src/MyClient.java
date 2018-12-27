import java.rmi.*;
import java.util.Scanner;

public class MyClient{

static int x = 1, y = 1;
public static void main(String args[]){
  try{
    Adder stub=(Adder)Naming.lookup("rmi://10.20.1.54:8888/testrmi");
    Scanner input = new Scanner(System.in);  

     System.out.println("KALKULATOR SEDERHANA");
     System.out.println("1.sum");
     System.out.println("2.subtraction");
     System.out.println("3.multiple");
     System.out.println("4.division");
     System.out.print("CHOSE NUMBER = ");
     int chose = input.nextInt();   
     System.out.print("Bilangan Ke 1 = ");
     x = input.nextInt();
     System.out.print("Bilangan Ke 2 = ");
     y = input.nextInt();
          
        switch(chose){
            case 1:
            System.out.println(stub.sum(x,y));
            break;
            case 2:
            System.out.println(stub.subtraction(x,y));
            break;
            case 3:
            System.out.println(stub.multiple(x,y));
            break;
            case 4:
            System.out.println(stub.division(x,y));
            break;
        }
    
  }
  catch(Exception e){
  }
}
}
