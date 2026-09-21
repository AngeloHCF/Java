package snake;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawLine(0, 30, 750, 30);
  }
  
  public static void startGame() {
    Game game = new Game();
    int cellSize = 30;
    int columns = 25;
    int rows = 20;
    int screenWidth = columns * cellSize;
    int screenHeight = rows * cellSize;
    boolean game_running = true;

    JFrame frame = new JFrame("Snake Game");
    frame.setSize(screenWidth, screenHeight);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.add(game);
    game.setBackground(Color.BLACK);
    frame.setVisible(true);
  }
}
