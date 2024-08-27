package valueReference;

public class DemoPassByReference {

  public static void main(String[] args) {
    int[] arr = new int[] {10, 20, -3, 9};
    // move the max value to the tail -> [x, x, x, 20]
    // algorithm (static method)
    System.out.println(newArr);

    int temp = Integer.MIN_VALUE;
    int backup = -1;


    // So, array is one of type that is "pass by reference"
    // passing a copy of object address
    public static int[] moveMaxToTail(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
        temp = Math.max(arr[i], arr[i + 1]);
      }
      int[] newArr = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        if (arr[arr.length -1] == temp) {
          newArr = arr;
        }

      }


    }

  }
}
