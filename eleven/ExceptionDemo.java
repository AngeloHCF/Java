package eleven;

public class ExceptionDemo {
  public static void main(String[] args) {
    try {
      throw new ArithmeticException("Hello World");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("this is the end");
  }
}