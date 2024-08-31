
public interface Walkable {
  // COnstant
  public static final double PI = 3.14; // => write to double PI = 3.14, not add "public static final" explicitly
  // This is constant too
  int x = 24; // implicitly public static final
  static int y = 20; // public static final
  final int z = 20; // public static final
  static final int o = 20; // public static final
  public int w = 20; // public static final

  void walk(); // abstract method

  // After Java 8
  // instance method, by default inherited by the implementation class
  // Walkable => Person
  // can be overridden
  default int sum(int x, int y) {
    return x + y;
  }

  static int subtract(int x, int y) {
    return x - y;
  }


  public static void main(String[] args) {
    System.out.println(Walkable.PI);
    System.out.println(Walkable.x);

    // How to call sum()?
    System.out.println(new Person().sum(3, 2));
    System.out.println(Walkable.subtract(3, 2));

  }
}

// !!!!!!!!!!!! NOTE !!!!!!!!!!!!
// 1. 100% abstraction - no implementation in Interface
// 2. No attribute => ONLY public static final is allowed, and implicitly imposed
// 3. No constructor
// 4. After Java 8, default & static keyword insider Interface
