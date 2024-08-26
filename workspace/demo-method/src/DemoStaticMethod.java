public class DemoStaticMethod {

  public static void main(String[] args) {
    //Approach 1
    //  Bad => careless mistake
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 * 3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 * 3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 * 3.14);

    // Approach 2
    // Bad
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    double area = 0.0;
    for (int i = 0; i < radiusList.length; i++) {
      area = radiusList[i] * radiusList[i] * 3.14;
      System.out.println(area);

    
    }
    

        // Approach 3
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    // sum up all circle area
    double totalArea = 0.0;
    for (int i = 0; i < radiusList2.length; i++) {
      totalArea += calculateAreaForCircle(radiusList2[i]);
    }
    System.out.println(totalArea);

    String encrypted = encrypt("abc");
    System.out.println("Encrypted: " + encrypted);

    System.out.println(sum(1, 2)); // int, int

    // during compile time, checked that there are no sum(double, double)
    // default double type, cannot downcast to float 
    // System.out.println(sum(1.0, 7.0)); // double, double

    // promotion take place
    System.out.println(sum(1L, 22L)); // long, long => double , double
    System.out.println(sum((byte) 1, (byte) 2)); // byte, byte =>  int , int
    System.out.println(sum(1.2f, 8.6f)); // float, float => double, double

    print(5, 6);
    System.out.println(calculateAreaForSquare(5.6));
    System.out.println(calculateAreaForCircle(5.6));


  }



// calculateCircleArea

  public static double calculateAreaForSquare(double length) {
    return Math.pow(length, 2);
  }


  
      // if inut is able to produce output, then is is a static method
  public static double calculateAreaForCircle(double radius) {
    //return radius * radius * Math.PI;
    return Math.pow(radius, 2.0) * Math.PI;
  }
  // if output type = String, then you must return String value inside the method

  // Static method
  // encrypt("abc") similar to System.out.println("abc");

  // instance method
  // "abc".charat(0) -> object presentation

  // input String -> output String
  public static String encrypt(String password){
    char[] characters = password.toCharArray();
    String encrypted = "";
    for (int i = 0; i < characters.length; i++) {
      encrypted += (char) ((characters[i] + 3) * 2);
    }
    return encrypted;
  }

  public static String encrypt2(String password) {
    char[] characters = password.toCharArray();
    String encrypted = "";
    int left = -1, right = -1;
    for (int i = 0; i < characters.length; i++) {
      left = characters[i] / 4;
      right = characters[i] % 4;
      encrypted += left + right;
    }
    // sum=17, result1 = 4, result2 = 1
    return encrypted;
  }

  public static String decrypt(String encrypted){
    char[] characters = encrypted.toCharArray();
    String original = "";
    for (int i = 0; i < characters.length; i++) {
      original += (char) ((characters[i] + 3) * 2);
    }
    return original;
  }


  // Method signature = Method Name + No. of Parameters & Type of Parameters
  // Return type is not part of signature
  // can reuse the method name as long as they have different signatures
  // Method name => start with verb
  public static int sum(int x, int y) {
    System.out.println("Method sum(int x, int y)");
    return (x + y);
  }
  public static int sum(int x, int y, int z) {
    System.out.println("Method sum(int x, int y, int z)");
    return (x + y + z);
  }

  // Method Signature 
  // sum(double x, double y) != sum(int x, int y)
  public static int sum(float x, float y) {
    System.out.println("Method sum(double x, double y)");
    return (int)(x + y);
  }

  // compiler doesn't take care of the return type
  // Reason is because the retrun type can convert to another type by using .longValue, .floatValue........
  // So there is no need to create another method
  // public static float sum(float x, float y) {
  //   System.out.println("Method sum(double x, double y)");
  //   return (int)(x + y);
  // }

  // Return type: primitives + wrapper + String
  // void => return nothing (No "return" keyword)
  public static void print(int x, int y) {
    System.out.println("x= " + x);
    System.out.println("y= " + y);

  }

}
