public class DemoWrapperClass {

  public static void main(String[] args) {

    int x = 10; // 10 is an int value, x is a variable

    // int -> Integer
    Integer i1 = 10; // auto boxing, 10 is an int
    Integer i2 = new Integer(10); // i2 is an object reference, 10 is an object 
    // object reference store object address

    double d1 = i2.doubleValue();
    System.out.println(i2.compareTo(new Integer(11))); // -1
    // If you are going to compare number objects (Integer, Long, Short, Byte)

    Double d2 = new Double(3); // Double  Object with value 3.0
    System.out.println(d2.doubleValue()); // 3.0
    String str = d2.toString();
    System.out.println(str +  " d2");




    String s = "hello"; // Java -> create String object
    String s2 = new String("hello"); 
    // the object itself not only contains hello, but also contains methods
    System.out.println(s2.length());
    System.out.println(s2.charAt(3));

    // Short, Long, Byte
    Long l1 = new Long(10);
    Long l2 = new Long(10L);
    Long l3 = new Long("10"); // "10" -> String

    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);

    Long l4 = new Long(40000);
    short s1 = l4.shortValue(); // similiar to downcasting -> (short) l4
    System.out.println(s1); // -25536 -> overflow

    int x6 = new Double(10.5).intValue();
    System.out.println(x6); // 10 -> precision loss

    short s3 = new Double(40000.55).shortValue();
    System.out.println(s3); // -25536 -> (overflow + precision loss)

    // char -> Character
    Character c = 'a'; // auto boxing
    // int -> Integer
    Integer i5 = 10; // auto boxing, but actually it is using new Keyword
    Boolean b1 = true; //
    b1 = new Boolean(true);
    b1 = new Boolean("false");

    // 8 primitive types + 8 wrapper classes + String
    int[] arr = new int[] {2, 6, 10};
    Integer[] arr2 = new Integer[] {new Integer(2), new Integer(6), new Integer(10)};
    Integer[] arr3 = new Integer[] {2, 6, 10};

    // Integer g = 10;
    // if (g.equals(new Integer10)){

    // }

    Integer[] integers = new Integer[] {10, 8, 4, -3, 7};
    // Find the number of integers that are greater than 5
    int count = 0;
    // for (int i = 0; i < integers.length; i++) {
    //   if (integers[i]> 5) { // Integer -> int > 5
    //     count++;
    //   }
    // }

    for (int i = 0; i < integers.length; i++) {
      if ((integers[i].compareTo(new Integer(5))) > 0) { // Integer -> int > 5
        count++;
      }
    }
    System.out.println(count);

    Character[] characters = new Character[] {'c', '9', 'g', '0', 'e', '!'};
    // Find the number of "number" in the array
    // 2
    int count2 = 0;
    for (int i = 0; i < characters.length; i++) {
      if (characters[i].charValue() >= 48 && characters[i].charValue() <= 57) {
        count2++;
      }
    }
    System.out.println(count2);

    int result = Integer.parseInt("10");
    System.out.println(result);



  }
}
