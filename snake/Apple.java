package snake;

import java.util.Random;

public class Apple {
  Game game;

  public Apple(Game game) {
    this.game = game;
  }
  
  public Position generateCoords() {
    Random rand = new Random();

    // minimum random X, maximum random X
    int minRandomX = 0;
    int maxRandomX = game.columns;
    
    // minimum random Y, maximum random Y
    int minRandomY = 0;
    int maxRandomY = game.rows;

    int randomX = rand.nextInt((maxRandomX - minRandomX)) + minRandomX;
    int randomY = rand.nextInt((maxRandomY - minRandomY)) + minRandomY;
    
    return new Position(randomX, randomY);    
  }
}
