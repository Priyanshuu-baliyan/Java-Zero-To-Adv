package Function_And_Methods.Practice;

public class AvgThreeNum {
  public static int avgNum(int n1, int n2, int n3){
    int avg = (n1 + n2 + n3) / 3;
    return avg;
  }
  public static void main(String[] args) {
    System.out.println(avgNum(3, 6, 9));
  }
}
