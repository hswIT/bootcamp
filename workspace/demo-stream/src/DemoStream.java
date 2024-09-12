import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        // Stream.class
        // block the constructor, can only use of()
        Stream<String> strings = Stream.of("abc", "def");
        // for-each (Stream cannot use for - each as it is not iterable)
        // for (String string : strings) {
        // System.out.println(string);
        // }

        // Both List and Stream can use forEach()
        strings.forEach(s -> {
            System.out.println(s);
        });

        Stream<Customer> customers =
                Stream.of(new Customer(18, "John"), new Customer(20, "Steven"));
        customers.forEach(
                c -> System.out.println(c.getName() + ", " + c.getAge()));

        // After Java 8, we have Stream.class, which contains lots of powerful
        // methods / functionality

        // !!!!! (1) convert List to Stream - stream()
        List<Customer> customers2 = Arrays.asList(new Customer(18, "John"),
                new Customer(20, "Steven"));
        Stream<Customer> customerStream = customers2.stream();
        // !!! (2) Convert Stream to List - collect()
        List<Customer> customers3 = customerStream.collect(Collectors.toList());

        // Stream Object -> filter() + collect()
        // Similar to for loop + if
        List<Customer> customers4 = customers2.stream() // return Stream<Customer>
                .filter(customer -> customer.getAge() > 18) // return Stream<Customer>
                .collect(Collectors.toList()); // return List<Customer>

        System.out.println(customers4); // [Customer(name=Steven, age20)]

        List<String> names = customers2.stream() // return Stream<Customer>
                .map(customer -> customer.getName()) // !!! return Stream<String>
                .collect(Collectors.toList()); // return List<String>

        System.out.println(names);

        // filter() + map() can work together
        // 1. filter() before map()
        // 2. map() before filter()

        List<String> names2 =
                customers2.stream().filter(customer -> customer.getAge() > 18)
                        .map(customer -> customer.getName())
                        .collect(Collectors.toList());

        System.out.println("filter first map afterwards " + names2);

        List<String> names3 =
        customers2.stream()
                .map(customer -> customer.getName())
                .filter(customer -> customer.charAt(0) == 'S')
                .collect(Collectors.toList());

        System.out.println("map first filter afterwards " + names3);

        // sum(), count()
        long count = customers2.stream()
            .count();
        System.out.println(count); // 2

        // Stream object => mapToInt() => IntStream object => sum()
        int sumOfAges = customers2.stream()
            .mapToInt(c -> c.getAge())
            .sum();

        System.out.println(sumOfAges);

        // IntStream object => max(), min(), average()

        // IntStream object => distinct()

        // Collect to Set

        // Array to Stream to Stream<Integer> to List<Integer>
        int[] arr = new int[] {3, 2, 1, 2};
        IntStream ints = Arrays.stream(arr);
        Stream<Integer> integers = ints.boxed();
        Set<Integer> integerSet = integers.collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
