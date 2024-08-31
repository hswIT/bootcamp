public class Animal {
  public int age;
  public String name;

  public Animal() {

  }

  public Animal(int age, String name) {
    this.age = age;
    this.name = name;
  }


  // getters
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void eat() {
    System.out.println("Animal is eating ...");
  }

  public void walk() {
    System.out.println("Animal is walking ...");
  }

  public static void main(String[] args) {

    Animal animal = new Animal(4, "Bagel");

    System.out.println(animal.getAge());
    System.out.println(animal.getName());
  }



}
