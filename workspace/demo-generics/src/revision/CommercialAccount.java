package revision;

public class CommercialAccount extends Account{
  public static final String ACC_PREFIX = "002";

  public CommercialAccount() {
    super(ACC_PREFIX, AccountType.COMMERCIAL);
  }

  public String toString() {
    return "CommercialAccount(" + this.getAccNo() + ")";
  }
}