package revision;

public enum AccountType {
  SAVING,
  COMMERCIAL,;

  public AccountType ofSaving() {
    return AccountType.SAVING;
  }

  public AccountType ofCommercial() {
    return AccountType.COMMERCIAL;
  }
}
