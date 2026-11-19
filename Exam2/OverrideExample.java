package Exam2;

// Method Overriding
class Animal {
  // Method same name and parameter
  void makeSound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {
  @Override 
  // Method same name and parameter
  void makeSound() { 
    System.out.println("Wooff!");
  }
}

/*
Notice that both methods have the same name and parameters, but Dog replaces the inherited implementation.
*/
// Method Overriding


public class OverrideExample {
  public static void main(String[] args) {
    Animal a = new Dog();
    a.makeSound();
  }
}