package Function_And_Methods;

public class FnPrimeNumOrNot {
  // public static boolean isPrime(int n){
  //   //corner casea
  //   //2 
  //   if(n == 2) return true;
  //   for(int i = 2; i<n ; i++){
  //     if(n % i == 0){
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  public static boolean isPrime(int n){
    if(n==2) return true;
    for(int i = 2; i*i <= n; i++){
      if(n % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }
}
