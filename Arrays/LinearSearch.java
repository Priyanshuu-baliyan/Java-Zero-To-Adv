package Arrays;

public class LinearSearch {
  public static int lSearch(int num[], int key){
    for (int i = 0; i < num.length; i++) {
      if(num[i] == key){
        return i;
      }
    }
    return - 1;
  }
  public static void main(String[] args) {
    int num [] = {1,2,4,5,9,11,7,14,17,10,12};
    int key = 10;

    int idx = lSearch(num, key);
    if(idx == -1){
      System.out.println("Not found");
    } else {
      System.out.println("Key found at index: " + idx);
    }
  }
}
