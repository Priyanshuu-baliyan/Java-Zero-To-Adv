package Loops.Exercise;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int evenSum = 0;
    int oddSum = 0;
    System.out.print("Enter a target input: ");
    int t = sc.nextInt();
    // while (t > 0) {
    //   System.out.print("Enter a number : ");
    //   int n = sc.nextInt();
    //   if (n % 2 == 0) {
    //     evenSum += n;
    //   } else {
    //     oddSum += n;
    //   }
    //   t--;
    // }

    for(int i = 0; i < t; i++){
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if (n % 2 == 0) {
        evenSum += n;
      } else {
        oddSum += n;
      }
    }
    System.out.println("E:" + evenSum);
    System.out.println("O:" + oddSum);
    sc.close();
  }
}

// import java.util.Scanner;

// public class Q2 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number;
//     int choice;
//     int evenSum = 0;
//     int oddSum = 0;
//     do {
//       System.out.print("Enter the number ");
//       number = sc.nextInt();
//       if (number % 2 == 0) {
//         evenSum += number;

//       } else {
//         oddSum += number;
//       }
//       System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//       choice = sc.nextInt();
//     } while (choice == 1);
//     System.out.println("Sum of even numbers: " + evenSum);
//     System.out.println("Sum of odd numbers: " + oddSum);
//     sc.close();
//   }
// }
