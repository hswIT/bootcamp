## Generics

### Generics Type can be written in Class level
  - public class Box<T>
  - the type of attribute be T
  - instance method can be generic (public T getValue())
  - At compile time
  - At runtime, you have to define the exact type of T

### Generics Type can be written in static method level
  - You have to define the range of the generic type in the method signature
  - public static <T> Box<T> createBox(T value)
