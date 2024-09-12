package shape;

import java.math.BigDecimal;

public class Circle extends Shape{
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue(); 
  }

}
