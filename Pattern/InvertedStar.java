package Pattern;

import java.util.Scanner;

public class InvertedStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    for(int i = 1; i <= line; i++){
      for(int j = i; j <= line;  j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();

  }
}
