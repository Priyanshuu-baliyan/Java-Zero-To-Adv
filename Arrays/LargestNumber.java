package Arrays;

public class LargestNumber {
  public static int getLargestNumber(int[] nums){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] > largest){
        largest = nums[i];
      }
      if(nums[i] < smallest){
        smallest = nums[i];
      }
    }
    System.out.println("Smallest Value is : " + smallest);
    return largest;
  }
  public static void main(String[] args) {
    int[] nums = {1,5,4,5,6,2};
    int res = getLargestNumber(nums);
    System.out.println("largest number is : " + res);
  }
}
