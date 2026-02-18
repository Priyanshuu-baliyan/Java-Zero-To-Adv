package Variable_And_DataStructure;

import java.util.*;
public class Product_Of_Two_Nums {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your num1: ");
    int num1 = sc.nextInt();

    System.out.print("Enter your num2: ");
    int num2 = sc.nextInt();

    int prod = num1 * num2;
    System.out.println("Product of your numbers is : " + prod);

    sc.close();
  }
}
