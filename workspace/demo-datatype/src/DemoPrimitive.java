public class DemoPrimitive {
  public static void main(String[] args) {
    // every line of java code must end with ;
    // Declaration and Assignment
    int x = 100;

    //Declaration
    // 'int' is a type that can store an integer
    int y;
    // Assignment
    y = -13;
    System.out.println(y); // -13
    // Re-assignment
    y = 9;
    System.out.println(y); //9

    System.out.println(x);
    System.out.println(20);
    System.out.println(x);

    //int age = 30;
    // int q = 30.5; // 30.5  30.5 is number with decimal
    double q = 30.5;
    System.out.println(q);

    double u = 10; // 10 is int value
    // when int value assigned to double type variable
    // Java will help auto-convert int value to double value (10 -> 10.0)

    //int k = 10.3;
    // 10.3 is a double value, you cannot assigne double value to int type variable
    // because the level of double type is higher than int type


    char c = 'a'; //single character
    char c2 = '9';
    char c3 = ' '; // white space
    //char c4 = ''; // at least one character

    double d1 = 3.3; // by default 3.3 is double value
    double d2 = 3.3d; // "d" is to describe 3.3 is a double value
    // float f1 = 3.3; // float is a lower level type than double, as double is a higher level type
    float f2 = 3.3f; // if assign to float, 3.3 has to come with suffix f

    double d3 = 3.3f; // 3.3f is a float value, can promote to double as assigning
    // to higher level.  (upcasting)

    int h = 4; // by fault 4 is int value
    long l1 = 4; // long is a higher level type than int, 4 is an int value -> 4 long value
    long l4 = 4L; // 4L is a long value

    // Primitives
    // byte, short, int, long,
    // float, double
    // char,
    // boolean

    // Interger: byte -> short -> int -> long
    byte b1 = 3; // from -128 to 127
    short s1 = 3; // from -32,768 to 32,767
    int i1 = 3; // from -2,147,483,648 to 2,147,483,647
    long l3 = 3; // from 2^63 to 2^64 - 1
    
    // 3 is an int value
    // int 3 is auto-convert to short or byte implicitly
    // int value -> byte value
    int i2 = 3;
    //byte b2 = i2; // Java doesn't allow higher level type to lower level type
    // compiler is unable to evaluate the variable

    //Assign byte variable to int variable
    int i3 = b1; // OK
    
    short s2 = b1;
    int i4 = b1;
    short s3 = 4900;

    boolean bl = false; 
    bl = true; 

    boolean result = 3 > 2; // true

    System.out.println(result);

    int age2 = 66;
    boolean isElderly = age2 > 65; // event or definition
    System.out.println(isElderly);
  }
}
