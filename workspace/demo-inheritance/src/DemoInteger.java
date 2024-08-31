public class DemoInteger {

  public static void main(String[] args) {
    // Every Class should have its own equals(), hashCode(), toString()
    Integer x = 3;
    System.out.println(x.equals(3)); // true
    System.out.println(x.hashCode()); // true
    System.out.println(x == 3); //x -> address, 


    Integer x2 = new Integer(3);
    Integer x3 = Integer.valueOf(3);
    System.out.println(x3 == x); // true, 
    System.out.println(x2 == x); // false -> x2 is another object other than x
    System.out.println(x2 == x3); // false

    // Comparing int value
    System.out.println(x2 == 3); // true -> Integer x2 unbox and convert into int and compare == 3

    // System.out.println(new Point(1, 2) == 3); // Java cannot compare object reference directly

    // If they are with different types, you cannot use "=="
    // System.out.println(new Staff() == new Point(1, 2));

    // OK to use "==" if they are with same type
    System.out.println(new Point(1, 2) == new Point(1, 2));
  }
}

// !!!!!! NOTE !!!!!!
// When using a class, we rely on the class definition and pass the responsibility to the class author
