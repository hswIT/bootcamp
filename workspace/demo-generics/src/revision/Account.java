package revision;

import java.math.BigDecimal;

public abstract class Account implements Creditable<Double>, Debitable<Double> {
    private static int count;
    private double balance;
    private String accNo;
    private AccountType accountType;

    protected Account(String prefix, AccountType accountType) {
      this.accNo = this.genAccNo(prefix);
      this.balance = 0.0;
      this.accountType = accountType;
    }

    public static Account ofSavingAcc(){
        return new SavingAccount();
    }

    public static Account ofCommercialAcc(){
      return new CommercialAccount();
    }

    public double getBalance() {
      return this.balance;
    }

    public String getAccNo() {
      return this.accNo;
    }

    public AccountType getAccountType() {
      return this.accountType;
    }

    public void setBalance(double balance) {
      this.balance = balance;
    }

    public final void credit(Double amount) {
    double newBalance = BigDecimal.valueOf(this.getBalance()) //
        .add(BigDecimal.valueOf(amount)) //
        .doubleValue();
    this.setBalance(newBalance);
   }

    public final boolean debit(Double amount) {
      if (this.getBalance() < amount) {
        System.out.println("Insufficient Balance.");
        return false;
      }
      double newBalance = BigDecimal.valueOf(this.getBalance()) //
          .subtract(BigDecimal.valueOf(amount)) //
          .doubleValue();
      this.setBalance(newBalance);
      return true;
    }


    private String genAccNo(String prefix){
      return prefix.concat(String.format("%03d", ++count));
    }


  public static void main(String[] args) {
    Account account = Account.ofSavingAcc();
    System.out.println(account.getAccNo()); // "001001"

    account.credit(100.0);
    account.credit(58.0);
    account.debit(150.0);
    account.debit(10.0); // Insufficient Balance.
    System.out.println(account.getBalance()); // 8.0


    Account account2 = new SavingAccount();
    System.out.println(account2.getAccNo()); // "001002"


  }
}
