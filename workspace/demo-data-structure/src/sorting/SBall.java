package sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SBall implements Comparable<SBall> {
  private Color2 color;
  private String name;

  public SBall(Color2 color, String name) {
    this.color = color;
    this.name = name;
  }

  public Color2 getColor() {
    return this.color;
  } 

  public String getName() {
    return this.name;
  }

  @Override
  public int compareTo(SBall sb) {
    // Yellow(1) -> Green(2) -> Red(3)
    int result = 0;
    if (this.color.getValue() < sb.color.getValue())
      result = -1;
      // return -1;
    else if (this.color.getValue() > sb.color.getValue())
      result = 1;
      //return 1;
    else if (this.color.getValue() == sb.color.getValue())
      //return this.name.compareTo(sb.getName());
      result = this.name.compareTo(sb.getName()) * -1;
    
    return result;
  }

  @Override
  public String toString() {
    return "SBall(" + this.color + ", " + this.name + ")";
  }

  // sorting
  // 1. YELLOW -> GREEN -> RED
  // 2. If same color, name descending order
  // i.e. SBall(Yellow, "John") -> SBall(Yellow, "Benny") -> SBall(GREEN, "Susan")
  // -> SBall(RED, "Vincent") -> SBall(RED, "Alex")
  // Ball color first, then name
  public static void main(String[] args) {

  SBall sb1 = new SBall(Color2.RED, "Vincent");
  SBall sb2 = new SBall(Color2.YELLOW, "John");
  SBall sb3 = new SBall(Color2.RED, "Alex");
  SBall sb4 = new SBall(Color2.YELLOW, "Benny");
  SBall sb5 = new SBall(Color2.GREEN, "Susan");

  List<SBall> balls = new LinkedList<>();
  balls.add(sb1);
  balls.add(sb2);
  balls.add(sb3);
  balls.add(sb4);
  balls.add(sb5);

 Collections.sort(balls);
 System.out.println(balls);

  }




}
