package OOPS;

public class TypeOfInheritance{
  public static void main(String [] args){
    mammal human = new mammal();
    human.eat();
    human.walk();
  }

}

class Animals{
  String color;

  void eat(){
    System.out.println("Eats");
  }
  void breathe(){
    System.out.println("Breathe");
  }
}

class mammal extends Animals{
  void walk(){
    System.out.println("Walks");
  }
}

class Fish extends Animals{
  void swim(){
    System.out.println("Swim");
  }
}

class Bird extends Animals{
  void fly(){
    System.out.println("Fly");
  }
}
