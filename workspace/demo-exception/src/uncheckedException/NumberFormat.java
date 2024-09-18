package uncheckedException;
public class NumberFormat {

  public static void main(String[] args) {
    try {
    double dp = Double.parseDouble("100.34");
    System.out.println("dp = " + dp);
    double dp2 = Double.parseDouble("100.34.5"); // runtime error
    System.out.println("dp = " + dp2); // skip
    double dp3 = Double.parseDouble("110.1");
    System.out.println("dp3 = " + dp3);

    } catch (NumberFormatException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
