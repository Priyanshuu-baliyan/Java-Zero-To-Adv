package Function_And_Methods;

import java.util.Scanner;

public class FnOverloading {
  
  public static int sum (int a, int b){
    return a + b;
  }

  public static int sum (int a, int b, int c){
    return a + b + c;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum of 2 number is: " + (sum(a, b)));
    int c = sc.nextInt();
    System.out.println("Sum of 3 number is: " + (sum(a, b, c)));
    sc.close();
  }
}
