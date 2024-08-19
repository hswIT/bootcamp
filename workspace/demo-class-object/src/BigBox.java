import java.util.Arrays;

public class BigBox {
  private Box box; // attribute

  public BigBox() {  // empty constructor

  }

  public BigBox(Box box) {
    this.box = box;
  }


  public long boxValue(){ // bb3 => boxValue() => totalLongValue()
    return this.box.totalLongValue();
  }





  public static void main(String[] args) {
    BigBox bb = new BigBox();
    // heap memory
    // BigBox object reference (stack memory)
    // => BigBox object (box object reference)
    // => Box object => (long[] object reference)
    // => long[] object
    // => lots of long value
    // one object link to another and then another

    Box backup = new Box(new long[] {1,2});
    BigBox bb2 = new BigBox(backup); // ok

    System.out.println(Arrays.toString(backup.getArr())); // [1,2]

    // bb3, you lost the Box object object address
    //and if you do not provide any access method to box object
    // then you are no longer reaching it
    BigBox bb3 = new BigBox(new Box(new long[] {1,2})); 
    // when create the BigBox object, actually the BigBox object make an 
    // address for storing the Box object, however if there is no getter method,
    // there is no way to access it
    System.out.println(bb3.boxValue());
  }
}
