package deck;

public class PairManager {
  private final Card[] cards;

  public PairManager(Card card1, Card card2) {
    this.cards = new Card[]{card1, card2};
  }

  public boolean isPair(){
    return cards[0].getRank().equals(cards[1].getRank());
  }

  public static void main(String[] args) {
    boolean result = new PairManager(new Card(PokerRank.ofACE(), Suit2.DIAMOND),
    new Card(PokerRank.ofACE(), Suit2.SPADE)).isPair();

    boolean result2 = new PairManager(new Card(PokerRank.ofACE(), Suit2.DIAMOND),
        new Card(PokerRank.ofKING(), Suit2.DIAMOND)).isPair();
    boolean result3 = new PairManager(new Card(PokerRank.ofACE(), Suit2.DIAMOND),
        new Card(PokerRank.ofJACK(), Suit2.SPADE)).isPair();

    boolean result4 = new PairManager(new Card(PokerRank.ofACE(), Suit2.DIAMOND),
        new Card(PokerRank.ofACE(), Suit2.DIAMOND)).isPair();

    System.out.println(result); // true
    System.out.println(result2); // false
    System.out.println(result3); // false
    System.out.println(result4); // true

  }
}
