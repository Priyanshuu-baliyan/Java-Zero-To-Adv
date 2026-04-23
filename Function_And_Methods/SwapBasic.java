package Function_And_Methods;

public class SwapBasic {

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 12;
    swap(a, b);

    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
  }
}
