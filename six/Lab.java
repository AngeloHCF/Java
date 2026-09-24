package six;

import java.util.Scanner;

public class Lab {
  public static void one() {
    int x;
    Scanner keyboard = new Scanner(System.in);
    x = keyboard.nextInt();

    if (x % 2 == 0) {
      x /= 2;
    } else {
      x *= 3 - 1;
    }

    System.out.println(x);
    Lab.two(keyboard);
    Lab.three(keyboard);
    Lab.four(keyboard);
    keyboard.close();
  }

  public static void two(Scanner keyboard) {
    int score = keyboard.nextInt();
    if (score < 0 || score > 100) {
      System.out.println("Invalid Score: " + score);
      return;
    }

    System.out.println("Valid score: " + score);
  }

  public static void three(Scanner keyboard) {
    int x = 5;
    int y = 10;
    int z = 15;
    System.out.println((x < 5) && (y > x)); // false
    System.out.println((x < 5) || (y > x)); // true
    System.out.println((x > 3) || (y < 10) && (z == 15)); // true
    System.out.println(!(x > 3) && (x != z || x + y == z)); // false
  }

  public static void four(Scanner keyboard) {
    char gradeValue = 'A';
    double numericGrade;
    switch (gradeValue) {
      case 'A':
        numericGrade = 4.0;
        break;
      case 'B':
        numericGrade = 3.0;
        break;
      case 'C':
        numericGrade = 2.0;
        break;
      case 'D':
        numericGrade = 1.0;
        break;
      case 'F':
        numericGrade = 0.0;
        break;
      default:
        numericGrade = 0.0;
        System.out.println("There was an error: " + gradeValue);
    }
    System.out.println(numericGrade);
  }
}
