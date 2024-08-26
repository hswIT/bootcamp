import java.math.BigDecimal;

public class Calculator {
  private double x;
  private double y;

  public Calculator() {

  }

  public Calculator(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setX (double x) {
    this.x = x;
  }

  public void setY (double y) {
    this.y = y;
  }

  public double sum() {
    return BigDecimal.valueOf(this.x).add(BigDecimal.valueOf(this.y)).doubleValue();
  }

  public double sum(double x, double y) {
    return x + y;
  }

  public static double sum2(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  
  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.sum());

    System.out.println(Calculator.sum2(3, 5));

    System.out.println(c.sum(2.0, 3.0));

    
  }
}
