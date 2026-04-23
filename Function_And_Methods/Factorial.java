package Function_And_Methods;

public class Factorial {
  public static int factorial(int n){
    int fact = 1;

    for(int i = 1; i<=n; i++){
      fact *= i;
    }
    return fact;
  }
  public static void main(String[] args) {
    // int res = factorial(4);
    // System.out.println("factorial of n is : " + res);
    // res = factorial(5);
    // System.out.println("factorial of n is : " + res);

    System.out.println(factorial(4));
    System.out.println(factorial(6));
  }
}
