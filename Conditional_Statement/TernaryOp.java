package Conditional_Statement;

public class TernaryOp {
  public static void main(String[] args) {
    int num = 5; //4
    String type = ((num % 2) == 0) ? "Even" : "Odd";
    System.out.println(type);
  }
}
