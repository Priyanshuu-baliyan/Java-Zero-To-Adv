package Operators;

public class LogicalOp {
  public static void main(String[] args) {
    System.out.println( (3 > 2) && (4 > 3)); // both true -- true, else false
    System.out.println( (3 > 2) && (4 > 5)); 

    System.out.println( (3 < 2) || (4 > 3)); // if one value is true -- true
    System.out.println( (3 < 2) || (4 > 5));  // both flase -- flase

    System.out.println( !(0>5));
  }
}
