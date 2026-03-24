package Loops;
import java.util.*;
public class DisplayNumExceptProd10 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      if(n % 10 == 0){
        continue;
      }
      System.out.println("Number was: " + n);
    }
  }
}
