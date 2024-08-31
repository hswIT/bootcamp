package shape;
import java.math.BigDecimal;

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
  // 5. All abstract methods must be public
  abstract double area(); // no public keyword is needed

  public static double totalArea(Shape[] shapes) { // Circle object, Triangle object
    BigDecimal bd = new BigDecimal(0.0); // initialize an zero BigDecimal
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {

    // Shape shape = new Shape(); // cannot instantiate
    // System.out.println(shape.area());

    // Why do we need Polymorphism?
    Shape circle = new Circle(1.0); // Polymorphism Upcasting
    Shape triangle = new Triangle(Color.RED, 1.0, 1.0); // Polymorphism Upcasting
    Shape[] shapes = new Shape[] {circle, triangle};
    System.out.println(Shape.totalArea(shapes)); // ~3.14 + 0.5 ~= 3.641592653589793

  }

}
// !!!!!!!!! NOTE !!!!!!!!!
// abstract class cannot be instantiated
// abstract class can have no abstract methods
