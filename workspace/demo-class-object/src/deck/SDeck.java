package deck;

public class SDeck {
  // !!! final => an array object is declared and cannot be modified
  private Card[] cards;

  public SDeck(Card[] cards) {
    // if (cards.length != this.cards.length)
    //   throw Exception
    this.cards = cards;
  }

  public Card[] getCards() {
    return this.cards;
  }
}
