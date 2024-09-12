import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DemoApplyLambdaFunction {

  public static void main(String[] args) {
    // for-each
    List<String> strings = new LinkedList<>();
    for (String s : strings) {
      System.out.println(s);
    }
    //!!! List.foreach (Java 8) -> Consumer (functional interface)
    strings.forEach(s -> System.out.println(s));

    List<Customer> customers = Arrays.asList(new Customer(19), new Customer(30));
    // filter customer whose age > 20, and print his age
    customers.forEach((customer) -> {
      if (customer.getAge() > 20) 
        System.out.println(customer.getAge());
    });

    // default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
    Map<String, Integer> nameMap = new HashMap<>();
    nameMap.put("John", 30);
    nameMap.put("Peter", 7);
    nameMap.computeIfAbsent("Betty", s -> 3); 
    System.out.println(nameMap.get("Betty")); // 3
    nameMap.computeIfAbsent("Betty", s -> 4); 
    System.out.println(nameMap.get("Betty")); // 3


    nameMap.merge("Betty", 10, (original, multipler) -> original * multipler);
    System.out.println(nameMap.get("Betty")); // 30

    nameMap.merge("Vincent", 10, (x1, x2) -> x1 * x2);
    System.out.println(nameMap.get("Vincent")); // 10

    nameMap.merge("Vincent", 20, (x1, x2) -> {
      if (x1 + x2 > 25)
        return null;
      return x1 + x2;
    });

    nameMap.put("Oscar", -1);

    for (String key : nameMap.keySet()) {
      nameMap.merge(key, 2, (x1, x2) -> {
        if (x1 < 0)
          return null;
        return x1 * x2;
      });
    }
    System.out.println(nameMap);

  }
}
