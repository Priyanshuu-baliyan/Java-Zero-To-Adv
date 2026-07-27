package OOPS;
import java.util.*;
public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.color = "Blue";
    p1.tip = 5;
    System.out.println(p1.color);
    System.out.println(p1.tip);
    p1.color = "Yellow";
    System.out.println(p1.color);

    Bank myAcc = new Bank();
    myAcc.Username = "Vernik Kumar";
    myAcc.setPassword("abcdefghi");
    System.out.println(myAcc.Username);
    // System.out.println(myAcc.password);
  }
}

class Bank{
  public String Username;
  private String password;
  void setPassword(String pwd){
    password = pwd;
  }
}
class Pen{
  String color;
  int tip;

  void setColor(String newColor){
    color = newColor;
  }

  void setTip(int newTip){
    tip = newTip;
  }
}
