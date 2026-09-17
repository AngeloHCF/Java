package two;

public class Main {
  public static void main(String[] args) {
      Car car = new Car("Toyota", "Camry", 2025);
      System.out.println(car.brand);
      car.drive();
  }
}
