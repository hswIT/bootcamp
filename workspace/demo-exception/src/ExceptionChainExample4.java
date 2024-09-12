public class ExceptionChainExample4{
  // NO exception
  public static int method1(int x, int y) {
    return method2(x, y);
  }

  public static int method2(int x, int y) {
    return x / y; 
  }


  public static void main(String[] args) {
    int result = 0;
    try {
      result = method1(10, 0);
    } catch (ArithmeticException e) {
      result = -1;
    }

  }
}
// !!!!!!!!!! NOTE !!!!!!!!!!!!!
// To decide where to handle the exception, it depends where the error would be happening. 
// So it depends on where the business logic get involved.
