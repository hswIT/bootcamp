public class Person implements Walkable, Swimmable { // if the class is "final", it cannot be extended by subclass.

  @Override
  public final void walk() { // after final, walk() cannot be overridden
    System.out.println("Person is walking ...");
  }

  @Override
  public void swim() {
    System.out.println("Person is swimming ...");
  }

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.walk();
    p1.swim();

  }
}

// !!!!!!!!!! NOTE !!!!!!!!!!!!!
// any abstract method defined in the Interface has to be overridden in the implementing class
