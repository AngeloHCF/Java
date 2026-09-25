/**
  QUESTION ONE
  Prompts the user to enter their age using Scanner class
  Multi way if-else-if statement to determine and print correct ticket price according to the following:
    if age under 5
      free
    else if age 5 through 12
      $5
    else if age 13 through 59
      $10
    else if age 60 and older
      $7.50
    invalid age (negative numbers, 0, not a number)
      "Error: age is invalid"
  
  QUESITON TWO
  get the first word using indexOf and substring to find the first word in a string
*/

package assignment_1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age = keyboard.nextInt();
    if(age < 5 && age >= 0) {
      System.out.println("Free ($0.00)");
    } else if(age >= 5 && age <= 12) {
      System.out.println("Child ticket ($5.00)");
    } else if(age >= 13 && age <= 59) {
      System.out.println("Adult ticket: ($10.00)");
    } else if(age >= 60) {
      System.out.println("Senior ticket: ($7.50)");
    } else if (age < 0) {
      System.out.println("Error: Age cannot be negative");
    }

    question_two(keyboard);
    keyboard.close();
  }
  
  public static void question_two(Scanner keyboard) {
    System.out.print("Enter a sentence: ");
    String sentence = keyboard.next();
    System.out.println("The first word in your sentence is: " + sentence);
  }
}
