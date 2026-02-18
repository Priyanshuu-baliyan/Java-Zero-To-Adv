package Variable_And_DataStructure;

import java.util.Scanner;

public class TypeConversion {
  public static void main(String[] args) {
    // int a = 25;
    // long b = a;  // work fine
    // System.out.println(b);

    // long a = 25;
    // int b = a;
    // System.out.println(b);  // error because destination < source type : lossy conversion

    Scanner sc = new Scanner(System.in);
    // int a = sc.nextFloat();
    // System.out.println(a);
    float a = sc.nextInt();
    System.out.println(a);
    sc.close();
  }
}
