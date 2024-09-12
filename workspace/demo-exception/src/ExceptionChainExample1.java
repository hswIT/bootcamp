public class ExceptionChainExample1{
  
  public static int method1(int x, int y) {
    return method2(x, y);
  }

  public static int method2(int x, int y) {
      return x / y; 
  }


  public static void main(String[] args) {
    method1(10, 0); 
  }
}
