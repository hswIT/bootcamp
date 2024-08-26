public class Testing {
  
  final int instanceFinal;

  public Testing(int value) {
    this.instanceFinal = value;
    System.out.println(this.instanceFinal);
  }
  public static void main(String[] args) {
    Testing obj1 = new Testing(10);
    Testing obj2 = new Testing(20);

    // System.out.println(obj1.instanceFinal);
    // System.out.println(obj2.instanceFinal);
  }
}
