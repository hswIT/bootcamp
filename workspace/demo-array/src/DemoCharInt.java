public class DemoCharInt {

  public static void main(String[] args) {
    char c = 'A';
    int x = c; // upcasting / promotion
    System.out.println(x); // 65 (ASCII code)

    //char c2 = x; // Not OK, downcasting
    char c3 = '0'; // ascii -> 48
    int x2 = c3; 
    System.out.println(x2); // 48
    // char[] -> String.class
    System.out.println("hello".substring(0,1)); // he

    // long -> float
    float f1 = 10L;
    System.out.println(f1); //10.0

    // long -> double
    double d1 = 100L;
    System.out.println(d1); // 100.0

    // int -> float
    float f2 = 10;
    System.out.println(f2); // 10.0
    
    // char - float
    float f3 = 'c';
    System.out.println(f3); // 99.0

    // char -> double
    double d2 = 'B';
    System.out.println(d2); // 66.0

    // Char Math Operation -> +, -, *, /
    int sum = 'a' + 'a'; // char + char = int + int 
    System.out.println(sum); // 194 (ascii)

    // Example Counting
    char[] arr = new char[] {'a', 'y', 'z', 'b', 'a'};
    // Max count value = a
    int[] counts = new int[26];
    for (int i = 0; i < arr.length; i++) {
      counts[arr[i] - 97]++;
    }
    int max = -1;
    char target = ' ';

    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max) {
        max = counts[i];
        // int -> char
        // In Java, you can still downcast the value to lower type by explicitly conversion
        target = (char) (i + 97);
      }
    }
    System.out.println(target);
    ///////////////////////////////////////////////////////////
    int s = 12360;
    char c2 = (char) s;
    System.out.println(c2); // え
    // Japanese -> 12352-12447

    s = 77896; // 66535 + 12361
    char c4 = (char) s;
    System.out.println(c4); // OK, but overflow -> え

    // Overflow
    byte b1 = (byte) 128;
    System.out.println(b1); // -128
    b1 = (byte) 129;
    System.out.println(b1); // -127

    int asset = (int) 2_200_000_000L;
    // overflow
    System.out.println(asset); // -2094967296
  }
}
