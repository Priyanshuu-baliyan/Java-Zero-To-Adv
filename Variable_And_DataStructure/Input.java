package Variable_And_DataStructure;
import java.util.*;
public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Input here : ");

    // String ip =  sc.next();
    // System.out.println("Your output is : " + ip);

    // String name = sc.nextLine();
    // System.out.println("Your output is : " + name); 

    int num = sc.nextInt();
    System.out.println("Your output is : " + num); 
    
    System.out.print("Enter your Input here : "); 
    float price = sc.nextFloat();
    System.out.println("Your output is : " + price); 

    System.out.print("Enter your Input here : "); 
    double price2= sc.nextDouble();
    System.out.println("Your output is : " + price2); 

    System.out.print("Enter your Input here : "); 
    boolean val= sc.nextBoolean();
    System.out.println("Your output is : " + val); 

    System.out.print("Enter your Input here : "); 
    short n = sc.nextShort();
    System.out.println("Your output is : " + n); 

    System.out.print("Enter your Input here : "); 
    byte x = sc.nextByte();
    System.out.println("Your output is : " + x); 
    sc.close();
  }
}
