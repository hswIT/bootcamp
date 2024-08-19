package customer;
import java.math.BigDecimal;

public class User {
  private String customerName;
  private Order[] orders;
  


  public User() {
    this.orders = new Order[0];
  }

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
      temp += " made the following order " + "\n" + this.orders[i].toString() + " \n";
    }
    return temp;
  }

  public boolean isVIP() {
    return this.totalTransactionAmount() >= 100000;
  }

  public void add(Order order) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = order;
    this.orders = orders;
  }

  // Unit test
  public double totalTransactionAmount(){
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < this.orders.length; i++) {
      total = total.add(BigDecimal.valueOf(this.orders[i].totalValue()));
    }
    return total.doubleValue();
  }



  public static void main(String[] args) {
    User john = new User(); // User -> Order Array - Order

    john.totalTransactionAmount();

    john.isVIP();

  }


}



