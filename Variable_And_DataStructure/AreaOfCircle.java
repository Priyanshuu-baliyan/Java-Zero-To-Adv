package Variable_And_DataStructure;
import java.util.*;
public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a radius of circle : ");
    float rad = sc.nextFloat();
    float pi = 3.14f;
    
    float area = pi * rad * rad;
    System.out.println("Area of circle is : " + area);
    sc.close();
  }
}
