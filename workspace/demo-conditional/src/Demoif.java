public class Demoif {
  public static void main(String[] args) {
    int x = 30;
    
    if (x >= 30) {
      System.out.println("x is greater than or equal to 30"); // print
    } else {
      System.out.println("x is less than 30");
    }

    boolean isLargeThan30 = x >= 30; // true
    if (isLargeThan30) {
      System.out.println("x is greater than or equal to 30"); // print
    } else {
      System.out.println("x is less than 30");
    }
  }
}
