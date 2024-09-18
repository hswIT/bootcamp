#### Key Differences Between IntStream and Stream<Integer>

- 1. Data Types

      IntStream: Works with primitive int values.
      Stream<Integer>: Works with Integer objects (wrapper class for int).

- 2. Performance

      Boxing/Unboxing Overhead:
          IntStream: No boxing/unboxing; operates directly on primitives.
          Stream<Integer>: Requires boxing of int to Integer and unboxing back to int, which adds overhead.
      Memory Efficiency:
          IntStream: More memory-efficient due to the absence of object wrappers.
          Stream<Integer>: Each Integer object consumes more memory than a primitive int.

- 3. Available Operations

      Specialized Methods:
          IntStream: Methods like sum(), average(), max(), min() are available.
          Stream<Integer>: Does not have these methods; you need to map to IntStream or use custom collectors.
      Primitive-Specific Functional Interfaces:
          IntStream: Uses IntPredicate, IntFunction, IntConsumer, etc.
          Stream<Integer>: Uses standard Predicate<Integer>, Function<Integer, R>, Consumer<Integer>.

- 4. Use Cases

      IntStream: Preferred when working with sequences of primitive int values for mathematical computations or performance-critical applications.
      Stream<Integer>: Used when you need to work with methods or APIs that require object types, or when dealing with collections that store Integer objects.

### Remarks
  - Optional would ONLY be used as return type but not as parameter
