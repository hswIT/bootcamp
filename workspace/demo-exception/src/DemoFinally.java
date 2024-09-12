public class DemoFinally {
  public static void main(String[] args) {

    try {
      "abc".charAt(3);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception");
    } finally {
      System.out.println("Finally..........");
    }
    System.out.println("Main.........");

    try {
      "abc".charAt(2);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception");
    } finally {
      System.out.println("Finally..........");
    }
    System.out.println("Main.........");
  }
}
