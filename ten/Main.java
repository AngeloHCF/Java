package ten;

public class Main {

  public static void main(String[] args) {
    // test the bank account program
    BankAccount account1 = new BankAccount();
    account1.setAccountNumber(1001);
    account1.setAccountHolder("John Smith");
    account1.setBalance(5000.00);
    account1.setInterestRate(2.5);

    System.out.println("Account Number: " + account1.getAccountNumber());

    System.out.println("Account Holder: " + account1.getAccountHolder());

    System.out.println("Balance: " + account1.getBalance());

    System.out.println("Interest Rate: " + account1.getInterestRate() + "%");

    System.out.println("$" + account1.calculateInterest());

    account1.deposit(1500);
    System.out.println(account1.getBalance());

    account1.withdraw(1000);
    System.out.println(account1.getBalance());

    BankAccount account2 = new BankAccount();
    account2.setAccountNumber(1001);
    account2.setAccountHolder("Jane Doe");
    account2.setBalance(8000);
    account2.setInterestRate(3.0);

    System.out.println(account1.equal(account2));
  }
}