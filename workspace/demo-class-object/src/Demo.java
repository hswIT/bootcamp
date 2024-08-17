public class Demo {
  public static void main(String[] args) {
    // memory
    int x = 3;

    // arr -> object reference -> object address
    // int array object (length = 2)
    int[] arr = new int[2];

    // cat => object reference => cat object address
    // Cat object in heap memory
    Cat cat = new Cat(); // 
    cat.setName("John");
    System.out.println(cat.getName());

    // if attribute is private, you can not read the attribute directly by the obj ref
    // For example, cat.name and cat.color

    Cat cat2 = new Cat();
    cat2.setName("Peter");
    System.out.println(cat2.getName());

    cat.getName();
    cat2.getName();

    cat.setColor("Black");
    cat2.setColor("White");
    System.out.println(cat.getColor());
    System.out.println(cat2.getColor());

    //cat.setAge();
    System.out.println(cat.getAge());

    Staff staff = new Staff(); // Staff() => constructor
    staff.setHeight(1.75);
    staff.setWeight(73.25);
    // geBMI() => class encapsulates complicated behavior
    System.out.println(staff.getBMI());

    Staff staff2 = new Staff("Jenny", "Chan", 1.65, 60.2);
    System.out.println(staff2.getBMI());

    
  }
}
// When the main() is executed, it executes the constructor method which in turn run the Cat class file and load it
// into memory. After that, the Cat class file get finished and no longer exist. (Because the class method is finished
// running). It doesn't get exist in the memory as it is not run in the main method.

