package deck;

import java.util.Arrays;
import java.util.Random;

public class Deck {
  // private static final Suit[] suits = new Suit[] {Suit.ofDiamond(), // NO longer needed as Suit2 enum is created
  //     Suit.ofClub(), Suit.ofHeart(), Suit.ofSpade()};

  private static final Rank[] ranks = new Rank[] {Rank.ofACE(), Rank.ofTWO(),
      Rank.ofTHREE(), Rank.ofFOUR(), Rank.ofFIVE(), Rank.ofSIX(),
      Rank.ofSEVEN(), Rank.ofEIGHT(), Rank.ofNINE(), Rank.ofTEN(),
      Rank.ofJACK(), Rank.ofQUEEN(), Rank.ofKING()};


  private Card[] cards;

  public Deck() {
    this.cards = new Card[Suit2.length() * ranks.length]; // initialize array
    int idx = 0;
    for (Suit2 suit : Suit2.values()) {
      for (Rank rank : ranks) {
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public int size(){
    return this.cards.length;
  }

  // public void shuffle(){
  //   int random = new Random().nextInt(52);
    
  //   for (int i = 0; i < random; i++) {

  //   }
  // }




  public String toString(){
    return "Deck(" + "cards=" + Arrays.toString(this.cards) + ")";
  }

  public static void main(String[] args) {
    Deck deck = new Deck(); // Card ?
    System.out.println(deck.size());

    // Without toString(), sysout custom object => object reference (i.e. address)
    //System.out.println(deck); // System.out.println(deck.toString());
    for (int i = 0; i < 1000; i++) {
      new ShuffleManager(deck.getCards()).shuffle();
    }
    System.out.println(deck);
    

  }
}
