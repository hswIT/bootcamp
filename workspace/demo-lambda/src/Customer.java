public class Customer {
  private int age;
  private String name;

  public Customer() {};

  public Customer(int age) {
    this.age = age;
  }

  public Customer(String name) {
    this.name = name;
  }

  public Customer(int age, String name) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }


  public int getAge() {
    return this.age;
  }

}


