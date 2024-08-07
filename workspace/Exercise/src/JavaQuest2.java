package workspace.Exercise.src;

/**
 * Expected Output:
 * 
 * a > 9
 * str length < 27
 * 2020 is a leap year.
 * 2400 is a leap year.
 */
// Primitive types and operators

public class JavaQuest2 {

  public static void main(String[] args) {
    int a = 10;
    int b = 3 * a % 3;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a >= 0 && a < 8) {
      System.out.println("a is between 0 and 8");
    // how about a > 9?
    } else if (a > 9) {
        System.out.println("a > 9");
    } else {
      System.out.println("a < 0");
    }

    String str = "I love Java. I love coding";
    if (str.length() == 27) {
      System.out.println("str length=27");
    } else if (str.length() < 27) { // code here ... add the condition
      System.out.println("str length < 27");
    } else if (str.length() > 27) { // code here ... complete the code
      System.out.println("str length > 27");
    } else {
      System.out.println("Empty string");
    }
  }
}
