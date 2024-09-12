package StreamExercise;
public class Student {
  public String name;
  public int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public static void main(String[] args) {

    Student student = new Student("John", 100);
    System.out.println(student.getName());
    System.out.println(student.getScore());
  }
}
