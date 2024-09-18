package methodinference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    
    Supplier<Book> bookSupplier = () -> new Book(); // lambda expression
    Supplier<Book> book = Book::new; // method reference (one output)

    //!!! not OK, "Book::new" is a formula to create Book object
    // Book book = Book::new;

    // static method (void)
    List<Integer> integers = Arrays.asList(1, 2, 3, 4);
    integers.forEach(e -> System.out.println(e));
    integers.forEach(System.out::println); // method reference (one input)

    // instance method (with return value, NO parameter)
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length();
    System.out.println(nameLength.get());

    Supplier<Integer> nameLength2 = name::length;
    System.out.println(nameLength2.get()); // method reference (one output)
    
    // Two input + One output
    List<String> strings = Arrays.asList("apple", "orange", "banana");
    Comparator<String> formula = (s1, s2) -> s1.compareTo(s2); // lambda expression (Comparator)
    Collections.sort(strings, formula);
    System.out.println(strings);

    // method reference (Comparator)
    strings = Arrays.asList("apple", "orange", "banana");
    // !!! compareTo is an instance method in String.class
    Comparator<String> formula2 = String::compareTo; 
    Collections.sort(strings, formula2);
    System.out.println(strings); // [apple, banana, orange]
  }
}
