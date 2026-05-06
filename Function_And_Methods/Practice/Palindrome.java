package Function_And_Methods.Practice;

public class Palindrome {
  public static boolean isPalindrome(int num){
    if(num < 0) return false;
    int og = num;
    int rev = 0;
    while(num > 0){
      int last = num % 10;
      rev = rev * 10 + last;
      num /= 10;
    }
    return rev == og;
  }
  public static void main(String[] args) {
    int num = 123;
    if(isPalindrome(num)){
      System.out.println(num + " is Palindrome");
    } else {
      System.out.println(num + " is not Palindrome");
    }
  }
}
