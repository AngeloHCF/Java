package fifteen;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import java.io.*;

public class Main {
  private final static int width = 1000;
  private final static int height = 500;

  public static void main(String[] args1) {
    JFrame frame = new JFrame("Project");
    JLabel label = new JLabel("Hello World");
    frame.add(label);

    JLabel label2 = new JLabel("2");
    frame.add(label2);

    frame.setSize(width, height);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setVisible(true);

    // ===============================================================
    // READ FROM A FILE
    String file = "out.txt";
    Scanner inputStream = null;
    try {
      inputStream = new Scanner(new File(file));
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
      System.exit(0);
    }
    while (inputStream.hasNextLine()) {
      System.out.println(inputStream.nextLine());
    }
    inputStream.close();
    // ===============================================================

    System.exit(0);
  }
}
