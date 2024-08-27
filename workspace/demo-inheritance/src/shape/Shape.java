package shape;

public abstract class Shape {
  private Color color; // enum object default value  -> null
  
  // empty constructor
  public Shape() {
  }

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

    // public double area() {
  //   return -1.0d;
  // }

  // After defining the abstract class (non-abstract, concrete),
  // 1. we can create abstract method (without implementation)
  // 2. cannot create object for abstract class
  // 3. Abstract class can still hold its own attributes
  // 4. The constructor in abstract class is for child class to invoke
  public abstract double area();



  public static void main(String[] args) {

    // Shape shape = new Shape();
    // System.out.println(shape.area());

    // Shape shape2 = new Shape(Color.PINK);


  }

}
// !!!!!!!!! NOTE !!!!!!!!!
// abstract class cannot be instantiated
