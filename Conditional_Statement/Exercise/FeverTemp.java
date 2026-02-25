package Conditional_Statement.Exercise;

import java.util.Scanner;

public class FeverTemp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a temp : ");
    double temp = sc.nextDouble();

    if(temp > 100){
      System.out.println("You have a fever");
    }
    else{
      System.out.println("Your temp is normal");
    }
    sc.close();
  }
}
