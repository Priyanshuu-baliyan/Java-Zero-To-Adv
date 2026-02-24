package Operators.Exercise;

public class Q1 {
  public static void main(String[] args) {
    int x = 2 , y = 5;

    int exp1 = (x * y / x); // L to R
    int exp2 = (x *( y / x)); // bracket then multiply

    System.out.print(exp1 + " , ");
    System.out.print(exp2);
  }
}
