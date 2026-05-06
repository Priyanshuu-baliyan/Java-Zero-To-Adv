package Function_And_Methods.Practice;

public class CheckEven {
  public static boolean isEven(int num){
    return num % 2 == 0;
  }
  public static void main(String[] args) {
    int testNum = 5;

    if(isEven(testNum)){
      System.out.println( testNum +" is Even");
    } else {
      System.out.println( testNum +" is odd");
    }
  }
}
