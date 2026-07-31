package OOPS;

public class TypeOfInheritance{
  public static void main(String [] args){
    Dog hulk = new Dog();
    hulk.breed = "Pitbull";
    hulk.legs = 4;
    hulk.eat();
    System.out.println(hulk.breed);
    System.out.println(hulk.legs);
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
  int legs;
}

class Dog extends mammal{
  String breed;
}
