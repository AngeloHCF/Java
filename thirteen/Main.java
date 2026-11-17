package thirteen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

public class Main {
  private final static int width = 500;
  private final static int height = 500;
  public static void main(String[] args) {
    JFrame frame = new JFrame("Pong");
    
    frame.setSize(width, height);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    CardLayout layout = new CardLayout();
    JPanel container = new JPanel(layout);
    
    container.add(new MainMenuPanel(), "menu");
    container.add(new GamePanel(), "game");
    container.add(new SettingsPanel(), "settings");

    frame.add(container);

    frame.setVisible(true);

  }
}
