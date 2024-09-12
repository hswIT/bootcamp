package builderpattern;

public class Person {
  private String name;
  private int age;

  // can add other public constructor if required

  private Person(Person.Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  } 

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static Person.Builder builder() {
    return new Builder();
  }

  // inner class
  public static class Builder {
    // copy all Person's attributes
    private String name;
    private int age;

    public Person.Builder name(String name) {
      this.name = name;
      return this;
    }

    public Person.Builder age(int age) {
      this.age = age;
      return this;
    }

    // public Person build() { //!!!! Set age to be a mandatory field
    //   if (age == 0) { // Or any other logic to detect an unset value
    //       throw new IllegalArgumentException("Age must be provided.");
    //   }
    //   return new Person(this);
    // }
  

    public Person build() {
      return new Person(this);
    }
  }

  public static void main(String[] args) {

    // Traditional way
    //Person p = new Person("John", 30); // normal way
    // p.setAge(40);
    // System.out.println(p.getAge()); //

    Person p2 = Person.builder().name("Peter").age(20).build();
    // build() -> instance method -> return Person object
    System.out.println(p2.getAge() + " " + p2.getName());

    // Advantages / Functionalities of Builder pattern:
    // 1. Serve different pattern of constructor
    // 2. Builder method name assists the value assignment in case there are lots of attributes
    // 3. We can disable/private encapsulate constructor of Outer Class
  }

}
