import java.math.BigDecimal;

public class DemoNumber {
  public static void main(String[] args) {
    // public abstract class Number
    Number l = new Long(3);
    Number i = new Integer(3);
    Number s = new Short((short) 3);
    Number b = new Byte((byte) 3);
    Number f = new Float(3.99);
    Number d = new Double(3.0);

    s.intValue();
    s.longValue();
    s.floatValue();

    System.out.println(new Long(1).compareTo(new Long(3))); // -1
    // System.out.println(l.compareTo(f)); // Number.class does not have compareTo()
    System.out.println(sum(3, 4)); // 3 -> int -> Integer, 4 -> int -> Integer

    System.out.println(sum(l, b));
  }

  public static double sum(Number x, Number y) {
    double d = 0.0, d2 = 0.0;
    if (x instanceof Long)
      d = (Long) x;
    else if (x instanceof Short)
      d = (Short) x;
    else if (x instanceof Byte)
      d = (Byte) x;
    else if (x instanceof Integer)
      d = (Integer) x;
    else if (x instanceof Float)
      d = (Byte) x;
    else if (x instanceof Double)
      d = (Integer) x;
    if (y instanceof Long)
      d2 = (Long) y;
    else if (y instanceof Short)
      d2 = (Short) y;
    else if (y instanceof Byte)
      d2 = (Byte) y;
    else if (y instanceof Integer)
      d2 = (Integer) y;
    else if (y instanceof Float)
      d2 = (Byte) y;
    else if (y instanceof Double)
      d2 = (Integer) y;
    return BigDecimal.valueOf(d).add(BigDecimal.valueOf(d2)).doubleValue();

    
  }
}
