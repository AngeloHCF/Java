package Exam2;

// Overload
class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }
}
/*
Java determines which method to call based on the arguments.
Overloading: Same method name, different parameters
*/
// Overload

public class Overload {
  public static void main(String[] args) {
    Calculator c = new Calculator();

    System.out.println(c.add(2, 3));
    System.out.println(c.add(2, 3, 4));
    System.out.println(c.add(2.5, 3.5));
  }
}