public enum Direction {
  EAST(1, 'E'),
  SOUTH(2, 'S'),
  WEST(-1, 'W'),
  NORTH(-2, 'N'),
  ;

  private int value;
  private char initial;

  private Direction(int value, char initial) {
    this.value = value;
    this.initial = initial;
  }

  public int getValue() {
    return this.value;
  }

  public char getInitial() {
    return this.initial;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setInitial(char initial) {
    this.initial = initial;
  }

  // WEST EAST NORTH SOUTH
  public boolean isOpposite(Direction direction) {
    return this.value * -1 == direction.getValue();
  }

  public static void main(String[] args) {
    // define a variable storing Direction WEST
    Direction west = Direction.WEST;


    // check if this variable equals to NORTH
      // if yes, print "it is North"
      // if no, print "it is not North"
    if (west == Direction.NORTH) {
      System.out.println("it is North");
    } else {
      System.out.println("it is not North");
    }

    // valueOf(): from String
    Direction east = Direction.valueOf("EAST");
    System.out.println(east);

    // System.out.println(Direction.valueOf("south")); // case sensitive, runtime error

    // west.setValue(10);
    // System.out.println(west.getValue());

    if (west.isOpposite(Direction.EAST)) {
      System.out.println("They are opposite");
    }

    System.out.println(Direction.NORTH.isOpposite(west)); // false


  }
}

// !!!!!!!!!!! NOTE !!!!!!!!!!!!!!!
// Each enum element is independent. In order to create relationship
// we can design the attribute to have them related. 