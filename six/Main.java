package six;

public class Main {

  public enum MovieRating {
    E, A, B
  }

  public static void main(String[] args) {
    MovieRating test;
    test = MovieRating.E;
    switch (test) {
      case E:
        System.out.println("YOooo");
        break;
      case A:
        System.out.println("Hiiiii");
        break;
      case B:
        System.out.println("Byee");
        break;
      default:
        System.out.println("this is the end");
    }
    Lab.one();
  }
}