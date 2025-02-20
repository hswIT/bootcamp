package uncheckedException;
public enum Color {
  RED('R'), GREEN('G'), BLUE('B'),;

  private char value;

  private Color(char value) {
    this.value = value;
  }

  public char getValue() {  
    return this.value;
  }

  public static Color get(char value) {
    for (Color color : Color.values()) {
      if (color.getValue() == value) {
        return color;
      }
    }
    throw new IllegalArgumentException("char value is invalid. value = " + value);
  }

  public static String concat(String s1, String s2) {
    if (s1 != null) 
      return s1.concat(s2);
    throw new IllegalArgumentException("s1 is not null. s1 = " + "null");
  }

  public static void main(String[] args) {
    try {
      Color.get('r');
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      concat(null, "b");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
