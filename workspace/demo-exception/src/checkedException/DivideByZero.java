package checkedException;
public class DivideByZero {
  public static void main(String[] args) {
    int x = 10 / 2;
    System.out.println(x);

    int count = 0;
    x = 10 / count; // java.lang.ArithmeticException: / by zero

    // Solution 1: 
    if (count == 0) {
      x = 0;
    } else {
      x = 10 / count;
    }

    // Solution 2:
    try {
      x = 10 / count; // JVM will throw ArithmeticException object when count = 0
    } catch (ArithmeticException e) { // catch specific Exception event
      // send sms to someone for the event of count = 0
      x = 0;
    }
  }
}
