package Conditional_Statement;

import java.util.Scanner;

public class If_Else {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Age : ");
    int age = sc.nextInt();

    if(age >= 18){
      System.out.println("Adult : You can Vote, Drive");
    }
    if(age > 13 && age < 18){
      System.out.println("Teenager");
    }
    else {
      System.out.println("Not Adult");
    }
    sc.close();
  }
}
