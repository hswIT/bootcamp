package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
  private double base;
  private double height;

  private Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  // either use this() or super()
  public Triangle(Color color, double base, double height) {
    super(color);
    // this(base, height); // If this and super are used together within the same constructor, there is error as only one can exits
    // super(color); 
    ///!!!! Solution: retain this(base, height) 
    // !!!! and implicitly call the parent empty constructor super() instead to give null

    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height))
        .divide(BigDecimal.valueOf(2.0d), 2, RoundingMode.HALF_UP)
        .doubleValue();
  }

  public static void main(String[] args) {

    Triangle triangle = new Triangle(Color.PINK, 2.5, 3.75);
    System.out.println(triangle.area());
    System.out.println(triangle.getColor());

    Triangle t2 = new Triangle(3.0, 4.0);
    System.out.println(t2.getColor()); // null if super() is called implicitly in the constructor

  }
}
