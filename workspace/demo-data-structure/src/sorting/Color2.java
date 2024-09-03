package sorting;

public enum Color2 {
  YELLOW(1),
  GREEN(2),
  RED(3),;
  
  private int value;

  private Color2(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Color2 ofYellow(){
    return Color2.YELLOW;
  }

  public Color2 ofGreen(){
    return Color2.GREEN;
  }

  public Color2 ofRed(){
    return Color2.RED;
  }

}
