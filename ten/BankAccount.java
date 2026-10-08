package ten;

public class BankAccount {
  private int accountNumber;
  private String accountHolder;
  private double balance;
  private double interestRate;

  // getters
  public int getAccountNumber() {
    return this.accountNumber;
  }

  public String getAccountHolder() {
    return this.accountHolder;
  }

  public double getBalance() {
    return this.balance;
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  // setters
  public void setAccountNumber(int account_number) {
    this.accountNumber = account_number;
  }

  public void setAccountHolder(String account_holder) {
    this.accountHolder = account_holder;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setInterestRate(double interest_rate) {
    this.interestRate = interest_rate;
  }

  // methods
  public void initialize() {
    this.accountNumber = 0;
    this.accountHolder = "";
    this.balance = 0.0;
    this.interestRate = 0.0;
  }

  // calculate interest and return the interest
  public double calculateInterest() {
    double interest = balance * (interestRate / 100);
    return interest;
  }

  // deposit method with edge cases handling
  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Invalid amount");
      return;
    }

    balance += amount;
  }

  // withdraw method
  public double withdraw(double amount) {
    if (amount > balance) {
      System.out.println("You don't have this kind of money in your bank account.");
      return 0.0;
    }

    if (amount <= 0) {
      System.out.println("You can't deposit less than or equal to 0!");
      return 0.0;
    }

    balance -= amount;

    return amount;
  }

  // equality method that tests two bank accounts are equal based on their account
  // number

  public boolean equal(BankAccount otherAccount) {
    return (this.accountNumber == otherAccount.getAccountNumber());
  }

}
