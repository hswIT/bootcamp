public class DemoStringBuilder {

  public static void main(String[] args) {
    String s = "hello";
    s += "!!!"; // slow performance
    System.out.println(s);

    // Solution (leetcode -> avoid to use String concat)
    // StringBuilder will solve the performance issue
    StringBuilder sb = new StringBuilder("hello");
    sb.append("!!!"); // revise its attribute value and return its address
    sb.append("???").append("abc");
    char last = sb.append("???").append("abc").charAt(sb.length() - 1);
    System.out.println(sb.toString());
    System.out.println(last);
    System.out.println(sb.substring(1, 3));
    System.out.println(sb.reverse()); // return a new String

    // !!! Most of the String.class method exists in the StringBuilder.class
    // 1. length
    // 2. charAt()
    // 3. append()
    // etc...

    long startTime = System.currentTimeMillis();
    String s1 = "";
    for (int i = 0; i < 100_000; i++) {
      //s1 += "a";
      s1 = s1.concat("a");
    }
    long afterTime = System.currentTimeMillis();
    System.out.println("Time taken: " + (afterTime - startTime) + "ms");

    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < 100_000; i++) {
      sb2.append("a");
    }
    afterTime = System.currentTimeMillis();
    System.out.println("Time taken: " + (afterTime - startTime) + "ms");
    

    
  }


}
