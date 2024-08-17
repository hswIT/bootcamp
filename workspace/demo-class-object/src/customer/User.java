package customer;

public class User {
  private String customerName;
  private Order[] orders;

  public User(String customerName, Order[] orders) {
    this.customerName = customerName;
    this.orders = orders;
  }

  public void setOrders (Order[] orders) {
    this.orders = orders;
  }

  public void setCustomerName (String customerName) {
    this.customerName = customerName;
  }
  
  public Order[] getOrders() {
    return this.orders;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public String toString() {
    String temp = "";
    for (int i = 0; i < this.orders.length; i++) {
      temp += this.getCustomerName() + " made the following order " + "\n" + this.orders[i].toString() + " \n";
    }
    return temp;
  }
}



