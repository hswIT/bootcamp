package shape;

import java.math.BigDecimal;

// The implication of "extends Shape": obtains color attribute from Shape
// Circle.class -> concrete class has to implement all the abstract methods in Shape
public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    super(); // optional, it would call the parent empty constructor anyways
    this.radius = radius;
  }

  public Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  // override -> Same method signature
  // "@" => annotation (for complier to read)
  @Override // Ask complier to check if the parent class contains area() method, if not, it will throw an error
  // If there is no annotation, it would still override as it has the same method signature as in parent class
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue(); 
  }


  public static void main(String[] args) {

    Circle circle = new Circle(3.5);
    System.out.println(circle.area()); // -1.0

    Circle circle2 = new Circle(4.5, Color.PINK);
    System.out.println(circle2.getColor());
    System.out.println(circle2.area()); // 

  }
}

// !!!!!!!!!!!! NOTE !!!!!!!!!
// When extending a class, the constructor MUST invoke implicitly or explicitly super()
