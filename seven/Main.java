package seven;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int amount = one(keyboard);
    System.out.println("Question one: " + amount);
    int amount_two = two(keyboard);
    System.out.println("Question two: " + amount_two);
    keyboard.close();
  }

  public static int one(Scanner keyboard) {
    int n = keyboard.nextInt();
    int sum = 0;
    if (n <= 0)
      return -1;

    for (int i = 1; i <= n; i++) {
      sum += i * i;
    }

    return sum;
  }

  public static int two(Scanner keyboard) {
    int n = keyboard.nextInt();
    int sum = 0;

    while (n >= 0) {
      sum += n;
      n = keyboard.nextInt();
    }

    return sum;

  }
}