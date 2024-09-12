public class ExceptionChainExample2{
  // NO exception
  public static int method1(int x, int y) {
    return method2(x, y);
  }

  public static int method2(int x, int y) {
    int a = 100;
    try {
      return x / y; // throw an exception
    } catch (ArithmeticException e) {
      a = -1; // can work on within catch block
    }
    return a; // Coding style, allow the catch block to do something
  }


  public static void main(String[] args) {
    method1(10, 0); // if there is no one handling the exception along the call stack
    // finally, main() method will throw the exception to JVM
    System.out.println(method1(10, 0));
  }
}
