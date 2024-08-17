package customer;

import java.util.Arrays;

public class Shopping {
  public static void main(String[] args) {
    
    Item item1 = new Item(3.0, 2);
    Item item2 = new Item(5.0, 3);
    Item item3 = new Item(7.0, 4);
    Item item4 = new Item(9.0, 2);
    Item item5 = new Item(11.0, 5);
    Item item6 = new Item(12.0, 4);
    Item item7 = new Item(14.0, 6);

    Order order1 = new Order(new Item[] {item1, item2});
    Order order2 = new Order(new Item[] {item3, item4, item5, item6});
    Order UpdatedOrder2 = order2.addItem(item7);

    User user1 = new User("John", new Order[] {order1});

    System.out.println(item1.getQuantity());
    System.out.println(order1.toString());
    System.out.println(UpdatedOrder2.toString());

    System.out.println(user1.toString());
  }
}
