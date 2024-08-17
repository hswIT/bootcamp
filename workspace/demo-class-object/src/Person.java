public class Person {
  private String name;
  private int age;

  // default empty constructor, when there is no other constructor
  public Person() {

  }

  // all arguments constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Can only read the atributes only, no setter is provide
  // cannot override the attributes once it is created
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // Main method is like a testing, like memory processing
  public static void main(String[] args) {
    // memory
    // When you create one all-arguments constructor only, 
    // compiler would not create an empty constructor
    // Person person = new Person(); // Compile error

    Person person = new Person("John", 66);

  }
}
