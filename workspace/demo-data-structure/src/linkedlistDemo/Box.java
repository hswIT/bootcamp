package linkedlistDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Box {

  private Box next;
  private int value;

public Box() {

}

public Box(int value) {
  this.value = value;
}

public Box(int value, Box next) {
  this.value = value;
  this.next = next;
}

  public Box getNext() { // Normal getter
    return this.next;
  }

  public int getValue() { // Normal getter
    return this.value;
  }

  // instance method
  // return this.arr[index]
  public int get(int index){
    int count = 0;
    Box head = this;
    while (head != null){
      if (++count > index){
        return head.value;
      }
      head = head.next;
    }
    return -1; // throw
  }

  public Box getTail(){
    Box head = this;
    while (head.next != null){
      head = head.next;
    }
    return head;
  }

  @Override
  public String toString() {
    Box head = this;
    StringBuilder sb = new StringBuilder("Box(");
    while (head != null){
      sb.append(head.getValue());
      head = head.next;
      sb.append(",");
    }
    return sb.append(")").toString();
  }

  public static void main(String[] args) {
    // 3, 10, 7 ->  to store has 3 means
    // 1. array 2. arrayList 3. linkedList

    // Explanation of Linked List
    Box stringList = new Box(3, new Box(10, new Box(7)));

    // get the first element
    System.out.println(stringList.getValue());
    // get the second element
    System.out.println(stringList.getNext().getValue()); // 10
    // get the third element
    System.out.println(stringList.getNext().getNext().getValue()); // 7

    // O(1) -> Constant time -> add element at head
    // add new element at head position, O(1) constant time
    stringList = new Box(100, stringList);
    System.out.println(stringList.getValue());

    // add new element at tail position, O(n) linear time
    Box tail = stringList.getTail();
    tail.next = new Box(200);
    System.out.println(tail.getValue());


    // Alternative way
    LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
    integerLinkedList.add(3);
    integerLinkedList.add(10);
    integerLinkedList.add(7);
    System.out.println(integerLinkedList);
    

  }
}
