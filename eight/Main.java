package eight;

public class Main {
  public static void main(String[] args) {
    PaymentMethod payment1 = new CreditCard();
    PaymentMethod payment2 = new Paypal();
    payment1.pay(50);
    payment1.printReceipt(50);

    payment2.pay(50);
    payment2.printReceipt(50);
  }
}