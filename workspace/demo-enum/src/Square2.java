public class Square2 {
  private double length;
  private Color2 color;

  public Square2(double length, Color2 color) {
    this.length = length;
    this.color = color;
  }

  public static void main(String[] args) {
    // JVM create enum object when loading

    Square2 s1 = new Square2(4.5d, Color2.BLUE);

    System.out.println(Color2.BLUE);
  }
}
