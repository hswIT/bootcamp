package deck;

public class RuleManager {
  
  public boolean isPair(Card card1, Card card2) {
    return new PairManager(card1, card2).isPair();
  }

  public boolean isThreeKind(Card card1, Card card2, Card card3) { // when the method is pending to be completed, simply return false
    return false;
  }

  public boolean isFullHouse(Card card1, Card card2, Card card3, Card card4, Card card5) {
    // counting 
    return false;
  }
  public static void main(String[] args) {
    RuleManager ruleManager = new RuleManager();
    boolean result = ruleManager.isPair(Card.of(PokerRank.ofACE(), Suit2.DIAMOND) //
        , Card.of(PokerRank.ofACE(), Suit2.CLUB));

    System.out.println(result);
  }
}
