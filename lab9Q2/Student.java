package lab9Q2;

import java.io.*;
import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    PrintWriter printWriter = null;
    Scanner keyboard = new Scanner(System.in);
    try {
      System.out.print("How many lines of text do you want to append? ");
      int number = keyboard.nextInt();
      keyboard.nextLine(); // consume leftover \n
      System.out.println("Id Name GPA");
      printWriter = new PrintWriter(new FileOutputStream(new File(fileName), true));
      while (number > 0) {
        String line = keyboard.nextLine();
        printWriter.println(line);
        number--;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
      System.exit(0);
    }
    printWriter.close();

    System.out.println("Students information saved successfully!");
    System.out.println("Expected File Contents " + fileName);
    Scanner inputStream = null;

    try {
      inputStream = new Scanner(new File(fileName));
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    while (inputStream.hasNext()) {
      System.out.println(inputStream.nextLine());
    }

    keyboard.close();
  }
}
