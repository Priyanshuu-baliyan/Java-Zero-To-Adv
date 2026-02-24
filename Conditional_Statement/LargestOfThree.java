package Conditional_Statement;
import java.util.*;
public class LargestOfThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value of A: ");
    int A = sc.nextInt();
    System.out.print("Enter a value of B: ");
    int B = sc.nextInt();
    System.out.print("Enter a value of C: ");
    int C = sc.nextInt();

    if((A >= B) && (A >=C)){
      System.out.println("Largest of 3 is A");
    }
    else if(B >= C){
      System.out.println("Largest of 3 is B");
    }
    else {
      System.out.println("Largest of 3 is C");
    }
    sc.close();
  }
}
