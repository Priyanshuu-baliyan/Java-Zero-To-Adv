package Function_And_Methods.Practice;
import java.util.*;

public class ReadAndCode{
  public static void testCode(int a, int b){
    int c = Math.abs(a);
    int d = Math.min(a, b);
    int e = Math.max(a, b);
    double f = Math.sqrt(b);
    int g = (int) Math.pow(a, b);
    // int h = Math.avg();
    System.out.println("abs: " + c);
    System.out.println("min: " + d);
    System.out.println("max: " + e);
    System.out.println("sqrt: " + f);
    System.out.println("pow: " + g);
    // System.out.println("avg: " + h); there is no avg method in java
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    testCode(a, b);
    sc.close();
  }
}
