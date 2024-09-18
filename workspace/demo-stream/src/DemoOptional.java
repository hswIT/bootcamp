import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOptional {

  public static void main(String[] args) {
    // String[] -> List<String>
    // !!! Arrays.asList() is just for non-primitive type
    String[] strings = new String[] {"abc", "ijk"};
    System.out.println(Arrays.asList(strings));

    int[] arr = new int[] {3, 10, 2, -9};
    // int[] -> List<Integer>
    // stream() + boxed()
    System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));

    // int[] -> IntStream
    Arrays.stream(arr) // IntStream
          .filter(e -> e > 1)
          .forEach(e -> System.out.println(e));

    System.out.println(Arrays
          .stream(arr)
          .filter(e -> e > 1)
          .sum());

    List<Customer> customers =Arrays.stream(arr).boxed() // Stream<Integer>
          .filter(e -> e >= 0)
          .map(age -> new Customer(age))
          .collect(Collectors.toList());
    System.out.println(customers);

    // !!! Optional !!!
    int[] arr2 = new int[] {3, 10, 1, 100};
    List<Integer> integers = Arrays.stream(arr2).boxed()
          .filter(e -> e > 10)
          .collect(Collectors.toList());
    System.out.println(integers.size());

    Optional<Integer> result = (Arrays.stream(arr2).boxed()
          .filter(e -> e > 10)
          //.findAny()); // return Optional<Integer>
          .findFirst()); // or finfAny()
    System.out.println(result);

    if (result.isPresent()) {
      System.out.println(result.get());
    } else {
      System.out.println("No result");
    }
    
    // !!! consumer (void)
    // !!! result.ifPresent => if (result.isPresent()) + do something
    result.ifPresent(e -> System.out.println(e));

    // Optional
    Optional<String> string = Optional.of("abc");
    // System.out.println(Optional.of(null)); // java.lang.NullPointerException

    Optional<String> string2 = Optional.ofNullable(null); // string2 is not null but an object which points to null
    System.out.println(string2); // Optional.empty

    Optional<String> string3 = Optional.empty();
    System.out.println(string3.isPresent()); // false

    // !!! How to resolve Optional of value
    // 1. isPresent() -> get()
    // 2. ifPresent()
    // 3. orElse() -> from Optional<T> to T
       System.out.println(result.orElse(10));
    // 4. orElseThrow()
       System.out.println(result.orElseThrow(() -> new RuntimeException("No value > 10")));
    // 5. orElseGet()
       System.out.println(result.orElseGet(() -> 10));

  public static Optional<Customer> get(String name){
    // select from Database
    return resultSet.stream()
              .filter(e -> e.getName())
              .findAny();
  }



  }
}
