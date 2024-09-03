package sorting;


// !!!!!!!!!!! Compile time
// 1. "implement Interface" implies the object of this class must contain
// compareTo() method at the compile time
// 2. The method/object has to ensure the object contains compareTo() method

public class Box implements Comparable<Box> {
  private int value;

  public Box(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }


  // Comparable => Disadvantage
  // 1. cannot define 2 sorting formula at the same time
  // 2. The compareTo() formula is for Box.class use only

  @Override
  public int compareTo(Box box) {
    // this bs box
    // 1 represents box
    // -1 represents this
    return box.getValue() > this.value ? 1 : -1; // descending order
  }

  @Override
  public String toString() {
    return "Box(" + "value=" + this.value + ")";
  }


}
