public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    int sum = 0;

    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 2; i < 16; i++) {

      if (i > 2) { // iterate starting from 3
        sum = first + second;
        System.out.print(" " + sum + " ") ;
        first = second;
        second = sum;
      } else { // just first round i = 2 only
        System.out.print(first + " " + second);
      }
    }
  }
}
