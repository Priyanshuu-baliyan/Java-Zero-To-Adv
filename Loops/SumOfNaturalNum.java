package Loops;

import java.util.Scanner;

public class SumOfNaturalNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a natural num : ");
    int N = sc.nextInt();
    int sum = 0;
    int i = 1;
    while(i <= N){
      sum += i;
      i++;
    }
    System.out.println("Sum of " + N + " Natural number is : " +  sum);
    sc.close();
  }
}
