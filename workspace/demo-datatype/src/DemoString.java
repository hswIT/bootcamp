public class DemoString {
  public static void main(String[] args) {
    System.out.println("Hello World!!!!");
    // "Hello World!!!!" -> String value, not a primitive

    String s;
    s = "abc";

    String s2 = "def"; // "def" is a string value and then assigned to String variable
    
    String s3 = "3";
    s3 = s3 + 1; //append meaning, but not + 1
    // String value + int value
    // String value + String value

    s3 = s3 + true;
    System.out.println(s3); // "31true"

    // In String, there is no -,*, /, %

    // Example 1
    int age = 40;
    String message = "I am " + age + " years old";
    System.out.println(message);

    // Example 2
    char grade = 'A';
    System.out.println("My grade of History is " + grade);
    // String + char -> String

    // +=
    String firstName = "John";
    String lastName = " Smith";
    String fullName = "";

    fullName += firstName + lastName;
    //fullName = fullName + firstName + lastName;
    
    System.out.println(fullName);
    // Primitive -> Math Operation, Comparison
    // String -> Not Primitive,we use method to compare their values
    String s10 = "hello";
    String s11 = "hello";
    System.out.println(s10.equals(s11)); // true

    boolean isValueSame = "abc".equals(s11); // false
    System.out.println(isValueSame);

    // charAt()
    char result = s10.charAt(1); // 2nd char of String value
    System.out.println(result); // 'e'
    System.out.println(s10.charAt(0)); // 'h'
    //System.out.println(s10.charAt(-1)); // runtime error

    // length()
    System.out.println(s10.length()); // 5
    System.out.println(s11.length() >=5); // int 5 >= 5 ??? -> true
    System.out.println(s10.charAt(2) == 'l');
  }
}
