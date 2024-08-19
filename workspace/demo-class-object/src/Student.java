public class Student {

  private static String schoolName = "ABC school";

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String Info() {
    return "Student()" 
            + this.name + " " // instance variable
            + this.age // instance variable
            + " , school=" + schoolName; // static variable
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", 13);
    Student s2 = new Student("Jenny", 14);

    System.out.println(s1.Info()); // Student(name=John, age=13 , school=ABC school)
    System.out.println(s2.Info());


    Student.schoolName = "DEF";
    System.out.println(s1.Info());
  }

}
