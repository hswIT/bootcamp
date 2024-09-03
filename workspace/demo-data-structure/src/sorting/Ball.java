package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public int compareTo(Ball ball){
    // this (-1), ball (1)
    return this.color.getValue() < ball.getColor().getValue() ? -1 : 1;
  }

  @Override
  public String toString() {
    return "Ball(" + this.color + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color.GREEN);
    Ball b2 = new Ball(Color.RED);
    Ball b3 = new Ball(Color.YELLOW);
    Ball b4 = new Ball(Color.RED);

    System.out.println(b1.compareTo(b2));

    List<Ball> balls = new LinkedList<>();
    balls.add(b3);
    balls.add(b2);
    balls.add(b1);
    balls.add(b4);
    System.out.println("Original: " + balls);

    Collections.sort(balls);
    System.out.println(balls);

    
  }
  
}
