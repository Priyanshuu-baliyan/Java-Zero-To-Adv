package Function_And_Methods;

public class FnOverUsingDT {
  public static int sum(int a, int b){
    return a + b;
  }
  public static float sum(float a, float b){
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println(sum(10, 10));
    System.out.println(sum(1.5f, 8.70f));
  }
}
