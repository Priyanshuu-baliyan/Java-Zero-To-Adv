package Variable_And_DataStructure.Exercise;

import java.util.Scanner;

public class AvgOfThreeNums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your 1st number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter Your 2nd number : ");
    int num2 = sc.nextInt();
    System.out.print("Enter Your 3rd number : ");
    int num3 = sc.nextInt();

    int avg = (num1 + num2 + num3) / 3;
    System.out.println("Average of Three numbers is : " + avg);

    sc.close();
  }
}
