package StreamExercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;



public class JavaStreamEx{
  public static void main(String[] args) {



  // Question 1:
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .collect(Collectors.toList());

  Collections.sort(evenNumbers, (n1, n2) -> n2.compareTo(n1));
  System.out.println(evenNumbers);
  

  // Question 2:
  List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
  List<String> nameStartWIthA = names.stream()
        .filter(s -> s.startsWith("A"))
        .collect(Collectors.toList());
  System.out.println(nameStartWIthA);

  // Question 3:
  List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
  Optional<Integer> max = numbers2.stream().max((n1, n2) -> n1.compareTo(n2));
  Optional<Integer> min = numbers2.stream().max((n1, n2) -> n2.compareTo(n1));
  System.out.println("Max: " + max.get());
  System.out.println("Max: " + min.get());

  // Question 4:
  List<String> words = Arrays.asList("apple", "banana", "pear");
  List<Integer> wordsLength = words.stream()
        .map(s -> s.length())
        .collect(Collectors.toList());
  System.out.println(wordsLength);

  // Question 5:
  List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
  long moreThanThree = words2.stream()
        .filter(s -> s.length() > 3)
        .count();
  System.out.println(moreThanThree);

  // Question 6:
  List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
  Set<Integer> setNumber3 = numbers3.stream()
        .filter(n -> n > 10)
        .collect(Collectors.toSet()); 
  System.out.println(setNumber3);

  // Question 7:
  List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
  Map<String, Integer> nameAndScore = students.stream()
        .collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
  System.out.println(nameAndScore);

  // Question 8:
  List<Employee> employees = Arrays.asList(
        new Employee("John", 65000),
        new Employee("Jane", 55000),
        new Employee("Doe", 45000)
  );
  Map<String, Integer> employeeMap = employees.stream()
        .filter(e -> e.getSalary() > 50000)
        .collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
  System.out.println(employeeMap.keySet());

  // Question 9:
  List<Person> people = Arrays.asList(
        new Person("Alice", 30),
        new Person("Bob", 25),
        new Person("Charlie", 30)
  );
  Map<Integer, List<Person>> personMap = people.stream()
        .collect(Collectors.groupingBy(ppl -> ppl.getAge()));
  System.out.println(personMap);

  // Question 10:
  List<Person> people2 = Arrays.asList(
      new Person("Alice", "Female"),
      new Person("Bob", "Male"),
      new Person("Charlie", "Male")
  );

  Map<Boolean, List<Person>> personMap2 = people2.stream()
      .collect(Collectors.groupingBy(ppl -> ppl.getGender().equals("Female") ? false : true));
  System.out.println(personMap2);

  }
}
