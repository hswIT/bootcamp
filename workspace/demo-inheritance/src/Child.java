public class Child extends Parent{
  private double y;
  private byte age;

  public Child(){ 
    // when we extends, there MUST be super() invoking the constructor in the Parent class,
    // it is implicitly called the empty constructor of the Parent class
    // OR it is equivalent of calling super() with no arguments
  }

  public Child(String s){
    // super();
    super(s);
  }

  public Child(int x){
    super(x, (byte) 0);
  }

  public Child(int x, byte age, double y){
    super(x, age); // setting age in the parent class
    this.y = y;
  }

  public void setAge(byte age) {
    super.age = age;
  }

  public byte getAge() {
    // return this.age; // retrieve child class age
    return super.age; // retrieve parent class age
  }

  public void run() {
    super.sleep(); // "super" here is something like parent object address
  }

  public void sleep() {
    super.sleep();
    System.out.println("something else after super.sleep() ...");
  }

  public static void main(String[] args) {
  // Once you decided to extend a parent class
  // all child object has an "inside object"
  // so, all child constructor has to "super"
    Child child = new Child("ABC");
    Child child2 = new Child(10, (byte) 20, 30.0);
    System.out.println(child2.getAge());

    Child child3 = new Child(44);
    System.out.println(child3.getAge());

  }
}

// !!!!!!!!! NOTE !!!!!!!!
  // Two meanings of "super"
  // 1. call parent class constructor
  // 2. super class object address

  // within main(), it cannot recognize what "super" is




