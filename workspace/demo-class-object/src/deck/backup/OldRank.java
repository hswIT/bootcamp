package deck;

import java.util.Arrays;

public class Rank {
  // Constant (static final) => should be public
  public static final char ACE = 'A';
  public static final char TWO = '2';
  public static final char THREE = '3';
  public static final char FOUR = '4';
  public static final char FIVE = '5';
  private static final char SIX = '6';
  private static final char SEVEN = '7';
  private static final char EIGHT = '8';
  private static final char NINE = '9';
  private static final char TEN = 'T';
  private static final char JACK = 'J';
  private static final char QUEEN = 'Q';
  private static final char KING = 'K';




  // final instance variable
// private final String name = "ABC"; // every Rank Object has name attibute

  private char value;

  // private Rank(char value) {
  //   this.value = value;
  // }

  public Rank(){}

  public Rank(char value) { // Rewritten
    this.value = value;
  }

  // We want to have Rank.ofACE()
  public static Rank ofACE() {
    return new Rank(ACE);
  }

  public static Rank ofTWO() {
    return new Rank(TWO);
  }

  public static Rank ofTHREE() {
    return new Rank(THREE);
  }

  public static Rank ofFOUR() {
    return new Rank(FOUR);
  }

  public static Rank ofFIVE() {
    return new Rank(FIVE);
  }

  public static Rank ofSIX() {
    return new Rank(SIX);
  }

  public static Rank ofSEVEN() {
    return new Rank(SEVEN);
  }

  public static Rank ofEIGHT() {
    return new Rank(EIGHT);
  }

  public static Rank ofNINE() {
    return new Rank(NINE);
  }

  public static Rank ofTEN() {
    return new Rank(TEN);
  }

  public static Rank ofJACK() {
    return new Rank(JACK);
  }

  public static Rank ofQUEEN() {
    return new Rank(QUEEN);
  }

  public static Rank ofKING() {
    return new Rank(KING);
  }



  public char getValue() {
    return this.value;
  }

  public boolean equals(Rank rank) {
    return this.value == rank.getValue();
  }

  public int compareTo(Rank rank) {
    // Early return
    if (this.value != rank.getValue()) {
      if (this.value == TWO)
        return 1;
      if (rank.getValue() == TWO)
        return -1;
      if (this.value == ACE)
        return 1;
      if (rank.getValue() == ACE)
        return -1;
      if (this.value == KING)
        return 1;
      if (rank.getValue() == KING)
        return -1;
      if (this.value == QUEEN)
        return 1;
      if (rank.getValue() == QUEEN)
        return -1;
      if (this.value == JACK)
        return 1;
      if (rank.getValue() == JACK)
        return -1;
      if (this.value == TEN)
        return 1;
      if (rank.getValue() == TEN)
        return -1;
      return this.value > rank.getValue() ? 1 : -1; // 3 - 9
    }
    return 0;
  }

  public String toString() {
    return "Rank(" //
        + "value=" + this.value //
        + ")";
  }
}
