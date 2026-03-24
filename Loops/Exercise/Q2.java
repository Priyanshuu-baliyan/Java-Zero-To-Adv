package Loops.Exercise;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int evenSum = 0;
    int oddSum = 0;
    System.out.print("Enter a target input: ");
    int t = sc.nextInt();
    // while (t > 0) {
    //   System.out.print("Enter a number : ");
    //   int n = sc.nextInt();
    //   if (n % 2 == 0) {
    //     evenSum += n;
    //   } else {
    //     oddSum += n;
    //   }
    //   t--;
    // }

    for(int i = 0; i < t; i++){
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if (n % 2 == 0) {
        evenSum += n;
      } else {
        oddSum += n;
      }
    }
    System.out.println("E:" + evenSum);
    System.out.println("O:" + oddSum);
    sc.close();
  }
}
