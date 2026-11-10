package lab8Q3;

import java.util.Scanner;

public class ArrayAccessDemo {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    Scanner keyboard = new Scanner(System.in);
    int index;

    System.out.println("Hey, give me an index so I can give you the value at that place in the array.");
    index = keyboard.nextInt();

    keyboard.close();

    try {
      if (index >= arr.length || index < 0)
        throw new Exception("That index is invalid!");

      System.out.println("That index does exist, here's the value at that index: " + arr[index]);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("End of program.");
  }
}
