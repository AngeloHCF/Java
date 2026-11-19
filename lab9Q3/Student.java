package lab9Q3;

import java.io.*;
import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File(fileName));
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    System.out.println("Student information: ");

    while (scanner.hasNext()) {
      System.out.println(scanner.nextLine());
    }

    scanner.close();
  }
}
