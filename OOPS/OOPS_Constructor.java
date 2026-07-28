package OOPS;

public class OOPS_Constructor {
  public static void main(String[] args) {
    constructor c1 = new constructor();
    constructor c2 = new constructor("Priyanshu");
    constructor c3 = new constructor(5123);

    // System.out.println(c1.name);
  }
}
class constructor{
  String name;
  int roll;

  constructor(){
    System.out.println("Constructors is called...");
  }
  constructor(String name){
    this.name = name;
  }
  constructor(int roll){
    this.roll = roll;
  }
}
