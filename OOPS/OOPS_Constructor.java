package OOPS;

public class OOPS_Constructor {
  public static void main(String[] args) {
    constructor c1 = new constructor("Priyanshu");
    System.out.println(c1.name);
  }
}
class constructor{
  String name;
  int roll;

  constructor(String name){
    this.name = name;
    // System.out.println("Constructors is called...");
  }
}
