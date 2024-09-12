package inner;

public class Outer {
  private int x;

  public Outer(int x) {
    this.x = x;
  }

  public int getX() {
    return this.x;
  }

  // !!! Outer object cannot access Inner Object attribute
  // public double getY() {
  //   return y;
  // }

  public double getInnerY() { // provided by chatGPT
    Inner inner3 = new Inner(10.5); // Create an instance of the Inner class
    return inner3.getY(); // Accessing y through the Inner class instance
}

  public class Inner {
    private double y;

    public Inner(double y) {
      this.y = y;
    }


    public double getY() {
      return this.y;
    }

    // !!! OK
    public int getX() {
      return x;
    }
  }

  public static void main(String[] args) {
    // Approach 1: create outer object and its reference first
    Outer outer = new Outer(10);
    Outer.Inner inner = outer.new Inner(20.5);
    System.out.println(inner.getY()); // 20.5
    System.out.println(inner.getX()); // 10

    // Apporach 2: create Inner Object directly
    Outer.Inner inner2 = new Outer(10).new Inner(20.5);
    System.out.println(inner2.getY()); // 20.5
    System.out.println(inner2.getX()); // 10

    System.out.println("using getInnerY: " + outer.getInnerY());

    CharSequence s = "abc";
    System.out.println(s instanceof String); // true
    System.out.println(s.getClass()); // class java.lang.String


  }
}
