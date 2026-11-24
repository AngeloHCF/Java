package lab9Q4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    String fileName = "students.txt";
    Scanner scanner = null;
    try {
      File f = new File(fileName);
      if (f.createNewFile()) {
        System.out.println("File does not exist.");
        System.out.println(fileName + " was created successfully!");

      } else {
        System.out.println(fileName + " already exists.");
      }

      scanner = new Scanner(new File(fileName));

    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    System.out.println("Student information: ");

    float gpaSum = 0;
    int numberOfStudents = 0;
    String bestStudentName = "";
    float bestStudentGPA = 0;
    while (scanner.hasNext()) {
      String[] data = scanner.nextLine().split(" ");
      gpaSum += Float.parseFloat(data[3]);
      numberOfStudents += 1;
      System.out.println("Student ID: " + data[0]);
      System.out.println("Name: " + data[1] + " " + data[2]);
      System.out.println("GPA: " + data[3]);
      System.out.println();
      if (bestStudentName == "" || Float.parseFloat(data[3]) > bestStudentGPA) {
        bestStudentName = data[1];
        bestStudentGPA = Float.parseFloat(data[3]);
      }
    }

    System.out.println("Total Number of Students: " + numberOfStudents);
    System.out.println("Average GPA: " + (gpaSum / numberOfStudents));
    System.out.println();
    System.out.println("Student with the highest GPA: ");
    System.out.println("Name: " + bestStudentName);
    System.out.println("GPA: " + bestStudentGPA);

    scanner.close();
  }

}
