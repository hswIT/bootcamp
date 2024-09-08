package revision;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Bank {
  private List<Account> accounts;

  public Bank() {
    this.accounts = new LinkedList<>();
  }

  public void add(Account account) {
    this.accounts.add(account);
  }

  public double sumOfBalance(AccountType type) {
    double sum = 0.0;
    for (Account account : this.accounts) {
      if (account.getAccountType() == type) {
        sum = BigDecimal.valueOf(account.getBalance()).add(BigDecimal.valueOf(sum)).doubleValue();
      }
    }
    return sum;
  }

  public String toString() {
    return "Bank(" + this.accounts + ")";
  }


  public static void main(String[] args) {
    Account account1 = Account.ofSavingAcc();
    Account account2 = Account.ofCommercialAcc();
    Account account3 = Account.ofSavingAcc();
    account1.credit(120.0);
    account1.debit(35.0);
    account2.credit(1200.0);
    account2.debit(300.0);
    account3.credit(100.0);
    account3.debit(35.5);
    // System.out.println(account1.getAccNo()); // "001001"
    // System.out.println(account2.getAccNo()); // "002002"
    // System.out.println(account1.getAccountType()); // SAVING
    Bank bank = new Bank();
    // Add Saving Account
    bank.add(account1);
    bank.add(account2);
    bank.add(account3);
    System.out.println(bank.toString());
    System.out.println("SAVING : " + bank.sumOfBalance(AccountType.SAVING));
    System.out.println("COMMERCIAL : " + bank.sumOfBalance(AccountType.COMMERCIAL));
  }
}