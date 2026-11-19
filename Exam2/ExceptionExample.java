package Exam2;

import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionExample {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    try {
      int x = keyboard.nextInt();
      System.out.println("You entered: " + x);
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter an integer.");
    }
    keyboard.close();
  }
}
