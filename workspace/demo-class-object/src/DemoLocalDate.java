import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;


// StringBuilder, Math, Wrapper Class, String (auto import)

public class DemoLocalDate {

  public static void main(String[] args) {
    // 2024-08-30
    // 2024/08/31

    LocalDate date = LocalDate.of(2024, 8, 30);
    System.out.println(date);
    System.out.println(date.plusMonths(3)); // return new object (not revise itself)
    System.out.println(date);
    System.out.println(date.plusDays(90)); // 2024-11-28

    LocalDate yearEnd = LocalDate.of(2024, 12, 31);
    System.out.println(yearEnd.plusDays(1)); // 2025-01-01

    DayOfWeek dow = date.getDayOfWeek();
    System.out.println(dow);

    if (date.getDayOfWeek().equals(DayOfWeek.of(5))) {
      System.out.println("It is Friday");
    }

    // !!! Normally, "==" is checking if they are in the same address/object
    if (date.getDayOfWeek() == (DayOfWeek.of(5))) {
      System.out.println("It is Friday");
    }

    System.out.println(date.compareTo(LocalDate.of(2024, 8, 29))); // 8/30 > 8/29
    System.out.println(date.compareTo(LocalDate.of(2024, 8, 30))); // 0
    System.out.println(date.compareTo(LocalDate.of(2024, 9, 1))); // -1
    System.out.println(date.compareTo(LocalDate.of(2024, 8, 6))); // 24
    System.out.println(date.compareTo(LocalDate.of(2024, 9, 17))); // -1

    LocalDate[] dates =
        new LocalDate[] {LocalDate.of(2024, 2, 28), LocalDate.of(2024, 2, 28),
            LocalDate.of(2024, 7, 30), LocalDate.of(2025,1,21)};

    // Find the max date
    LocalDate maxDate = LocalDate.of(1,1,1);
    for (LocalDate d : dates) {
      if (d.compareTo(maxDate) > 0) {
        maxDate = d; // change object
      }
    }
    System.out.println(maxDate);

    // for (int i = 0; i < dates.length; i++) {
    // if (dates[i].compareTo(maxDate) > 0)
    // maxDate = dates[i];
    // }
    
    dates[3] = LocalDate.of(2026, 1, 1); // LocalDate.of creates a new object.
    System.out.println(Arrays.toString(dates)); // [2024-02-28, 2024-02-28, 2024-07-30, 2026-01-01]
    System.out.println(maxDate); // 2025-01-01, while maxDate is pointing to the old dates[3] object

    // LocalDate, String, BigDecimal -> immutable
    // "Immutable" -> the object has no method to revise itself

    String s = "hello";
    s = s.concat("!!!"); // one object, two objects
    String s2 = s.concat("???"); // String object s won't change (2 references, 2 objects)

    String str7 = new String("hello").intern();
    String str8 = "hello";
    System.out.println(str7 == str8); // true

    // valueOf() => Pool
    String str11 = String.valueOf("abc"); // 10 // valueOf() is placing the string in the pool
    String str12 = "abc"; // 10
    System.out.println(str11 == str12); // true

    // SUmmary
    // 1. valueOf => Pool
    // 2. New String => NOT into the pool
    // 3. "" => Pool
    // 4. new String().intern() => Pool

    Integer n1 = 127;
    Integer n2 = 128;
    System.out.println("Row87 : " + n1.equals(n2));
    System.out.println(n1.compareTo(n2)); // -1

    // Within -128 to 127 (Pool)
    Integer n3 = 127;
    System.out.println(n1 == n3); // true

    // Out of the range -128 to 127 (No pool)
    Integer n4 = 128;
    System.out.println(n2 == n4); // false

    Integer n5 = -129;
    Integer n6 = -129;
    System.out.println(n5 == n6); // false

    Integer n7 = new Integer(127);
    System.out.println(n7 == n3); // false

    Integer n8 = Integer.valueOf(127);
    System.out.println(n3 == n8); // true

    Integer n9 = Integer.valueOf(128);
    System.out.println(n3 == n9); // false
  }
}
