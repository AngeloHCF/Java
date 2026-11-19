package Exam2;

class Animal {
  private String name;
  private String OwnerName;
  public int age;
  private int worth;

  void introduce() {
    System.out.println("Hello, I'm an animal!");
  }
}

class Dog extends Animal {
  private String dogStore;

  Dog() {
    dogStore = "Walmart";
    this.age = 5;
  }

  void writeOutput() {
    
    System.out.println("My age is: " + this.age);
  }  
}

public class Inheritance {
  public static void main(String[] args) {
    Dog a = new Dog();
    a.writeOutput();
  }
}
