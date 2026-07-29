package OOPS;

public class Inheritance{
  public static void main(String[] args) {
    Tiger t1 = new Tiger();
    t1.eat(); 
  }
}

//base class
class Animal{
  String color;
  void eat(){
    System.out.println("Eats..!");
  }
  void breathe(){
    System.out.println("Breathes");
  }
}

//derived class
class Tiger extends Animal{
  int leg;
  void endurance(){
    System.out.println("He is so fit");
  } 
}