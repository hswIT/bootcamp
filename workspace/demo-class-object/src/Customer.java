public class Customer {
  private int age;
  
  public Customer(int age) {
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Representation
  public boolean isElderly() {
    return this.age > 66;
  }

  public static void main(String[] args) {
    Customer customer = new Customer(66);
    customer.setAge(70);
    System.out.println(customer.isElderly());

    //isElderly() is better designed, because
    // 1. method is more precise, less error prone
    // 2. readability
    if (customer.isElderly()){ // instead of customer.getAge() > 66

    }

  }
}
