package snake;

import java.util.ArrayList;

public class Snake {
  Direction direction = Direction.RIGHT;
  ArrayList<Position> body = new ArrayList<>();

  public Snake() {
    body.add(new Position(5, 5));
  }
  
  public enum Direction {
    UP,
    RIGHT,
    LEFT,
    DOWN
  }

}
