package thirteen;

public class Game {
  private Paddle player1 = new Paddle(10, 10);
  private Paddle player2 = new Paddle(460, 10);
  private boolean status = false;

  Paddle getPlayer1() {
    return this.player1;
  }
  Paddle getPlayer2() {
    return this.player2;
  }
  boolean getStatus() {
    return status;
  }
}
