import java.util.Arrays;

public class DemoString {

  public static void main(String[] args) {
    // isEmpty() vs isBlank()
    String s1 = "hello";
    System.out.println(s1.isEmpty()); // false
    System.out.println(s1.isBlank()); // false

    String s2 = "";
    System.out.println(s2.isEmpty()); // true
    System.out.println(s2.isBlank()); // true

    String s3 = " ";
    System.out.println(s3.isEmpty()); // false
    System.out.println(s3.isBlank()); // true

    String s4 = " hello ";
    System.out.println(s4.isEmpty()); // false
    System.out.println(s4.isBlank()); // false

    String s5 = "Hello";
    System.out.println(s5.toLowerCase()); // hello
    System.err.println(s5); // Hello
    System.out.println(s5.toUpperCase()); // HELLO

    // indexOf(), used to searching for first occurrence
    // if matched, return the index of the first occurrence
    // if not matched, return -1
    s5.indexOf('e'); // 1
    System.out.println(s5.indexOf('E')); // -1, as no match found
    System.out.println(s5.indexOf("ll")); // 2
    System.out.println(s5.indexOf('e', 2)); // -1, starting from 2
    System.out.println(s5.indexOf("ll", 3)); // -1
    System.out.println(s5.indexOf("ll", 2)); // 2

    // lastIndexOf() used to searching for last occurrence
    System.out.println(s5.lastIndexOf('l')); // 3
    System.out.println(s5.lastIndexOf("ll")); // 2

    // +, +=
    // concat()
    String s6 = "hello";
    s6 =  s6 + "!!!";

    String s7 = "hello";
    s7 += "!!!";

    String s8 = "hello";
    s8 = s8.concat("!!!");

    // StartsWith(), endsWith()
    System.out.println(new String("bootcamp").startsWith("boot")); // true
    System.out.println(new String("bootcamp").indexOf("oot")); // 1
    System.out.println(new String("bootcamp").endsWith("mp")); // true
    System.out.println(new String("bootcamp").endsWith("m")); // false

    // replace()
    String s9 = "hello!!!";
    s9 = s9.replace("!", "?");
    System.out.println(s9); // hello???

    s9 = "abcdef";
    s9 = s9.replace("bcd", "ijk");
    System.out.println(s9); // aijkef

    System.out.println(s9.contains("ijk")); // true
    System.out.println(s9.contains("IJK")); // false
    System.out.println(s9.contains("bcd")); // false

    // trim() -> remove leading and trailing spaces
    String s10 = "  Matt Ho  ";
    System.out.println(s10.trim()); //Matt Ho


    // Wrong examples
    String s11 = "abc";
    String s12 = "abc";
    System.out.println(s11 == s12); // true
    String s13 = new String("abc");
    System.out.println(s12 == s13); // false

    // CompareTo() -> 8 Wrapper Class + String.class
    // a.compareTo(b) > 0 -> a > b
    // a.compareTo(b) == 0 -> a == b 
    // a.compareTo(b) < 0 -> a < b

    // String => >, <
    //ASCII
    System.out.println("abc".compareTo("bbc")); // -1
    System.out.println("bbc".compareTo("abc")); // 1
    System.out.println("abc".compareTo("acc")); // -1
    System.out.println("abc".compareTo("abc")); // 0

    char[] characters = "abc".toCharArray();
    System.out.println(Arrays.toString(characters)); // [a, b, c]

    // "abc" -> "cde"
    char c = ' ';
    String result = "";
    for (int i = 0; i < characters.length; i++) {
      c = (char) (characters[i] + 2); // char + 2 (int) = int
      result += c; // String +_ char
    }
    System.out.println(result);

    String name = "VInCENT";
    // vincent
    c = ' ';
    result = "";
    char[] names = name.toCharArray();
    for (int i = 0; i < names.length; i++) {
      c = names[i];
      if (names[i] >= 65 && names[i] <= 96) {
        c = (char) (names[i] + 32); // char + 2 -> int 
      }
      result += c;
    }
    System.out.println(result);

    String jenny = "Jenny";
    // 2, not found -> -1
    char target = 'n';
    int idx = -1;
    for (int i = 0; i < jenny.length(); i++) {
      if (jenny.charAt(i) == target) {
        idx = i;
        break; 
      } else {
        
      }
    }
    System.out.println(idx);

    for (int i = jenny.length() - 1; i >= 0; i--) {
      if (jenny.charAt(i) == target) {
        idx = i;
        break; 
      } else {
        
      }
    }
    System.out.println(idx);

    // byte b21 = 128; // compile error
    int i21 = 128;
    byte b21 = (byte) i21; 
    // overflow but work, as the compiler doesn't know what the value is in i21, 
    // so there is no error

    int[] arr2 = new int[3];
    int max = Integer.MIN_VALUE; // -2.1billion
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] > max) {
        max = arr2[i];
      }
    }
    System.out.println(max);

    long l2 = Long.MIN_VALUE;
    System.out.println(l2); //-9223372036854775808 (2^63)

    // Array.copyof()
     
    // Example 1
    // we have two object references, but one object
    int[] arr21 = new int[] {1, 2, 3};
    int[] arr22 = arr21; // pass by reference
    System.out.println(arr21[2]); // 3
    System.out.println(arr22[2]); // 3

    arr21[1] = 100;
    System.out.println(arr21[1]); // 100
    System.out.println(arr22[1]); // 100

    //Example 2 (Primitive)
    int x1 = 10;
    int x4 = x1; // Pass by value
    System.out.println(x4); // 10

    x1 = 100;
    System.out.println(x4); // 10
    System.out.println(x1); // 100

    // Example 3 (Wrapper class/String)
    String ss1 = "abc";
    String ss2 = s1; // pass by value
    System.out.println(ss1);
    System.out.println(ss2); 


    // Conclusion
    // 8 primitive + 8 Wrapper class + String => pass by value
    // Other than that, pass by reference

    // How to backup an array?
    // Arrays.copyOf()
    int[] backupArray = Arrays.copyOf(arr21, arr21.length); // define the size
    System.out.println(Arrays.toString(backupArray));

    // Bubble Sort / Insertion Sort (Nested Loop)
    int[] beforeSort = new int[] {30, -3, 100, -102};
    Arrays.sort(beforeSort); // reference is passed to sort(), so it doesn't return any new address
    // performance: nlogn
    System.out.println(Arrays.toString(beforeSort)); //[-102, -3, 30, 100]



  }
}
