package Loops;

import java.util.Scanner;

public class PrintRevNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your num: ");
    int num = sc.nextInt();

    while(num > 0){
      int lastDigit = num % 10;
      System.out.print(lastDigit);
      num /= 10;
    }
    System.out.println();
    sc.close();
  }
}
