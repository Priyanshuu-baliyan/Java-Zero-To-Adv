package Function_And_Methods;

import java.util.Scanner;

public class FnWithPara {
  public static int sumNum(int a, int b){ //parameters or formal parameter
    int sum = a + b;
    return sum;
  }
  // public static void calcSum(){ // without parameter  
  //   Scanner sc = new Scanner(System.in);
  //   int a = sc.nextInt();
  //   int b = sc.nextInt();
  //   int sum = a + b;
  //   System.out.println("sum is : " + sum);
  //   sc.close();
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = sumNum(a, b); // arguments or actual parameter 
    
    System.out.println("Sum of two number is :" + result);
    sc.close(); 
  }
  
}
