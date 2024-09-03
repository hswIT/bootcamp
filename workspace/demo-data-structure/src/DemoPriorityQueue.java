

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    
    // For PriorityQueue, it is not first come first serve
    Queue<String> pq = new PriorityQueue<>(); // natural ordering of the elements
    pq.add("abc");
    pq.add("hello");
    pq.add("def");
    System.out.println(pq); // [abc, hello, def] => it is not the queue order

    // but the actual ordering of this queue is
    // The algo pick the first element at poll(), but not exactly a sorting
    System.out.println(pq.poll()); // abc
    System.out.println(pq.poll()); // def
    System.out.println(pq.poll()); // hello

    // Custom order
    // Tips: Class for sorting (Comparator)
    // Queue<String> pq2 = new PriorityQueue<>(...);

  }

}
