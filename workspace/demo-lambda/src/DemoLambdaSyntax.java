public class DemoLambdaSyntax {

  public static void main(String[] args) {
    Superman superman1 = new Superman();
    superman1.fly();

    Flyable superman2 = new Superman();
    superman2.fly();

    // !!!!!! The below 2 ways (superman3 and superman4) create object with Class
    // Java 8 - lambda expression
    Flyable superman3 = () -> System.out.println("Super is flying ...");
    superman3.fly();

    // Anonymous
    Flyable superman4 = new Flyable() { // new Anonymous class that implements Flyable
      @Override
      public void fly() {
        System.out.println("Superman is flying ...");
      }
    };
    superman4.fly();

    // Calculator
    MathOperation addition = (x, y) -> x + y; // match the signature of the functional interface, addition is instance1 of MathOperation
    MathOperation subtraction = (x, y) -> x - y; // subtraction is instance2 of MathOperation

    System.out.println(addition.compute(3, 2));
    System.out.println(subtraction.compute(3, 2));

    // Other syntax ....
    // More than one line of code
    // 1. Need to add code block {}
    // 2. Need to use "return"

    MathOperation process = (a, b) -> { // this is similar to write class
      if (a > 10)
        return a + b;
      return a - b;
    };
    MathOperation process2 = (a, b) -> a > 10 ? a + b : a - b;
    process2.compute(11,1);
    process.compute(10,1);

    StringManager concatHello = str -> str.concat("hello");
    System.out.println(concatHello.operate("John"));

    StringManager removeSpace = str -> str.replace(" ", "");
    System.out.println(removeSpace.operate(" abc  ccc "));
  }
}
