package four;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    float x = keyboard.nextFloat();
    int y = (int) x;
    System.out.println("x = " + x + "\ny = " + y);
    byte z = (byte) y;
    System.out.println("x = " + x + "\nz = " + z);
    questionTwo(keyboard);
    questionThree();
    // once you close keyboard you can't get System.in, functions go before it, e.g
    // keyboard.close() should be absolutely last
    keyboard.close();
  }

  public static void questionTwo(Scanner keyboard) {
    float x = keyboard.nextFloat();
    double result = x % 2.0;
    System.out.println("x = " + x + "\nresult = " + result);
    int z = (int) x;
    System.out.println("x = " + x + "\nz = " + z + "\nz % 2 = " + z % 2);

  }

  public static void questionThree() {
    int u = 2;
    int v = 3;
    int w = 5;
    int x = 7;
    int y = 11;
    int first_result = u + y * w + x;
    int second_result = u + y % v * w + x;
    System.out.println(first_result);
    System.out.println(second_result);
  }

}
/*
 * Primitive Types
 * byte (-128 to 127)
 * short (-32,768 tp 32.767)
 * int (-2,148,483,648 to -2,148,483,648)
 * long (-9,2223,372,036,854,758,808 to 9,2223,372,036,854,758,808)
 * float
 * double
 * char
 * boolean
 */