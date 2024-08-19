public class Box {
  private long[] arr;

  public Box() {
    this.arr = new long[0]; // !!!
  }

  public Box(long[] arr){
    this.arr = arr;
  }

  public int size() {
    return this.arr.length;
  }

  public void setArr(long[] arr) {
    this.arr = arr;
  }

  public long[] getArr() {
    return this.arr;
  }

  public long getLongValue(int index){
    return this.arr[index];
  }

  public long totalLongValue() {
    long sum = 0;
    for (int i = 0; i < this.arr.length; i++) {
        sum =+ this.arr[i];
    }
    return sum;
  }



  public static void main(String[] args) {
    Box box = new Box(); // Box object exists
    System.out.println("box size: " + box.size()); // 0
    // If there is no custom constructor and no setter
    // then the array cannot be initialized
    // arr is null pointer exception

    // TWO ways to solve (either)

    // (1) Custom Constructor
    // but the implicit default empty constructor will be removed
    // and then you may create "custom empty constructor"

    // arr with length 0
    int[] arr = new int[] {}; //ok, fixed length array (length = 0)
    // arr[0] = 1; // NOT ok, runtime error


    // (2) setter
    Box box2 = new Box();
    System.out.println(box2.size()); // 0
    box2.setArr(new long[] {8L, 4, (byte) 10});

    long result = box2.getArr()[1]; // 4
    System.out.println(result);

    result = box2.getLongValue(2); // 10
    System.out.println(result);

  }
}
