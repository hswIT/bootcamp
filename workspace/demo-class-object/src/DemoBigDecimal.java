import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

  public static void main(String[] args) {
    // A special type in Java
    // Problem (double, float, int,in Math operation +,-,*,/)
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    System.out.println(0.2 * 0.1); // 0.020000000000000004
    System.out.println(0.2f + 0.1f); // 0.3

    double x = 0.1 + 0.2;
    if (x == 0.3) {
      System.out.println("Equal");
    } else {
      System.out.println("Not equal");
    }

    // BigDecimal (double)
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    // instance method
    double result = bd1.add(bd2).doubleValue();
    System.out.println(result); // 0.3

    double multiply = bd1.multiply(bd2).doubleValue();
    System.out.println(multiply); // 0.02

    String divide = bd1.divide(bd2).toString();
    System.out.println("divide: " + divide);
    System.out.println(bd1.subtract(bd2));

    // for most the cases, you should start with a double primitive
    bd1 = BigDecimal.valueOf(10);
    System.out.println(bd1);
    bd2 = BigDecimal.valueOf(3);
    // System.out.println(bd1.divide(bd2,BigDecimal.ROUND_HALF_UP).doubleValue());
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); // 3.0
    // System.out.println(bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP)); // 3.333 => 3.33
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP)); // 3.333 => 3.33
    // System.out.println(bd1.divide(bd2,2,BigDecimal.ROUND_CEILING )); // 3.333 => 3.34
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING)); // 3.333 -> 3.34

    // Non-terminating decimal expansion
    // bd1.divide(bd2).setScale(2, RoundingMode.HALF_UP).doubleValue(); // 3.3333333....


    double m = 0.0;
    if (m == 0.0) {
      result = 0.0;
    } else {
      result = bd1.divide(BigDecimal.valueOf(m), 2, RoundingMode.HALF_UP)
          .doubleValue();
    }
    System.out.println("Row53 " + result);

    System.out.println("Row56 " + BigDecimal.valueOf(10 / 3)
        .setScale(2, RoundingMode.UP).doubleValue());

    // equals() => comparing the content and the types
    System.out
        .println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); // false
    System.out
        .println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); // true
    System.out.println(BigDecimal.valueOf(10L)
        .doubleValue() == (BigDecimal.valueOf(10.0).doubleValue())); // true

    // compareTo() => comparing the content
    System.out
        .println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); // 0
    System.out
        .println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
    System.out
        .println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1


    double d1 = new BigDecimal("0.1").add(new BigDecimal("0.2")).doubleValue();
    System.out.println(d1); // 0.3

    double d2 = new BigDecimal(0.1).add(new BigDecimal(0.2)).doubleValue();
    System.out.println(d2); // 0.30000000000000004

    // USe valueOf() instead of new BigDecimal()
    double d3 =
        BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(d3); // 0.3

    // when float (0.1f) -> double (0.1d)
    // the reason behind is float turn into double then double.toString
    // the solution is to convert from float to String directly
    float d4 =
        BigDecimal.valueOf(0.1f).add(BigDecimal.valueOf(0.2f)).floatValue(); // 0.3xxx
    System.out.println(d4);

    float f1 = 0.1f;
    float f2 = 0.2f;
    // !!!!!!!!!!! Cautious !!!!!!!!!!!!!
    System.out.println("float + float " + new BigDecimal(String.valueOf(f1))
        .add(new BigDecimal(String.valueOf(f2)))); // 0.3



  }
}
