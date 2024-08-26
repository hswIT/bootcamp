public class Cat extends Animal{
  private String color;

  // empty constructor
  public Cat(){
  }

  public Cat(String color){
    this.color = color;
  }

  // In Java, we never inherit constructor from the Parent class
  // but we can call parent constructor
  public Cat(int age, String name, String color){
    super(); // call parent constructor, calling super() is creating a new parent object within the child object
    // this new parent object has NO reference, so technically it cannot be called an object
    this.color = color;
  }

public String getColor(){
  return this.color;
}
public void setColor(String color){
  this.color = color;
}

  public void eat() {
    System.out.println("Cat is eating ...");
  }

  public String toString(){
    return "Cat(" 
      + "name=" + super.getName()
      + ", age=" + super.getAge()
      + ", color=" + this.color
      + ")";
  }


  public static void main(String[] args) {
    // Parent Class -> Animal Class
    // Child Class -> Cat Class

    // child object inherits Parent object attributes and behaviors
    Cat cat = new Cat();
    // Cat object inherits Parent objects

    System.out.println(cat.getAge());
    System.out.println(cat.getColor());

    Animal animal = new Animal();
    System.out.println(animal.getAge()); // 0
    // animal.getColor(); // error

    Cat cat2 = new Cat("Yellow");
    System.out.println(cat2.getAge());

    Cat cat3 = new Cat(10, "John", "White");
    System.out.println(cat3);
    

    // if there is NO eat() method in Cat.class
    cat3.eat(); // Animal is eating ...
    // Otherwise, it will call the eat() method in Cat class

    
  }
}
