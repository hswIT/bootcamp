import java.math.BigDecimal;

public class Square {
  private double length;
  // private String color; // change to use Color class
  private Color color;

  public Square(double length, Color color) {
    this.length = length;
    this.color = color;
  }

  public static Square ofRed(double length) { // Square.ofRed(3)
    return new Square(length, Color.ofRed());
  }

  public double getLength() {
    return this.length;
  }

  public Color getColor() {
    return this.color;
  }

  public double area() {
    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }

  public static void main(String[] args) {
    Square s1 = new Square(4.0d, Color.ofRed());
    System.out.println(s1.area());

    Square s2 = new Square(4.0d, Color.ofRed());
    Square s3 = new Square(4.0d, Color.ofRed());

    Square s4 = Square.ofRed(3.2d);
    
    
  }
}
