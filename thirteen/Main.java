package thirteen;

import javax.swing.JFrame;
import java.awt.Color;

public class Main {
  private final static int width = 500;
  private final static int height = 500;
  public static void main(String[] args) {
    JFrame frame = new JFrame("Pong");
    
    frame.setSize(width, height);
    frame.setBackground(Color.BLACK);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    frame.setVisible(true);
  }
}
