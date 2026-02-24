package Conditional_Statement;

public class PassOrFail {
  public static void main(String[] args) {
    int marks = 32;
    
    String rc = (marks >= 33) ? "PASS" : "FAIL";
    System.out.println(rc);
  }
}
