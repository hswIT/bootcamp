import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList (Queue vs Deque vs List)
    Queue<String> queue = new LinkedList<>();
    // 10000 lines ....
    queue.add("abc"); // Collection method
    queue.add("def"); // Collection method
    queue.add("ijk"); // Collection method

    // queue.addFirst("zzz") // Queue has addLast & removeFirst ONLY
    
    System.out.println(queue.size()); // 3, Collection method

    String removedString = queue.remove(); // remove head element
    System.out.println(queue); // [def, ijk]
    System.out.println(removedString); // abc

    queue.remove("ijk"); // [def] (for loop)
    System.out.println(queue);

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()

    // You may use "instanceOf" for checking
    // Usually we check the same type of instance before downcast
    // i.e. if (queue instanceOf Deque) {}
    Deque<String> deque = (Deque) queue;
    deque.addFirst("jjj");
    System.out.println(queue);

    Deque<String> deque2 = new ArrayDeque<>();
    Queue<String> deque3 = new ArrayDeque<>();

    String head = queue.poll(); // similar to "remove"
    System.out.println(head);
    System.out.println(queue);

    String head2 = queue.peek(); // look up the head element
    System.out.println(head2); // def
    System.out.println(queue); // [def], still exist

    // While loop
    queue.add("Vincent");
    queue.add("Jenny");
    queue.add("Oscar");
    System.out.println(queue.size());

    // Testing
    String element;
    int count = 0;
    while (true) {
      element = queue.poll();
      queue.add(element);
      if (++count > 5) break; // 6 times
    }
    System.out.println(queue);



    // For each loop
    // look up the queue (but no point to do)
    // instead, you may consider using List if you treat it as a simple data collection
    for (String s : queue) {
      System.out.println(s);
    }

    System.out.println(queue.contains("Vincent")); // true
    System.out.println(queue.contains("Katie")); // false

    
    while (!queue.isEmpty()) { // typical way to use isEmpty
      element = queue.poll();
      System.out.println(element);
    }
    System.out.println(queue);



    // As a developer, need to choose the Interface and the implementation separately
    // 1) Queue => LinkedList or ArrayDeque
    // 2) Deque => LinkedList or ArrayDeque
    // 3) List => LinkedList or ArrayList

    // Choose between Queue or Deque or List
    // 1) All the above have ordering
    // 2) Queue/Deque cannot access the middle element DIRECTLY
    // 3) Deque has addFirst &  removeLast
    // 4. Queue/ Deque for consumption



  }
}
// !!!!!!!!! NOTE !!!!!!!!! 
// queue purpose is for consumption
// When intend to use for loop, then it is expected to use List instead of queue
// Using queue would infer there would be no usage of for loop
