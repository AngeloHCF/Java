package nine;

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public void setAnnualInterestRate(double interest) {
    this.annualInterestRate = interest;
  }

  public void initialize() {
    this.id = 0;
    this.balance = 0;
    this.annualInterestRate = 0;
  }

  public double getMonthlyInterest() {
    return this.balance * (annualInterestRate / 1200);
  }

  public double withdraw(double amount) {
    if (amount > balance || balance <= 0) {
      System.out.println("You don't have that much money to withdraw.");
      System.exit(0);
    }

    balance -= amount;
    return this.balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public boolean compare(Account acc) {
    double other_account_balance = acc.getBalance();
    return this.balance == other_account_balance;
  }
}
