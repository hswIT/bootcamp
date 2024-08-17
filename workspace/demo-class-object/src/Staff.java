public class Staff {
  // 1. attribute
  private int id;
  private double salary;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;

  // 2. constructor
  // empty constructor, implicitly exists
  public Staff() {
    System.out.println("Creating staff object");
    this.salary = 21000;
    // can do any login within constructor
    // for, if

  }

  // Class may have more than 1 constructor
  public Staff(String firstName, String lastName, double height,
      double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }

  // All arguments (parametsers) constructor
  public Staff(int id, double salary, String firstName, String lastName,
      double height, double weight) {
    this.id = id;
    this.salary = salary;
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }


  // 3. instance method
  // getter method, setter method

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  // Presentation BELOW
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public double getBMI() {
    return this.weight / Math.pow(this.height, 2.0);
  }



}
// For any data that can be calculated
// It would never get stored
