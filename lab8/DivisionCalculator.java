package lab8;

import java.util.Scanner;

public class DivisionCalculator {
  public static void main(String[] args) {
    int a, b;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give me two integers");
    System.out.print("Integer A: ");
    a = keyboard.nextInt();
    System.out.println("Nice choice!");
    System.out.print("Integer B: ");
    b = keyboard.nextInt();

    keyboard.close();

    try {
      if (b == 0)
        throw new ArithmeticException("You can't divide by 0.");

      System.out.println("A / B = " + (a / b) + ", have a great rest of your day!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("End of program");
  }
}
