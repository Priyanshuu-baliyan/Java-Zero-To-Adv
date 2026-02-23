package Variable_And_DataStructure.Exercise;

import java.util.Scanner;

public class TotalCost {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float pencil = 10.5f;
    float pen = 20.5f;
    float eraser = 5f;

    float total = pencil + pen + eraser;
    // System.out.println("Your Item bill cost is : " + total);

    //Adv 
    float GST = total * 0.18f;
    float bill = total + GST;
    System.out.println("Your Item bill cost is : " + bill);

    
    sc.close();
  }
}
