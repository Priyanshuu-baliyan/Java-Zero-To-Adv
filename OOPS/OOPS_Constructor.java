package OOPS;

public class OOPS_Constructor {
  public static void main(String[] args) {
    Constructor c1 = new Constructor();
    c1.name = "Priyanshu";
    c1.roll = 620;
    c1.password = "asdfgh";
    c1.marks[0] = 95;
    c1.marks[1] = 97;
    c1.marks[2] = 100;

    Constructor c2 = new Constructor(c1);
    c2.password = "xyzqw";
    c2.marks[1] = 98;
    for(int i = 0; i < 3; i++){
      System.out.println(c2.marks[i]);
    }
  }
}
class Constructor{
  String name;
  int roll;
  String password;
  int marks[];

  //copy constructor
  Constructor(Constructor c1){
    this.name = c1.name;
    this.roll = c1.roll;
    marks = new int[3];
    this.marks = c1.marks;

  }

  Constructor(){
    marks = new int[3];
    System.out.println("Constructors is called...");
  }
  Constructor(String name){
    marks = new int[3];
    this.name = name;
  }
  Constructor(int roll){
    marks = new int[3];
    this.roll = roll;
  }
}
