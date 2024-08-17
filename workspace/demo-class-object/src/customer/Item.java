package customer;

public class Item {
  private double price;
  private int quantity;

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
}
