package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JPanel {
  int cellSize = 30;
  int columns = 25;
  int rows = 20;
  int screenWidth = columns * cellSize;
  int screenHeight = rows * cellSize;
  boolean game_running = true;
  
  Snake snake = new Snake();
  Apple apple = new Apple(this);

  public Game() {
    bindKey("W", "moveUp", Snake.Direction.UP);
    bindKey("S", "moveDown", Snake.Direction.DOWN);
    bindKey("A", "moveLeft", Snake.Direction.LEFT);
    bindKey("D", "moveRight", Snake.Direction.RIGHT);
  }

  
  void bindKey(String key, String actionName, Snake.Direction direction) {
    getInputMap().put(KeyStroke.getKeyStroke(key), actionName);

    getActionMap().put(actionName, new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        snake.direction = direction;
      }
    });
  }


  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // draw rows
    for(int i = 0; i <= rows; i++) {
      g.drawLine(0, i * cellSize, screenWidth, i * cellSize);
    }

    // draw columns
    for(int i = 0; i < columns; i++) {
      g.drawLine(i * cellSize, 0, i * cellSize, screenHeight);
    }

    // draw snake
    g.setColor(Color.green);
    
    for(Position pos : snake.body) {
      g.fillRect(pos.x * cellSize, pos.y * cellSize, cellSize, cellSize);
    }
  }
  
  public static void startGame() {
    Game game = new Game();

    JFrame frame = new JFrame("Snake Game");
    game.setPreferredSize(new Dimension(game.screenWidth, game.screenHeight));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.add(game);
    game.setBackground(Color.BLACK);
    frame.pack();
    frame.setVisible(true);

    Timer timer = new Timer(200, e -> {
      if(game.game_running) {
        if(game.snake.direction == Snake.Direction.DOWN) {
          game.snake.body.get(0).y += 1;
        } else if(game.snake.direction == Snake.Direction.UP) {
          game.snake.body.get(0).y -= 1;
        } else if(game.snake.direction == Snake.Direction.RIGHT) {
          game.snake.body.get(0).x += 1;
        } else if(game.snake.direction == Snake.Direction.LEFT) {
          game.snake.body.get(0).x -= 1;
        }

        if(game.snake.body.get(0).y >= game.rows) {
          game.game_running = false;
        } else if(game.snake.body.get(0).y < 0) {
          game.game_running = false;
        } else if(game.snake.body.get(0).x >= game.columns) {
          game.game_running = false;
        } else if(game.snake.body.get(0).x < 0) {
          game.game_running = false;
        }
        Position applePosition = game.apple.generateCoords();
        
        if(applePosition)
        
        game.repaint();
      }
    });

    
    timer.start();
    
  }
}
