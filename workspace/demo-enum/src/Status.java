public enum Status {
  PAID(1),
  READY_TO_SHIP(2),
  SHIPPING(3),
  DELIVERED(4),
  ;
  // attribute design
  // purpose easier to find something 

  private int value;

  private Status(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Status get(int value) {
    for (Status status : Status.values()) { // enum has a build-in value() method to return an array of enum constants
      if (status.getValue() == value) { // checking the value of the parameter in order to retrieve the enum constant
        return status;
      }
    }
    return null; // throw later
  }

  public Status next(){
    return this.get(this.value + 1);

  }
  
  public static void main(String[] args) {
    System.out.println(Status.READY_TO_SHIP.next());
    System.out.println(Status.PAID.next());
  }

}
