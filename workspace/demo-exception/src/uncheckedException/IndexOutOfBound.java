package uncheckedException;
public class IndexOutOfBound {
  public static void main(String[] args) {
    int[] arr = new int[]{3, 1, 2};
    int idx = 3;
    try {
      System.out.println(arr[idx]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("idx is out of range of array");
    }
  }
}
