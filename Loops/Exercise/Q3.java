package Loops.Exercise;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the any positive integer number: ");
    int n = sc.nextInt();
    int fact = 1;
    if(n == 0 || n == 1){
      fact = 1;
    }
    for (int i = 2; i <= n; i++) {
      fact *= i;
    }
    System.out.println( n + " Factorial is : " + fact);
    sc.close();
  }

}
