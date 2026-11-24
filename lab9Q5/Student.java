package lab9Q5;

import java.io.*;
import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    Scanner scanner = null;
    try {
      File f = new File(fileName);
      if (f.createNewFile()) {
        System.out.println("File does not exist.");
        System.out.println(fileName + " was created succesfully!");
      } else {
        System.out.println(fileName + " already exists");
      }
      scanner = new Scanner(new File(fileName));
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    System.out.println("Students with a GPA of 3.5 or Higher:");
    while (scanner.hasNext()) {
      // ID, Name, Last, GPA
      String[] data = scanner.nextLine().split(" ");
      float gpa = Float.parseFloat(data[3]);
      if (gpa >= 3.5) {
        System.out.println(data[1] + " " + data[2] + " - GPA: " + gpa);
      }
    }
  }
}
