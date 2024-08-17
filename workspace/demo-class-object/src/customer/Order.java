package customer;

import java.util.Arrays;

public class Order {
  private Item[] items;

  // constructor
  public Order(Item[] items) {
    this.items = items;
  }


  public void setItems(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return this.items;
  }

  public Order addItem (Item item){
    Item[] newItemList = Arrays.copyOf(this.items, this.items.length + 1);
    newItemList[newItemList.length - 1] = item;
    return new Order(newItemList);
  }

  public String toString() {
    String temp = "";
    for (int i = 0; i < this.items.length; i++) {
      temp += this.items[i].toString() + " \n";
    }
    return temp;
  }

}
