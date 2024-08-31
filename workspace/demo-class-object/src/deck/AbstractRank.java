package deck;

import java.util.Arrays;

public abstract class AbstractRank {
  // public static final char ACE = 'A';
  // public static final char TWO = '2';
  // public static final char THREE = '3';
  // public static final char FOUR = '4';
  // public static final char FIVE = '5';
  // private static final char SIX = '6';
  // private static final char SEVEN = '7';
  // private static final char EIGHT = '8';
  // private static final char NINE = '9';
  // private static final char TEN = 'T';
  // private static final char JACK = 'J';
  // private static final char QUEEN = 'Q';
  // private static final char KING = 'K';


  private int value;

  public AbstractRank(){}

  public AbstractRank(int value) {
    this.value = value;
  }

  abstract AbstractRank ofACE();

  abstract AbstractRank ofTWO();

  abstract AbstractRank ofTHREE();

  abstract AbstractRank ofFOUR();

  abstract AbstractRank ofFIVE();

  abstract AbstractRank ofSIX();

  abstract AbstractRank ofSEVEN();

  abstract AbstractRank ofEIGHT();

  abstract AbstractRank ofNINE();

  abstract AbstractRank ofTEN();

  abstract AbstractRank ofJACK();

  abstract AbstractRank ofQUEEN();

  abstract AbstractRank ofKING();



  public int getValue() {
    return this.value;
  }

  abstract int compareTo(Object obj);


  public String toString() {
    return "Rank(" //
        + "value=" + this.value //
        + ")";
  }
}
