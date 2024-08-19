package customer;

import java.math.BigDecimal;


public class Item {
  private double price;
  private int quantity;

  // empty constructor
  public Item() {

  }

  // full args constructor
  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getTotalPrice() {
    return this.price * this.quantity;
  }

  public String toString() {
    return "Price: " + this.price + " Quantity: " + this.quantity;
  }

  // Not necessary to use BigDecimal (Double * int)
  public double subtotal() {
    // BigDecimal price = BigDecimal.valueOf(this.price);
    // BigDecimal quantity = BigDecimal.valueOf(this.quantity);
    // return price.multiply(quantity, 2, RoundingMode.HALF_UP).doubleValue();
    BigDecimal total = BigDecimal.valueOf(0); // create an BigDecimal object
    total = BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity));
    // multiply() => return a new BigDecimal Object
    return total.doubleValue();

  }

  public static void main(String[] args) {
    double x = 0.3;
    double y = 0.1;
    System.out.println(x / y); //0.19999999999999998 
    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    // no matter double + double, double - double, double * double, double / double
    // Use BigDecimal
  }
}
