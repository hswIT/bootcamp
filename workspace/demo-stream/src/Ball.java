import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ball {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public static enum Color {
    RED, GREEN, BLUE,;
  }

  public Color getColor() {
    return color;
  }

  public int getValue() {
    return value;
  }

  public String toString() {
    return "Ball(" + "color= " + this.color + "value= " + this.value + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = List.of(new Ball(Color.RED, 3),
        new Ball(Color.GREEN, 100), new Ball(Color.BLUE, 3),
        new Ball(Color.RED, 10), new Ball(Color.BLUE, 1000));


    Map<Color, List<Ball>> ballsMap =
        balls.stream().collect(Collectors.groupingBy(e -> e.getColor()));
    // groupingBy(Classifier, Downstream)
    // Classifier: Function to extract the key (e.g., e -> e.getColor())
    // Downstream Collector: Collector to accumulate the values associated with a given key.
    // !!!Downstream Collector: 
    // !! Collectors.counting()/.averagingInt() / averagingDouble() / averagingLong()
    // !! Collectors.toSet() / Collectors.toList() / Collectors.toMap()
    // !! Collectors.joining() => Purpose: Concatenates string representations of elements in each group.

    System.out.println(ballsMap);

    System.out.println(balls.size());

    Map<Color, Integer> valueMap =
        balls.stream().collect(Collectors.groupingBy(e -> e.getColor(),
            Collectors.summingInt(e -> e.getValue())));

    System.out.println(valueMap);

    // Average 
    Map<Color, Double> valueMap2 =
        balls.stream().collect(Collectors.groupingBy(e -> e.getColor(),
            Collectors.averagingInt(e -> e.getValue())));

    System.out.println(valueMap2);

    // BLUE -> max value (1000)
    // OptionalInt is a container class that may or may not contain an int value. 
    // It is a specialized version of Optional<T>
    OptionalInt optint = balls.stream()
      .filter( (e -> e.getColor() == Color.BLUE)) // can filter out nothing
      //.max(e -> e.getValue())
      .mapToInt(e -> e.getValue()) // converts each element in a stream to an int, producing an IntStream
      .max(); // return OptionalInt Object as balls may be size 0
      // risk if using getAsInt() and assign back to line 1 int

    if (optint.isPresent()) {
      System.out.println(optint.getAsInt());
    } else {
      System.out.println("No Ball No Max value");
    }

    // !!! maxBy() - Find the ball with max value for a given color
    Map<Color, Optional<Ball>> valueMap3 = balls.stream() //
        .collect(Collectors.groupingBy(e -> e.getColor(),
            Collectors.maxBy(Comparator.comparingInt(e -> e.getValue()))));
    System.out.println(valueMap3.get(Color.BLUE)); // Ball[BLUE, 1000]

    // Partition By (separated all elements into 2 groups)
    Map<Boolean, List<Ball>> ballValueMap = balls.stream() //
        .collect(Collectors.partitioningBy(b -> b.getValue() > 500));

    System.out.println(ballValueMap);
    // {false=[Ball(color=RED, value3), Ball(color=BLUE, value3),
    // Ball(color=RED, value10), Ball(color=GREEN, value100)],
    // true=[Ball(color=BLUE, value1000)]}

    // Example
    IntStream intStream = IntStream.of(1, 2, 3);
    Stream<Integer> integerStream = intStream.boxed();
    integerStream.forEach(System.out::println); // Prints Integer objects


  }
}
// !!! Remarks
// Methods of OptionalInt:

//isPresent(): Returns true if a value is present, otherwise false.
//getAsInt(): Returns the contained int value if it is present, otherwise throws NoSuchElementException.
//orElse(int other): Returns the contained value if present, otherwise returns the specified default value.
//orElseGet(IntSupplier other): Returns the contained value if present, otherwise invokes the provided IntSupplier to get a value.
//orElseThrow(): Returns the contained value if present, otherwise throws NoSuchElementException.