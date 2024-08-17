public class Cat { // blueprint
  // attributes
  private String color;
  private String name;
  private int age;

  public String getName(){
    return this.name;
  }
  public String getColor(){
    return this.color;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setAge(int age){
    this.age = age; 
  }

  public int getAge(){
    return this.age;
  }
}