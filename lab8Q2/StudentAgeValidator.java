package lab8Q2;

import java.util.Scanner;

public class StudentAgeValidator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;

    System.out.println("Hey, what's your name and age?");

    System.out.print("What's your name? ");
    name = keyboard.next();

    System.out.print("What's your age? ");
    age = keyboard.nextInt();

    keyboard.close();

    try {
      if (age < 16 || age > 100)
        throw new Exception("Invalid age! Age must be between 16 and 100");

      System.out.println("Oh so your name is: " + name + " and your age is: " + age);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("End of program.");
  }
}
