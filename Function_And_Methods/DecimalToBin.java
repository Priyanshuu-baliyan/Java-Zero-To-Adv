package Function_And_Methods;

public class DecimalToBin {
  public static void decToBin(int n){
    int bin = 0;
    int pow = 1; 
    while(n > 0){
      int rem = n % 2; 
      bin = bin + (rem * pow);
      pow *= 10;
      n /= 2;
    }
    System.out.println("Dec to Bin: " + bin);
  }
  public static void main(String[] args) {
    decToBin(15); 
  }

}
