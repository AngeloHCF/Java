package nine;

public class AccountDemo {
  public static void main(String[] args) {
    Account accOne = new Account();
    accOne.setId(1122);
    accOne.setBalance(20000);
    accOne.setAnnualInterestRate(0.045);

    Account accTwo = new Account();
    accTwo.setId(1123);
    accTwo.setBalance(20000);
    accTwo.setAnnualInterestRate(0.045);

    boolean c = accOne.compare(accTwo);
    System.out.println(c);

    accOne.withdraw(2500);
    accOne.deposit(3000);
    System.out.println(accOne.getBalance());
    System.out.println(accOne.getAnnualInterestRate());

  }
}
