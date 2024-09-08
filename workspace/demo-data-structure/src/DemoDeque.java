import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  public static void main(String[] args) {
    // Deque -> two ways (both head & tail) add and remove
    Deque<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    strings.add("ijk"); // addLast()

    strings.addLast("aaa");
    strings.addFirst("bbb");
    System.out.println(strings); // [bbb, abc, def, ijk, aaa]

    strings.remove(); // remove head
    System.out.println(strings); // [abc, def, ijk, aaa]
    strings.removeFirst(); 
    System.out.println(strings); // [def, ijk, aaa]
    strings.removeLast(); 
    System.out.println(strings); // [def, ijk]

    String result = strings.pop(); // return and remove the head element
    System.out.println(result); 
    System.out.println(strings); 

    strings.push("hello"); // add element to the head
    System.out.println(strings);

    System.out.println(strings.peek()); // return the head element
    System.out.println(strings.peekLast()); // return the tail element

    System.out.println(strings.poll());
    strings.add("goodbye");
    System.out.println(strings);


  }
}
// !!!!!!!! NOTE !!!!!!!!!!
// pop(), push(), addFirst(), remove(), removeFirst() => head element
// add(), addLast(), removeLast() => tail element