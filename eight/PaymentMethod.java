package eight;

interface PaymentMethod {
  void pay(double amount);

  default void printReceipt(double amount) {
    System.out.println("Paid $" + amount);
  }
}