package thirteen;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class MainMenuPanel extends JPanel {
  public MainMenuPanel() {
    setBackground(Color.BLACK);
    
    JLabel label = new JLabel("Menu");
    label.setForeground(Color.WHITE);

    add(label);
  }
}
