import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;
public class DemoArrayList {

  public static void main(String[] args) {
    String[] arr = new String[]{"abc", "def", "ijk"};
    System.out.println(arr.length); // get
    arr[1] = "hello"; // similar to set()
    for (String s : arr) {
      System.out.println(s);
    }

    // if we want to add one more String object to array object
    // you have to create another String array object, and then copy
    // so array object is fixed length

    // After Java 5
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("abc");
    strings.add("def");
    strings.add("ijk");
    strings.add("hello");
    System.out.println(strings.size());
    strings.set(1, "opq");
    for (String s : strings) {
      System.out.println(s);
    }
    System.out.println(strings.get(1));
    strings.remove("ijk");
    System.out.println(strings); // Arrays.toString()


    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(1);
    integers.add(10000);
    integers.add(-2_100_000_000);
    System.out.println(integers.size());

    // you should think of the scenario of without equals() in
    // Customer.class
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Customer john = new Customer("John");

    customers.add(new Customer("John"));
    customers.add(new Customer("John"));
    System.out.println(customers.size()); // 2
    customers.remove(john); // Object.class equals() true -> break

    ArrayList<Customer> targetRemoveList = new ArrayList<>();
    targetRemoveList.add(john);

    customers.removeAll(targetRemoveList); // -> Customer.equals()


    ArrayList <BigDecimal> decimals = new ArrayList<>();

    // add
    decimals.add(BigDecimal.valueOf(3.0d));
    decimals.add(BigDecimal.valueOf(3.5));
    decimals.add(BigDecimal.valueOf(3.5));
    // remove
    decimals.remove(BigDecimal.valueOf(3.5)); // remove one and break
    // size
    System.out.println(decimals.size()); // 2

    System.out.println(decimals.contains(BigDecimal.valueOf(3.5))); // true
    // ArrayList.class -> contains() -> for loop, break
    // but the definition of equals() is still controlled by BigDecimal.class ->
    // equals()

    // ask if contains both 3.0, 3.5
    // ArrayList<BigDecimal> checkIfContains = new ArrayList<>();
    // checkIfContains.add(BigDecimal.valueOf(3.0));
    // checkIfContains.add(BigDecimal.valueOf(3.5));
    // decimals.containsAll(checkIfContains);

    System.out.println(decimals.containsAll(
        Arrays.asList(BigDecimal.valueOf(3.0), BigDecimal.valueOf(3.5)))); // true

    // ArrayList<Number> is not the parent of ArrayList<Integer>
    // ArrayList<Number> integers3 = new ArrayList<Integer>(); // compile error

    // but Number is the parent of Integer
    Number number = new Integer(3); // Integer has a Is-a relationship with Number
    Number[] numbers = new Integer[] {3,7,10};
    numbers = new Long[] {3L, 7L, 10L}; // long -> Long

    long[] arr10 = new long[] {3, 7, 10}; // int -> long

    // Long l1 = new Integer(10);
    // Integer object has no relationship with Long object

    // int -> long (promotion)
    // long[] arr11 = new int[] {1,2,3}; // Not parent (not promption)

    System.out.println(decimals.isEmpty());
    
    if (!decimals.isEmpty()) { // this style is preferred and the norm
      
    }

    // for-each (ArrayList)
    for (BigDecimal bd : decimals) {
      System.out.println(bd);
    }

    // for loop - ArrayList
    for (int i = 0; i < decimals.size() - 1; i++) {
      System.out.println(decimals.get(i) + ", " + decimals.get(i + 1));
    }

    Subject english = new Subject(90, "English");
    Subject maths = new Subject(99, "Maths");
    ArrayList<Subject> subjects = new ArrayList<>();
    subjects.add(english);
    subjects.add(maths);
    Student peter = new Student("Peter", subjects);

    ArrayList<Student> students = new ArrayList<>();
    students.add(peter);

    // ArrayList<Subject> subjects2 = new ArrayList<>();
    subjects = new ArrayList<>();
    // subjects.clear(); // Wrong answer

    Subject english2 = new Subject(70, "English");
    Subject maths2 = new Subject(100, "Maths");

    subjects.add(english2);
    subjects.add(maths2);
    Student sally = new Student("Sally", subjects);
    
    students.add(sally);

    sally.add(new Subject(88, "Computer"));

    // print out all Students
    System.out.println(students);

    // remove by index
    System.out.println("before removal:" + decimals);
    BigDecimal removedDecimal = decimals.remove(0); // remove the first element
    System.out.println("removedDecimal=" + removedDecimal);
    System.out.println("after removal:" + decimals);

    


    boolean isRemoved = decimals.remove(BigDecimal.valueOf(4.0));
    System.out.println(isRemoved); // false

    // add element
    decimals.add(BigDecimal.valueOf(10.5));

    // if add element success
    if (decimals.add(BigDecimal.valueOf(100.0))) { // "if" can be used together with modification
      System.out.println("Added 100 to ArrayList");
    }

    // Cannot use ArrayList together with primitive
    // ArrayList<char> characters = new ArrayList<>();
    ArrayList<Character> characters = new ArrayList<>();
    characters.add('c'); // char -> Character
    characters.add(Character.valueOf('a'));
    double ascii = characters.get(0); // Character Object -> char (unbox) -> int
    double d = (byte) 3; // byte -> double

    long l = new Integer(3); // OK, Integer -> int -> long
    // Long l2 = new Integer(3); // NOT OK, Integer -> int -> long -> Long 
    

    int l1 = Short.valueOf((short) 3); // Short Object -> short -> int (upcast)
    // Long l2 = 3; // int -> long -> Long object (NOT OK)

    ArrayList<Object> objects = new ArrayList<Object>();

    // Interface: List.class
    // List is the interface of ArrayList
    List<String> strings2 = new ArrayList<>();
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2.get(0)); // "abc"
    System.out.println(strings2.size()); // 2

    System.out.println(strings2.equals(Arrays.asList("abc", "def"))); // true
    System.out.println(strings2.equals(Arrays.asList("abc", "def", "ijk"))); // false
    System.out.println(strings2.equals(Arrays.asList("def", "abc"))); // false

    System.out.println(strings2.hashCode()); // 3087268
    System.out.println(Arrays.asList("abc", "def").hashCode()); // 3087268

    // indexOf() -> return the first matched element
    System.out.println(strings2.indexOf("def")); // 1
    System.out.println(strings2.indexOf("hello")); // -1

    // lastIndexOf() -> return the last matched element
    System.out.println(strings2.lastIndexOf("def")); // 1

    // Conversion:
    // 1. String[] -> ArrayList<String> 
    String[] arr2 = new String[] {"abc", "def", "ijk"};

    // (String ... a)
    List<String> arrayList = Arrays.asList(arr2); // Arrays.asList() returns a List Object
    List<String> arrayList2 = Arrays.asList("abc", "def", "ijk");

    // 2. ArrayList<String> -> String[]
    System.out.println(strings2); // [abc, def]
    String[] stringArray = strings2.toArray(new String[strings2.size()]);
    System.out.println(Arrays.toString(stringArray)); // [abc, def]


    // !!!!!!!!!! NOTE !!!!!!!!!!!
    // Arrays.asList() -> return List object
    // Disadvantage: you cannot perform write operation.
    // arrayList.add("xyz");
    // System.out.println(arrayList); // java.lang.UnsupportedOperationException

    // read operation is ok
    for (String s : arrayList) {
      System.out.println(s);
    }

    // Conversion: array to arraylist
    // support both read and write operations
    List<String> arrayList4 = new ArrayList<>(Arrays.asList(arr2)); 
    // the arugument in the constructor of ArrayList must be any class 
    // that implements the Collection interface
    arrayList4.add("hello");
    System.out.println(arrayList4); // [abc, def, ijk, hello]




  }
}
// !!!!!!!!!!!!!! NOTE !!!!!!!!!!!!!!
// Whenever a class is covering a specific class, the child and the parent of the specific class 
// ArrayList<ChildClass> => ArrayList is a class, ChildClass is a subclass
// ArrayList<ParentClass
