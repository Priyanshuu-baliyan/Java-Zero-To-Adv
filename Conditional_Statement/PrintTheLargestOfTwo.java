package Conditional_Statement;

import java.util.Scanner;

public class PrintTheLargestOfTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Value of A : ");
    int A = sc.nextInt();
    System.out.print("Enter a Value of B : ");
    int B = sc.nextInt();

    if(A >= B){
      System.out.println("A is the lagest of 2");
    } else {
      System.out.println("B is the largest of 2");
    }
    sc.close();
  }
}
