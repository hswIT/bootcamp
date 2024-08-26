package deck;

public enum Suit2 {
  // create enum objects
  // DIAMOND, // call empty constructor
  DIAMOND(1), // (1) is called instance variable in enum type
  CLUB(2),
  HEART(3),
  SPADE(4),
  // DIAMOND,
  // CLUB,
  // HEART,
  // SPADE,
  ;

  private final int value;


  private Suit2(int value) { // creating this constructor would skip the empty constructor
    this.value = value;
  }

public int getValue() {
  return this.value;
}

// value is private final, so no setter is available
// public void setValue(int value) {
//   this.value = value;
// }

  // custom definition
  public int compare(Suit2 suit) {
    // this vs suit, 
    if (this == suit)
      return 0;
    return this.value > suit.getValue() ? 1 : -1;
  }

  public static int length() {
    return Suit2.values().length;
  }

  //values() method is implicitly created by JAVA when the class is enum
  // enum constants stored in an internally maintained array,
  // which can be accessed via the values() method.
  public static Suit2 get(int value) {
    for (Suit2 suit : Suit2.values()) { // values() return an array of each element
      if (suit.getValue() == value){
        return suit;
      }
    }
    return null;
  }

  public static void main(String[] args) {

    //!!! priority !!!!!!!!
    // load classes to memory
    // enum -> create objects for enum
    // static /static final
    // start to read your code in main method



    System.out.println(Suit2.DIAMOND.compare(Suit2.SPADE));

    // enum.class compareTo() by default checking the address
    System.out.println(Suit2.HEART.compareTo(Suit2.HEART)); // 0
    System.out.println(Suit2.CLUB.compareTo(Suit2.HEART)); // -1
    System.out.println(Suit2.SPADE.compareTo(Suit2.HEART)); // 1

    // equals() -> result ok
    Suit2 unknown = Suit2.DIAMOND;
    System.out.println(unknown.equals(Suit2.SPADE)); // false

    System.out.println(Suit2.get(3)); // HEART

    // name()
    System.out.println(Suit2.DIAMOND.name());
    System.out.println(Suit2.DIAMOND.toString());

    // ordinal() -> ordering
    System.out.println(Suit2.SPADE.ordinal());
  }

}
