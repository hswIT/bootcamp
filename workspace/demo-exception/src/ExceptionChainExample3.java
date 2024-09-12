public class ExceptionChainExample3{

  public static int method1(int x, int y) {
    try {
      return method2(x, y); // method(2) throw an exception
    } catch (ArithmeticException e) {

    }
    return -1;

  }

  public static int method2(int x, int y) {
    return x / y;
  }


  public static void main(String[] args) {
    method1(10, 0); // if there is no one handling the exception along the call stack
    // finally, main() method will throw the exception to JVM
    System.out.println(method1(10, 0));
  }
}
