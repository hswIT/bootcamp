package shape;
import java.math.BigDecimal;


// In this example, using Shape (noun) is not appropriate to use an interface name.
public interface Shape {
  double area(); // abstract

  // Interface still support polymorphism
  public static double totalArea(Shape[] shapes) { // Circle object, Triangle object
    BigDecimal bd = new BigDecimal(0.0); 
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    Shape[] circles = new Shape[] {new Circle(1.0), new Circle(2.0)};
    System.out.println(Shape.totalArea(circles));

    Shape shape = new Circle(3.0); // OK
    shape.area();
    // shape.getColor();
    Circle circle = (Circle) shape;
    System.out.println(circle.getColor());

    Shape[] shapes = new Circle[] {new Circle(1.0), new Circle(3.0)};
  }
}
