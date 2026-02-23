package Operators;

import java.util.Scanner;

public class RelationalOp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Value: ");
    int a = sc.nextInt();
    System.out.print("Enter a Value: ");
    int b = sc.nextInt();

    System.out.println("a == b " + (a == b));
    System.out.println("a != b " + (a != b));
    System.out.println("a >= b " + (a >= b));
    System.out.println("a <= b " + (a <= b));
    System.out.println("a > b " + (a > b));
    System.out.println("a < b " + (a < b));
    sc.close();
  }
}
