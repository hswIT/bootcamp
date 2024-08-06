public class DemoMathOperation {
  public static void main(String[] args) {
    int x = 10 + 3;

    System.out.println(x); // 13
    x = x + 3 - 9;
    System.out.println(x); // 7

    x = x - 5 * 2; // 5 x 2 first
    System.out.println(x); // -3

    x = (x - 1) / 2; // (-3 - 1) / 2
    System.out.println(x); // -2

    // Special operator -> %
    int reminder = 5 % 2;
    System.out.println(reminder); // -1

    int reminder2 = 10 % 2;
    System.out.println(reminder2); // 0
    //System.out.println(10 / 0); // 0

    int j = 5;
    System.out.println(10 / j); // 5

    double d6 = 10.6 / 0;
    System.out.println(d6); // Infinity
    
    double d7 = 0.2 + 0.1;
    System.out.println(d7); // 0.30000000000000004

    // + 1 operation
    int a = 1;
    a = a + 1;
    a++;
    ++a;
    a += 1;
    System.out.println(a); // 5

    // + 2 operation
    int b = 1;
    b = b + 2;
    b += 2;
    System.out.println(b); // 5

    // -1 operation
    a = a - 1;
    a--;
    --a;
    a -= 1;
    System.out.println(a); // 1

    // do *2 operation
    b = b * 2;
    b *= 2;
    System.out.println(b); // 20

    // Divide 3 opereation
    int r = 99;
    r = r / 3;
    r/= 3;
    System.out.println(r); // 11

    // Example 1
    int apple = 3;
    int orange = 10;
    double pricePerApple = 3.3;
    double pricePerOrange = 5.5;

    double totalAmount = (apple * pricePerApple) + (orange * pricePerOrange);
    // int * double + int * double
    // double * double + double * double
    System.out.println(totalAmount); // 3 * 3.3 + 10 * 5.5

    // Example 2
    int maths = 90;
    int english = 78;
    int history = 62;

    double averageScore = (maths + english + history) / 3.0;
    // (int + int + int) / int
    // int / int -> int 
    // when it is 3.0, it become int / double -> double
    // 3 is an int, 3.0 is a double
    // 230/3 -> 76.6666
    System.out.println(averageScore);

    // ++x, x++, --x, x--
    int k = 0;
    int o = k++ + 3; 
    // k + 3 
    // 1. k + 3
    // 2. Assignment
    // 3. k + 1
    System.out.println(o); // 3
    System.out.println(k); // 1

    int u = 0;
    int e = ++u + 3;
    // 1. u + 1
    // 2. u + 3
    // 3. Assignment
    System.out.println(e); // 4
    System.out.println(u); // 1

  }
}
