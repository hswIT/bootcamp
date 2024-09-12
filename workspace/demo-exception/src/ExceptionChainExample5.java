public class ExceptionChainExample5{
  // NO exception
  public static int method1(int x, int y) {
    try {
      return method2(x, y);
    } catch (ArithmeticException e) {
      throw new RuntimeException();
    }
  }

  public static int method2(int x, int y) {
      return x / y;
  }


  public static void main(String[] args) {
    try {
      method1(10, 0);
    } catch (RuntimeException e) {
      System.out.println("runtime exception........");
    }

  }
}
