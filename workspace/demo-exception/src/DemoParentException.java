public class DemoParentException {

  // 1. "catch" can be multiple code block. Similar to "else-if" Check one by one
  // 2. "catch" has Parent and Polymorphism concepts
  public static void main(String[] args) {
    try {
      Object obj[] = new Integer[3];
      // obj[2] = 10;
      // obj[2] = "stt";
      int x = 10 / 0; // Step 1
      // "abc".charAt(3);
    } catch (StringIndexOutOfBoundsException e) { // Step 2
      System.out.println("Caught the StringIndexOutOfBoundsException");
    } catch (RuntimeException e) { // Step 3
      System.out.println("Caught the RuntimeException");
      if (e instanceof ArithmeticException) {
        System.out.println("Caught the ArithmeticException");
      }
    } catch (Exception e) {
      System.out.println("Caught the Exception");
    }
    System.out.println("Program ends");
  }

}
