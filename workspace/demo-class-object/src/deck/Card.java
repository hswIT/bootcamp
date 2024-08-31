package deck;

public class Card {
  // !!! Make you know the difference between instance variable, static
  // variable, static final variable

  // String -> good presentation, built-in equals() & compareTo()
  // "01", "02", "09, "10", "JACK", "QUEEN", "KING"
  private Rank rank; // 1, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K
  private Suit2 suit; // DIAMOND, CLUB, HEART, SPADE

  public Card(Rank rank, Suit2 suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public static Card of(Rank rank, Suit2 suit) {
    return new Card(rank, suit);
  }

  // getter
  public Rank getRank() {
    return this.rank;
  }

  public Suit2 getSuit() {
    return this.suit;
  }

  public boolean equals(Card card) {
    return this.rank.equals(card.getRank()) && this.suit.equals(card.getSuit());
  }

  // instance method
  // c1.compareTo(c2)
  // this -> c1
  // card -> c2
  public int compareTo(Card card) {
    // fixed rules
    // this (address) vs card (address)
    int rankResult = this.rank.compareTo(card.getRank());
    if (rankResult == 0) {
      if (this.suit.compare(card.getSuit()) == 0) { // !!! should use compare()
        return 0;
      } else if (this.suit.compare(card.getSuit()) > 0) { // !!! should use compare()
        return 1;
      }
      return -1;
      
    }
    return rankResult;
  }

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ", suit=" + this.suit //
        + ")";
  }

  public static void main(String[] args) {
    // valueOf(''), 
    Card c1 = new Card(PokerRank.ofACE(), Suit2.DIAMOND);
    Card c2 = new Card(PokerRank.ofACE(), Suit2.DIAMOND);
    Card c3 = new Card(PokerRank.ofJACK(), Suit2.DIAMOND);
    Card c4 = new Card(PokerRank.ofJACK(), Suit2.DIAMOND);

    System.out.println(c2.compareTo(c1)); // 0
    System.out.println(c1.compareTo(c2)); // 0
    System.out.println(c1.compareTo(c3)); // 1
    System.out.println(c4.compareTo(c2)); // -1



    // Card.CLUB = 10; // final variable cannot be modified
  }
}









// *---------------------------------------------------------------------------------------------------------------------------------------------------
// *---------------------------------------------------------------------------------------------------------------------------------------------------
// *---------------------------------------------------------------------------------------------------------------------------------------------------
// *---------------------------------------------------------------------------------------------------------------------------------------------------


//   public Card(int rank, String suit) { // setting up like this imply every object would have these two.
//     if ((int) rank == 10){
//       this.rank = 'I';
//     } else {
//       this.rank = rank;
//     }
//     this.suit = suit;
//   }

//   public char getRank() {
//     return this.rank;
//   }

//   public String getSuit() {
//     return this.suit;
//   }


//   // 
//   public int compareTo(Card other) {

//     if (this.rank == other.rank && this.suit.equals(other.suit)) {
//       return 0;
//     }

//     if (this.rank > other.rank) {
//       return 1;
//     } else if (this.rank == other.rank) {
//         if (this.suit.equals("DIAMOND")) { // caller become DIAMOND
//           return -1;
//         } else if (this.suit.equals("CLUB")) { // caller become CLUB
//             return other.suit.equals("DIAMOND") ? 1 : -1; // CLUB larger than DIAMOND, return 1, other -1
//         } else if (this.suit.equals("HEART")) { // caller become HEART
//             return other.suit.equals("SPADE") ? -1 : 1; // HEART smaller than SPADE, return -1, other 1
//         } else { // caller become SPADE
//             return 1;
//         }
//     } else {
//        return -1;
//     }
//   }



//   public static void main(String[] args) {
//     Card c1 = new Card('H', "CLUB"); // club, diamond, heart or spade
//     Card c2 = new Card('K', "DIAMOND");
//     Card c3 = new Card('J', "CLUB");
//     Card c4 = new Card('10', "HEART");



//     System.out.println(c2.compareTo(c1)); // -1
//     System.out.println(c1.compareTo(c2)); // 1
//     System.out.println(c1.compareTo(c3)); // 0


//   }

