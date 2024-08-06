public class DemoComparision {
  public static void main(String[] args) {
    // >, <, >=, <=
    System.out.println(3 >= 2); // true
    int x = 10;
    int y = 11;
    boolean isYLargerThanX = y > x;
    System.err.println(isYLargerThanX); 

    System.out.println(x + 3 < y + 2); // false

    // ==, !=
    // Single "=" -> Assignment
    int x2 = 3;
    // Double "==" -> Compare if they are equal
    System.out.println(x2 == 4); // false

    System.out.println(x2 != 3); // false

    double d1 = 10.4;
    System.out.println(d1 <= 10.4); // true

    // More than one event
    int j1 = 10;
    int j2 = 12;
    System.out.println(j1 > 12); // false
    // AND &&
    // OR ||
    System.out.println(j1 > j2 || j1 < 11); // false || true -> true
    System.out.println(j1 > j2 && j1 < 11); // false && true -> false
    System.out.println(true || false); // false
    

  }
}
