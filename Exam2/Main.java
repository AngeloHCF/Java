package Exam2;

// Superclass
class Animal {
  void makeSound() {
    System.out.println("Animal sound");
  }
}

/*
Dynamic binding is when Java determines at runtime which overriden method to execute based on the object's actual class, not the reference variable's type.
*/

// Subclass
class Dog extends Animal {
  @Override 
  void makeSound() {
    System.out.println("Woof!");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal a = new Dog();
    a.makeSound();
  }
}

/*
Animal -> Reference type
Dog -> Actual object type (runtime type)
*/
