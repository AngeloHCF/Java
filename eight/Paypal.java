package eight;

public class Paypal implements PaymentMethod {
  private double balance = 100;

  public void pay(double userSpendingAmount) {
    System.out.println("Charging credit card: $" + userSpendingAmount);
    if (userSpendingAmount > balance) {
      System.out.println("You don't have enough money.");
      return;
    }

    // balance -= userSpendingAmount; // commenting it out for now
  }

  public void printReceipt(double userSpendingAmount) {
    if (userSpendingAmount > balance) {
      System.out.println("You don't have enough money.");
      return;
    }

    System.out.println("Pay: $" + userSpendingAmount);
  }
}
