package lab9;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int option = 0;
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.println();
      System.out.println("==== Student Management System ====");
      System.out.println("1. Find a student");
      System.out.println("2. Add a student");
      System.out.println("3. Display all students");
      System.out.println("4. Update a student's GPA");
      System.out.println("5. Delete a student");
      System.out.println("6. Exit");
      System.out.println();

      option = keyboard.nextInt();
      keyboard.nextLine();
      String fileName = "";
      int studentId = 0;

      String[] newStudent = new String[3];

      switch (option) {

        case 1:
          System.out.println("You selected \"Find a student\" ");
          System.out.print("Enter file name: ");
          fileName = keyboard.nextLine();
          System.out.print("Enter student ID: ");
          studentId = keyboard.nextInt();
          findStudent(studentId, fileName);
          option = 0;
          break;

        case 2:
          System.out.println("You selected \"Add a student\" ");
          System.out.print("Enter file name: ");
          fileName = keyboard.nextLine();
          System.out.print("Enter new student id: ");
          newStudent[0] = keyboard.nextLine();
          System.out.print("Enter new student name: ");
          newStudent[1] = keyboard.nextLine();
          System.out.print("Enter new student gpa: ");
          newStudent[2] = keyboard.nextLine();
          addStudent(newStudent, fileName);
          option = 0;
          break;

        case 3:
          System.out.println("You selected \"Display all students\"");
          System.out.print("Enter file name: ");
          fileName = keyboard.nextLine();
          displayStudents(fileName);
          option = 0;
          break;

        case 4:
          System.out.println("You selected \"Update a student's GPA\"");
          System.out.print("Enter file name: ");
          fileName = keyboard.nextLine();
          System.out.print("Enter student id: ");
          studentId = keyboard.nextInt();
          System.out.print("Enter new student name: ");
          newStudent[1] = keyboard.nextLine();
          System.out.print("Enter new student GPA: ");
          newStudent[2] = keyboard.nextLine();
          updateStudent(studentId, newStudent, fileName);
          option = 0;
          break;

        case 5:
          System.out.println("You have selected \"Delete a student\"");
          System.out.print("Enter file name:");
          fileName = keyboard.nextLine();
          System.out.print("Enter student id: ");
          studentId = keyboard.nextInt();
          deleteStudent(studentId, fileName);
          option = 0;
          break;

        case 6:
          System.out.println("Goodbye!");
          keyboard.close();
          System.exit(0);

        default:
          System.out.println("Please select a valid option from the menu.");
          option = 0;
          break;
      }

    }
  }

  public static void findStudent(int studentId, String fileName) {
    System.out.println();

    if (!fileExist(fileName)) {
      System.out.println(fileName + " doesn't exist.");
      return;
    }

    Scanner scanner = null;

    try {
      scanner = new Scanner(new File(fileName));
    } catch (Exception e) {
      System.out.println(e);
      return;
    }
    
    scanner.close();
    
    while (scanner.hasNext()) {
      // Id, First Name, Last Name, GPA
      String[] data = scanner.nextLine().split(" ");
      int id = Integer.parseInt(data[0]);
      if(id == studentId) {
        System.out.println("The user with the ID: " + id);
        System.out.println("Name: " + data[1] + " " + data[2]);
        System.out.println("GPA: " + data[3]);
        return;
      }
    }

    System.out.println("That student with the ID: " + studentId + " doesn't exist");
    
  }

  public static void addStudent(String[] newStudent, String fileName) {
    System.out.println();
    if (!fileExist(fileName)) {
      System.out.println(fileName + " doesn't exist.");
      return;
    }

    PrintWriter printWriter = null;

    try {
      printWriter = new PrintWriter(new FileOutputStream(new File(fileName), true));
      printWriter.println(newStudent[0] + " " + newStudent[1] + " " + newStudent[2]);
    } catch (Exception e) {
      System.out.println(e);
      return;
    }

    System.out
        .println("Successfully added a new student: " + newStudent[0] + " " + newStudent[1] + " " + newStudent[2]);

    printWriter.close();
  }

  public static void displayStudents(String fileName) {
    System.out.println();

    if (!fileExist(fileName)) {
      System.out.println(fileName + " doesn't exist.");
      return;
    }

    Scanner scanner = null;

    try {
      scanner = new Scanner(new File(fileName));
    } catch(Exception e) {
      System.out.println(e);
      return;
    }

    scanner.close();

    int i = 1;
    while(scanner.hasNext()) {
      String[] data = scanner.nextLine().split(" ");
      System.out.println(i);
      System.out.println("ID: " + data[0]);
      System.out.println("Name " + data[1] + " " + data[2]);
      System.out.println("GPA: " + data[3]);
      System.out.println();
      i += 1;
    }
  }

  public static void updateStudent(int studentId, String[] newStudent, String fileName) {
    System.out.println();

    if (!fileExist(fileName)) {
      System.out.println(fileName + " doesn't exist.");
      return;
    }

    Path filePath = Path.of(fileName); 
    String newString = newStudent[0] + " " + newStudent[1] + " " + newStudent[2];
    String studentIdString = String.valueOf(studentId);
    
    try {
      String content = Files.readString(filePath);
      content = content.replace(studentIdString, newString);
      Files.writeString(filePath, content);
    } catch(Exception e) {
      System.out.println(e);
      return;
    }
    System.out.println("Successfully updated student with the ID: " + studentId);
  }

  public static void deleteStudent(int studentId, String fileName) {
    System.out.println();

    if (!fileExist(fileName)) {
      System.out.println(fileName + " doesn't exist.");
      return;
    }

    Scanner scanner = null;

    try {
      scanner = new Scanner(new File(fileName));
    } catch (Exception e) {
      System.out.println(e);
      return;
    }

    String[] data;
    
    while(scanner.hasNext()) {
      data = scanner.nextLine().split(" ");
      if(Integer.parseInt(data[0]) != studentId) continue;
      
    }
    
  }

  public static boolean fileExist(String fileName) {
    File f = new File(fileName);
    return f.exists();
  }
}
