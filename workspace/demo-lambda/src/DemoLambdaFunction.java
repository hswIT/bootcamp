import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambdaFunction {
  public static void main(String[] args) {
    // e.g. Function.class, f(x) = y
    // interface Function<T, R>
    // R apply(T t)

    Function<String, Integer> stringlength = str -> str.length(); // Formula, not execution
    System.out.println(stringlength.apply("Hello"));

    Function<Character, Boolean> charbool = c1 -> c1 == 'a';
    System.out.println(charbool.apply('b'));

    // Runtime Formula (differs to Class instance method and static method)
    // Memory usage occupied when executing VS loading the class
    Function<List<String>, Set<String>> lengthlargerthan3 = strings -> {
      Set<String> newStrings = new HashSet<>();
      for (String s : strings) {
        if (s.length() >= 3)
          newStrings.add(s);
      }
      return newStrings;
    };

    List<String> stringList = Arrays.asList("abcd", "abc", "abcd", "abcde");
    Set<String> stringSet = lengthlargerthan3.apply(stringList);
    System.out.println(stringSet);

    // !!! BiFunction.class
    // BiFunction
    // public interface BiFunction<T, U, R>
    // R apply(T t, U u);

    BiFunction<String, Integer, Map<String, Integer>> mapping = (k, v) -> {
      Map<String, Integer> maps = new HashMap<>();
      for (Map.Entry<String, Integer> map : maps.entrySet()) {
        maps.put(k, v);
      }
      return maps;
    };

    System.out.println("mapping = " + mapping.apply("Matt", 45));


    BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("Hello ", "World"));

    // !!! Consumer.class
    // public interface Consumer<T>
    // void accept(T t);
    Consumer<String> print = s -> System.out.println(s);
    print.accept("Good");
    print.accept("Morning");

    Consumer<List<String>> printer = strings -> {
      for (String s : strings) {
        System.out.println(s);
      }
    };
    printer.accept(stringList);



    // !!! BiConsumer.class
    // public interface BiConsumer<T, U>
    // void accept(T t, U u);
    BiConsumer<String, String> concat2 =
        (s1, s2) -> System.out.println(s1.concat(s2));
    concat2.accept("Nice ", "Dinner");

    BiConsumer<Map<Integer, String>, Integer> printMapValue =
        (map, key) -> System.out.println(map.get(key));


    Map<Integer, String> nameMap = new HashMap<>();
    nameMap.put(1, "John");
    nameMap.put(2, "Peter");

    printMapValue.accept(nameMap, 2);


    // Supplier
    // public interface Supplier<T>
    // T get();
    // !!! "Math.random();" is a formula to return a double, but not return Double
    Supplier<Double> randonNumber = () -> Math.random();
    System.out.println(randonNumber.get());

    // Predicate
    // public interface Predicate<T>
    // boolean test(T t);
    // !!!! "customer -> customer.getAge() >= 18;" is a formula to return True or False
    Predicate<Customer> isAdult = customer -> customer.getAge() >= 18;
    System.out.println(isAdult.test(new Customer(18)));
    System.out.println(isAdult.test(new Customer(17)));

    Predicate<Customer> isNameStartsWithA =
        customer -> customer.getName().startsWith("A");

    System.out.println("test " + isAdult.and(isNameStartsWithA).test(new Customer(18, "Alex")));
    System.out.println("test " + isAdult.and(isNameStartsWithA).test(new Customer(18, "Peter")));
    System.out.println("test " + isAdult.and(isNameStartsWithA).test(new Customer(19, "Peter")));


    // BiPredicate
    // public interface BiPredicate<T, U>
    // boolean test(T t, U u);
    // BiPredicate<Customer, Integer> isAdult2 = (customer, age) -> customer.getAge() >= age;
    // System.out.println(isAdult2.test(new Customer(18), 18));
    // System.out.println(isAdult2.test(new Customer(17), 18));

    BiPredicate<Customer, Customer> isOlderThan =
        (c1, c2) -> c1.getAge() > c2.getAge();
    System.out.println(isOlderThan.test(new Customer(18), new Customer(17)));
    System.out.println(isOlderThan.test(new Customer(17), new Customer(18)));

    // UnaryOperator<T> extends Function<T, T>
    UnaryOperator<String> replaceSpaceEmptyString = s -> s.replace(" ", "");
    System.out.println(replaceSpaceEmptyString.apply("Hello World !!!!"));
    // alternatively, Function<T, R> T and R is different, UnaryOperator<T> force Function<T, T> to have T
    Function<String, String> replaceSpaceEmptyString2 = s -> s.replace(" ", "");
    System.out.println(replaceSpaceEmptyString2.apply("Hello World !!!!"));

    // public interface BinaryOperator<T> extends BiFunction<T,T,T>
    BinaryOperator<String> firstCharacters = (s11, s12) -> {
      String result = "";
      if (s11 != null && s11.length() > 0) {
        result += s11.charAt(0);
      }
      if (s12 != null && s12.length() > 0) {
        result += s12.charAt(0);
      }
      return result;
    };
    System.out.println(firstCharacters.apply("abc", "ijk"));



  }
}

