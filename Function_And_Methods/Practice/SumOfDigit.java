package Function_And_Methods.Practice;

import java.util.Scanner;

public class SumOfDigit {
  public static int sumDigit(int num){
    int sum = 0;
    while(num > 0){
      int lastDigit = num % 10;
      sum += lastDigit;
      num /= 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = sc.nextInt();
    System.out.println(sumDigit(num));
    sc.close();
  }
}
