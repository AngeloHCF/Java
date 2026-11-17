package lab9Q1;

import java.io.*;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    PrintWriter printWriter = null;
    try {
      File f = new File(fileName);
      if (f.createNewFile()) {
        System.out.println("File does not exist.");
        System.out.println(fileName + " was created successfully!");

      } else
        System.out.println(fileName + " already exists.");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
