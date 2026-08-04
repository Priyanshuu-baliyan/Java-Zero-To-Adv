package OOPS;

public class TypeOfInheritance{
  public static void main(String [] args){
    // mammal human = new mammal();
    // human.eat();
    // human.walk();

    Peacock peacock = new Peacock();
    peacock.fact();
    peacock.color = "Blue and Green feather";
    System.out.println(peacock.color);

    Cat cat = new Cat();
    cat.eat();
    cat.breathe();
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

class Shark extends Fish{
  void danger(){
    System.out.println("dangerous");
  }
}

class Peacock extends Bird{
  void fact(){
    System.out.println("National Bird Of INDIA");
  }
}

class Cat extends mammal{
  void sound(){
    System.out.println("Meowwwwwww!");
  }
}
