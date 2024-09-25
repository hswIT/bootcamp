package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data // Includes getter, setter, toString, hashCode, equals
@Builder
@AllArgsConstructor
public class Ball {
  private Color color;

  public static enum Color {
    RED, BLUE, BLACK
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    ball.setColor(Color.BLACK);


  }
  
}
