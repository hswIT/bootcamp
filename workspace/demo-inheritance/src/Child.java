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

  @Override
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

    Child c = new Child(); 
    Parent p = new Child(); // ok

    c.run();
    c.sleep();

    p.sleep();
    //p.run(); // compile error, p cannot call run()
    // because the scope of object is determined by the type of object reference

    Child c4 = (Child) p; // safe, Explicit downcasting
    c4.run();
    c4.sleep();

    // On the other hand
    Parent p2 = new Parent();
    if (p2 instanceof Child) { // avoid the error
      Child c5 = (Child) p2; // runtime error, java.lang.ClassCastException
      c5.run();
    }
    
    Parent p3 = new Child();  // p3 is now a reference to a Child object
    if (p3 instanceof Child) {  // This will return true because p3 actually refers to a Child
      Child c6 = (Child) p3;  // Safe downcast
      c6.run();  // Now you can call methods specific to Child
    }
  }
}

// !!!!!!!!! NOTE !!!!!!!!
  // Two meanings of "super"
  // 1. call parent class constructor
  // 2. super class object address

  // within main(), it cannot recognize what "super" is




