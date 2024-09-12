import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Box<T> {
  private T value;

  public Box() {} // empty constructor

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  // Define "The range of K" between "static" and "return type"
  public static <K> Box<K> createBox(K value) {
    return new Box<>(value);
  }

  // The range of P -> all types under Number.class
  public static <P extends Number> Box<P> createNumberBox(P value) {
    return new Box<>(value);
  }

  // We use "extends" for interface as well
  public static <U extends CharSequence> Box<U> createStringBox(U value) {
    return new Box<>(value);
  }

  // T -> implement Comparable.class
  // "? super T" -> any parent class of T or T itself
  // !!! <T extends Comparable<T>> -> smaller range of T
  public static <T extends Comparable<? super T>> void sort(List<T> list) {
    Collections.sort(list);
  }



  public static void main(String[] args) {
    
    // T -> String
    Box<String> stringBox = new Box<>();
    StringBox stringBox2 = new StringBox(); // the word without generic

    // T -> Integer
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(3);
    // integerBox.setValue("abc");
    IntegerBox integerBox2 = new IntegerBox(); // the world without Generics

    // Map<K, V>
    Map<String, Integer> integerMap = new HashMap<>();

// List is similar to List<Object>
    List list = new ArrayList(); // World of Java 1.3, without generics
    list.add("abc");
    list = new ArrayList(); // runtime JVM -> new ArrayList<Object>();
    list.add("abc");
    list.add(10);
    System.out.println(list.size()); // 2
    System.out.println(list);

    // You cannot use charAt() after get()
    // System.out.println(list.get(0).charAt());
    System.out.println(((String) list.get(0)).charAt(1)); // b
    System.out.println(((Integer) list.get(1)).doubleValue()); // 10.0

    // Emerge of Java 1.5
    List<Integer> integers = new ArrayList<>(); // right hand side aligns left
                                                // hand side

    // List<Integer> list2 = new ArrayList<>();
    // list2.add("abc");

    // Array of Object
    Object[] objects = new Integer[3];
    objects[0] = 100;
    objects = new String[3];
    //objects[0] = 100; // Runtime error, java.lang.ArrayStoreException

    // After Java 1.5
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    System.out.println(strings.get(0).charAt(1)); // b

    ArrayList<String> strings2 = new ArrayList<>();
    // add()
    strings2.add("hello");
    strings2.add("abc");
    //strings2.remove("abc");
    strings2.remove(1);
    
    // Generic type can be array
    Box<int[]> arrayBox = new Box<>();
    arrayBox.setValue(new int[] {2, 3, 1});
    Arrays.sort(arrayBox.getValue());
    System.out.println(Arrays.toString(arrayBox.getValue()));

    Box<String> box10 = createBox("abc");
    Box<Integer> box11 = createBox(100);
    Box<Number> box12 = createNumberBox(0.3);
    Box<Number> box13 = createNumberBox(3);
    Box<Number> box14 = createNumberBox(3L);
    // Box<Number> box15 = createNumberBox("abc");

    Box<CharSequence> box16 = createStringBox("abc");
    Box<CharSequence> box17 = createStringBox(new StringBuilder("abc"));
    Box<CharSequence> box18 = createStringBox(new StringBuffer("abc"));



  }

  // Define "The range of K" between "static" and "return type"
  public static <K> Box<K> createBox(K value) {
    return new Box<K>(value);
  }

  // The range of P => all types under Number.class
  public static <P extends Number> Box<P> createNumberBox(P value) {
    return new Box<P>(value);
  }

  public static <U extends CharSequence> Box<U> createStringBox(U value) {
    return new Box<U>(value);
  }

  // T -> implements Comparable.class
  // "? super T" => any parent class of T or T itself
  // !!!!! <T extends Comparable<T>> => smaller range of T
  public static <T extends Comparable<? super T>> void sort(List<T> list){
    Collections.sort(list);
  }


}
// !!!!!!! NOTE !!!!!!!
// the purpose of having generic class is to reduce making so many classes

// WHy not List<List<Items>>??
// List<List<Item>> orders; // customer.getOrder(orderId); customer.getOrders.getItemList(id); 
// List<Order> orders; // customer.getOrderList().getOrder(id).getItemList().getItem(id);