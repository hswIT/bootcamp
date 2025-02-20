public class DemoForEachLoop {
  public static void main(String[] args) {
    // for loop
    // able to access all elements during each iteration
    // for-each => easy to read/use, because no index
    int[] arr = new int[] {2, 9, 10, -3};
    // i => array index, can make use of i to retrieve index
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // for each loop
    // i => element, used to retrieve each element 
    // when for each loop is used, 
    // it gives an sense that it intends to iterate all elements over an array
    int sum = 0;
    for (int i : arr) {
      System.out.println(i);
      sum += i;
    }
    // print out elements

    String[] fruits = new String[] {"apple", "orange", "", "banana"};
    for (String fruit : fruits) {
      if (fruit != null && fruit.length() >= 1 && "o".equals(fruit.substring(0, 1))){
        System.out.println(fruit.charAt(fruit.length() - 1));
        
      }
    }
    
    // default value - Wrapper Class / String
    Integer x = null;
    System.out.println(x); // null
    // x.intValue(); // Error
    
    String s = null;
    System.out.println(s); // null
    // s.length(); // Error

    s = ""; // empty is an String object
    // s.charAt(0); // error, not NPE, StringIndexOutOfBoundsException:
    System.out.println(s);

  }
}
