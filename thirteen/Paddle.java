package thirteen;

public class Paddle {
  private int x = 0;
  private int y = 0;  

  private final int width = 10;
  private final int height = 100;

  private final int speed = 5;

  public Paddle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }
}

