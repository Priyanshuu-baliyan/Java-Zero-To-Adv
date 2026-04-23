package Function_And_Methods;


public class BinomialCoefficient {
  public static int binomialCoe(int n, int r){
    int n_fact = Factorial.factorial(n);
    int r_fact = Factorial.factorial(r);
    int nmr_fact = Factorial.factorial(n-r);

    int bc = n_fact / (r_fact * nmr_fact);
    return bc;

  }
  public static void main(String[] args) {
    System.out.println(binomialCoe(5, 2));
  }
}
