public class Color {
  
  private static final String RED = "RED";
  private static final String BLUE = "BLUE";

  private String value;

  private Color(String value){
    this.value = value;
  }

  public static Color ofRed(){
    return new Color("RED");
  }

  public static Color ofBlue(){
    return new Color("BLUE");
  }

  public void updateColor(int x){
    if (x > 0)
      this.value = RED;
    this.value = BLUE;
  }


}
