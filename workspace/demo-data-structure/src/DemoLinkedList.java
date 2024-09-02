import java.util.List;

public class DemoLinkedList {

  public static void main(String[] args) {
    
  }
    // ArrayList vs LinkedList
    // Same
    // 1. Implement List interface: add(), remove(), get()
    // 2. With Ordering
      
    // Difference
    // 1. Polymorphism -> different implementation for the same method (almost all methods)
    // 2. Performance -> add/remove() head/tail element -> LinkedList perform better
    // .... if we know the exact index of position for searching, ArrayList perform better

    // Charsequence (String, StringBuilder)
    // List<String> (ArrayList<String>, LinkedList<String>)
    public static int search(List<String> strings, String target){
      for (int i = 0; i < strings.size(); i++) {
        if (target.equals(strings.get(i))) {
          return i;
        }
      }
      return -1;
      
  }
}
