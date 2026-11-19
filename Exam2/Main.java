package Exam2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int k = keyboard.nextInt();

    double[] arr = new double[k];
    double max = 0;
    
    for(int i = 0; i < k; i++) {
      double value = keyboard.nextDouble();
      if(value > max) max = value;
      arr[i] = value;
    }

    double percentage = max * 0.10;

    for(int i = 0; i < k; i++) {
      if(arr[i] < percentage) {
        System.out.println("Family " + (i + 1) + ": " + arr[i] + " makes less than " + percentage);
      }
    }

    keyboard.close();
  }
}
