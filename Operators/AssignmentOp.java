package Operators;

public class AssignmentOp {
  public static void main(String[] args) {
    int A = 10;
    A += 10; // A = A + 10;
    System.out.println(A);

    int B = 5;
    B -= 5; // B = B - 5;
    System.out.println(B);

    int C = 5;
    C *= 5; // C = C * 5;
    System.out.println(C);

    int D = 10;
    D /= 2; // D = D / 2;
    System.out.println(D);

    int E = 10;
    E %= 5; // E = E % 2;
    System.out.println(E);
  }
}
