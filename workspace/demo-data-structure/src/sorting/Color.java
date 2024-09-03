package sorting;

public enum Color { 
  // List<Ball> -> ordering
  // GREEN -> RED -> YELLOW
  GREEN(1),
  RED(2),
  YELLOW(3);

  private int value;

  private Color(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }


}
