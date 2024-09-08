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

    // Total Time Complexity: O(n^2) + O(n) + O(1) -> O(n^2)
    public static List<String> get(int[] arr) {
      // Time Complexity -> O(n)
      // O(n^2)
      for (int i = 0; i < arr.length; i++) { // iteration n times
        for (int j = 0; j < arr.length; j++) {
        }
      }
      // O(n)
      for (int i = 0; i < arr.length; i++) {

      }
      // O(1)
      if (arr.length > 10)
        return null;
      return null;
    }
}
