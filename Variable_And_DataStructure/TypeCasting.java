package Variable_And_DataStructure;
import java.util.*;
public class TypeCasting {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // float a = 25.5f;  // error
    // int b = a;
    
    // float a = 25.956f;
    // int  b = (int) a;
    // System.out.println(b); // correct

    // float marks = sc.nextFloat();
    // int marks2 = (int) marks;
    // System.out.println(marks2);

    char ch1 = 'a';
    char ch2 = 'A';
    int num1 = ch1;
    int num2 = ch2;

    System.out.println(num1);
    System.out.println(num2);

    sc.close();
  }
}
