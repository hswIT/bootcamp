
public class Demoif {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x is greater than or equal to 30"); // print
    } else {
      System.out.println("x is less than 30");
    }

    boolean isLargeThan30 = x >= 30; // true
    if (isLargeThan30) {
      System.out.println("x is greater than or equal to 30"); // print
    } else {
      System.out.println("x is less than 30");
    }


    // String contains method
    String s1 = "hello";
    System.out.println(s1 + " does contains " + s1.contains("ll"));
    System.out.println(s1 + " does contains " + s1.contains("ee"));



    // Example 1
    int number = -3;

    if (number >= 0) {
      System.out.println("The number is positive");
    } else {
      System.out.println("The number is negative");
    }

    // Example 2 (avoid event overlap)
    int score = 85;

    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 50;
    int b = 10;
    int max;
    int min;

    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min);



    // if (a > b) {
    // System.out.println(a + " is larger than " + b);
    // } else if (a < b) {
    // System.out.println(b + " is larger than " + a);
    // } else {
    // System.out.println(a + " is equal to " + b);
    // }

    // Example 4
    String day = "Monday";

    if ("Saturday".equals(day) || "Sunday".equals(day)) {
      System.out.println(day + " is Weekend");
    } else if ("Monday".equals(day) || "Tuesday".equals(day)
        || "Wednesday".equals(day) || "Thursday".equals(day)
        || "Friday".equals(day)) {
      System.out.println(day + " is Weekday");
    } else {
      System.out.println("Invalid day");
    }

    // Example 5
    int num = 9;

    if (num % 2 == 0) {
      System.out.println(num + " is an even number");
    } else {
      System.out.println(num + " is an odd number");
    }

    // Example 6
    String str = "Make";

    // if (str.isEmpty()) {
    // System.out.println("The string is empty");
    // } else {
    // System.out.println(str.charAt((str.length() - 1)));
    // }

    if (str.length() == 0) {
      System.out.println("The string is empty");
    } else {
      System.out.println(str.charAt((str.length() - 1)));
    }

    // Exmample 7
    String s = "abcdef";
    String[] array = s.split("");
    int sIndex = array.length - 1;
    String[] reverseArray = new String[array.length];

    for (String c: array) {
      reverseArray[sIndex] = c;
      sIndex -= 1;
    }
    String reverseString = String.join("", reverseArray);
    System.out.println(reverseString);



    // Example 8
    // Leap Year
    // 1. Divisible by 4
    // 2. Not Divisible by 100
    // 3. OR Divisible by 400
    // e.g 1900 is not a leap year, 2000 & 2004 is a leap year

    int year = 2003;

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }

    // Example 9
    int age = 17;
    boolean isCitizen = true;

    if (age >= 18 && isCitizen) {
      System.out.println("Eligible to vote");
    } else {
      System.out.println("Not eligible to vote");
    }

    // Eligible to vote
    // Not eligible to vote age < 18
    // Not eligible if not a citizen
    // Not eligible if age < 18 and not a citizen
    // Eligible if age >= 18 and a citizen

    // Example 10
    double totalPurchase = 100.0;
    int discount;
    double amountToPay;

    if (totalPurchase >= 500) {
      discount = 20;
      amountToPay = totalPurchase * (1 - (discount / 100.0));
    } else if (totalPurchase >= 200 && totalPurchase < 500) {
      discount = 10;
      amountToPay = totalPurchase * (1 - (discount / 100.0));
    } else {
      discount = 0;
      amountToPay = totalPurchase;
    }

    System.out.println("Discount amount = $" + discount);
    System.out.println("Amount to Pay = $" + amountToPay);

    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount

    // Example 11
    char c = 'z';

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is a vowel");
    } else {
      System.out.println(c + " is a consonant");
    }

    // a, e, i, o, u -> vowel
    // a is vowel
    // c is consonant

    // Example 12
    String password = "Admin1234567#";



    if ((password.contains("#") || password.contains("$")
        || password.contains("!") || password.contains("@"))
        && password.length() > 12) {
      System.out.println("It is a strong password");
    } else {
      System.out.println("It is a weak password");
    }

    // # ! @ $ -> special character
    // password length >= 12
    // It is a strong password
    // It is a weak password if there is no special character
    // It is a weak password if length < 12
  }

}

