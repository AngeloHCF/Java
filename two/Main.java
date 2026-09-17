package two;

import java.util.Scanner;

public class Main {
  private String lala;
  private int money;

  public static void main(String[] args) {
      System.out.println(args);
      Car car = new Car("Toyota", "Camry", 2026);
      System.out.println(car.brand);
      car.drive();

      Scanner input = new Scanner(System.in);
      String X = input.next();
      System.out.println(X);
      input.close();

  }

  public Main(String test) {
    System.out.println(test);
    test();
  }

  private void test() {
    honk();
  }

  public void honk() {
    System.out.println("Honk");
  }

}
