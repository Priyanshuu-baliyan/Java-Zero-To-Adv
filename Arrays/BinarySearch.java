package Arrays;

public class BinarySearch {
  public static int bSearch(int [] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
      int mid = start + (end - start) / 2;
      if(target == arr[mid]){
        return mid;
      }
      if(target > arr[mid]){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return - 1;
  }
  public static void main(String[] args) {
    int [] arr = {1,2,5,6,7,9,10};
    int target = 10;
    int result = bSearch(arr, target);
    System.out.println("Target Value at index : " + result);
  }
}
