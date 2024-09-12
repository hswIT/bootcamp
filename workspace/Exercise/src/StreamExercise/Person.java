package StreamExercise;
public class Person {
  private String name;
  private int age;
  private String gender;

  public Person(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }

  public String toString() {
    return this.name;
  }
}
