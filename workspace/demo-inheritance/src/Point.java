import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX())
        && Objects.equals(this.y, point.getY());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }


  // !!!! Caution !!!!
  // Method signature is case sensitive, should not make a similiar name method
  public int hashcode(){
    return -1;
  }

  @Override
  public String toString() {
    return "Point(" + "x=" + this.x + ", y=" + this.y + ")";
  } 


  public static void main(String[] args) {
    System.out.println(new Point(1, 1).equals(new Point(1, 1)));

    Person person = new Person(new Point(1, 2)); // need to have true

    // asking if the person located in Point(1, 2)
    // not asking if the point objects

    System.out.println(person.getPoint().equals(new Point(1, 2))); // return a true as wanted

    // alternatively
    if (person.getPoint().getX() == 1 && person.getPoint().getY() == 2) {
      System.out.println(true);
    }

    System.out.println(person.hashCode()); // 758529971


  }
}
