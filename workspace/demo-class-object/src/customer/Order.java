package customer;
import java.math.BigDecimal;
import java.util.Arrays;


// one to many
public class Order {
  private static int count = 0;

  private int id; // system generate id
  private Item[] items; // attribute, one to many
  private String currency; // one to one

  // public Order() { // empty constructor
    
  // }

  public Order() { // constructor
    this.id = getID();
    this.items = new Item[0];
  }



  // constructor by using Items[]
  public Order(Item[] items) { 
    this.items = items;
  }

  // constructor by using Item
  public Order(Item item) { 
    this.items = new Item[]{item};
  }

  public void setItems(Item[] items) {
    this.items = items;
  }

  public static int getID(){
    return ++count;
  }


  public Item[] getItems() {
    return this.items;
  }

  public void add(Item item) {
    // Item[] newItems = new Item[this.items.length + 1];
    // for (int i = 0; i < newItems.length; i++) {
    //   newItems[i] = this.items[i];
    // }
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public void remove(int index) { // i.e. length 4 => 3
    if (index > this.items.length && index == 0){
      return;
    }
    Item[] newItems = new Item[this.items.length - 1];
    int idx = 0;
    for (int i = 0; i < items.length; i++) {
      if (i != index) {
      newItems[idx++] = this.items[i];
      }
    }
    this.items = newItems;
  }


  public Order addItem (Item item){ // written by me
    if (this.items == null) { // if Order is empty
      return new Order(item);
    }
    Item[] newItemList = Arrays.copyOf(this.items, this.items.length + 1); // add item to the current order
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

  public double totalValue() {
    // double + double => BigDecimal
    BigDecimal total = new BigDecimal(0.0); // create an BigDecimal object with total: 0.0
    for (int i = 0; i < this.items.length; i++) {
      total = total.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    return total.doubleValue();
  }

}
