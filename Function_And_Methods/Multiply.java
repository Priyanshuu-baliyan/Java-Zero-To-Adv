package Function_And_Methods;

public class Multiply {

  public static int multiply(int a, int b){
    int product = a * b;
    return product;
  }
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int res = multiply(a, b);
    System.out.println("Product of two number is: " + res);
    res = multiply(20, 5);
    System.out.println("Product of two number is: " + res);
  }
}
