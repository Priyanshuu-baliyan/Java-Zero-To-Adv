package Variable_And_DataStructure;

import java.util.*;
public class Sum_Through_UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your num1: ");
    int a = sc.nextInt();
    System.out.print("Enter your num2: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Sum of a & b is : " + sum);
    sc.close();
  }
}