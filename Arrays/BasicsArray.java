package Arrays;

public class BasicsArray {

  public static void update(int num [], int nonChangeable){
    nonChangeable = 15;
    for(int i = 0; i < num.length; i++){
      num[i] = num[i] + 1;
    }
  }
  public static void main(String[] args) {
    // Creating an Array
    // int num [] = {1,3};
    // int marks[] = new int [2]; // size 2 

    int nonChangeable = 10;
    int num [] = {7,8,9};
    update(num, nonChangeable);
    System.out.println(nonChangeable);

    // print our marks 
    for(int i = 0; i < num.length; i++){
      System.out.print(num[i] + " ");
    }
    System.out.println();

  }
}
