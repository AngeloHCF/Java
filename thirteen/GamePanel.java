package thirteen;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {
  private final Game game;
  
  public GamePanel(Game game) {
    this.game = game;
    setBackground(Color.BLACK);
  }

  @Override 
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Paddle p = game.getPlayer1();
    g.setColor(Color.WHITE);
    g.fillRect(p.getX(), p.getY(), p.getWidth(), p.getHeight());

    Paddle p2 = game.getPlayer2();
    g.setColor(Color.WHITE);
    g.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());

  }
}
