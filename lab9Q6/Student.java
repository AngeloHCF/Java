package lab9Q6;

import java.io.*;
import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    Scanner scanner = null;
    try {
      File f = new File(fileName);
      if (f.createNewFile()) {
        System.out.println("File doesn't exist");
        System.out.println(fileName + " was successfully created!");
      } else {
        System.out.println(fileName + " already exists!");
      }

      scanner = new Scanner(new File(fileName));

    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    System.out.print("Enter Student ID: ");
    Scanner keyboard = new Scanner(System.in);
    int studentId = keyboard.nextInt();

    System.out.println();

    keyboard.close();

    while (scanner.hasNext()) {
      // ID, Name, Last, GPA
      String[] data = scanner.nextLine().split(" ");
      int id = Integer.parseInt(data[0]);
      if (id != studentId)
        continue;

      String name = data[1] + " " + data[2];
      float gpa = Float.parseFloat(data[3]);

      System.out.println("Student found!");
      System.out.println("Student ID: " + id);
      System.out.println("Name: " + name);
      System.out.println("GPA: " + gpa);
      System.exit(0);
    }

    System.out.println("Student not found!");

    scanner.close();
  }
}
