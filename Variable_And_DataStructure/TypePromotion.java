package Variable_And_DataStructure;

import java.util.Scanner;

public class TypePromotion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // char a = 'a';
    // char b = 'b';
    // System.out.println((int)a);
    // System.out.println((int)b);
    // System.out.println(a); // print as it is because type promotions happens with experssion
    // System.out.println(b - a);

    // char c = b - a; error mismatch


    //example 2 
    // short a = 5;
    // byte b = 25;
    // char c = 'c';
    // // byte bt = a + b + c; // error
    // byte bt = (byte) (a + b + c);
    // System.out.println(bt); // yeh answer toh dega pr kuch sense ni banayega 

    //example 3
    int a = 10;
    float b = 20.25f;
    long c = 10;
    double d = 30;
    double ans = a + b + c + d;
    System.out.println(ans);
    sc.close();
  }
}
