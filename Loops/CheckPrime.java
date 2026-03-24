package Loops;

import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    if (n <= 1) {
      System.out.println(n +" is not Prime number");
    } else {
      boolean isPrime = true;
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) { //(isPrime == true)
        System.out.println(n + " is Prime number");
      } else {
        System.out.println(n + " is not Prime number");
      }
    }
    sc.close();
  }
}
