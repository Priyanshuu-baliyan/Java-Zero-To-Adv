package Arrays;

public class SubArray {
  public static void printSubArray(int [] n){

    int ts = 0;
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < n.length; i++){
      int sum = 0;

      for(int j = i; j < n.length; j++){
        sum += n[j];
        max = Math.max(max, sum);
        
        System.out.print("SubArray: ");
        for(int k = i; k <= j; k++){
          System.out.print(n[k] + " ");
          
        }
        ts++;
        System.out.println("| Sum is : " + sum);
      }
      System.out.println();
    }

    System.out.println("Total subArray  is = " + ts);
    System.out.println("Maximum SubArray Sum = " + max);
  }
  public static void main(String[] args) {
    int [] n = {2,4,6,8,10};
    printSubArray(n);
  }
}
