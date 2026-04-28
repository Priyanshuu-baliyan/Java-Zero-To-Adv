package Function_And_Methods;

public class BinToDec {
  public static void binDecimal(int n){
    int pow = 0;
    int decimal = 0;
    while(n > 0){
      int lastdigit = n % 10;
      if(lastdigit != 0 && lastdigit != 1){
      System.out.println("Invalid Binary Number");
    }
      decimal = decimal + (lastdigit * (int)Math.pow(2, pow));
      pow++;
      n /= 10; 
    }
    System.out.println("Decimal number of binary number is " + decimal);
    
  }
  public static void main(String[] args) {
    binDecimal(1011);
  }
}
