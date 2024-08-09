import java.util.Arrays;
public class DemoArray {
  
  public static void main(String[] args) {
    

    int[] arr = new int[3];
  // assign the values to array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]); 
    }

    // declare an array for double
    // for loop
    double[] arr2 = new double[5];
    arr2[0] = 2.4;
    arr2[1] = 3.5;
    arr2[2] = 5.6f; // float -> double
    arr2[3] = 7.8;
    arr2[4] = 10; // int => double


    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    // Example 1 for max and Example 2 for min
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 666;
    arr3[2] = -100;
    int max = -2_100_000_000;
    int min = 2_100_000_000;

    // Find the max min num from the array
    // Loop
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
      } else if (arr3[i] < min) {
        min = arr3[i];
      }
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);

    // Example 3
    String[] strings = new String[3];
    strings[0] = "abcd";
    strings[1] = "hello";
    strings[2] = "12309000";
    String longestString = "";

    for (int i = 0; i < strings.length; i++){
      if (strings[i].length() > longestString.length()){
        longestString = strings[i];
      } 
    }
    System.out.println("Longest string: " + longestString);

    // Example 4
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 2.3;
    prices[3] = 2.3;

    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;

    for (int i = 0; i < prices.length; i++) {
      double Amount = prices[i] * quantities[i];
      totalAmount += Amount;
    }
    System.out.println("The total amount is: " + totalAmount);

    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    int totalScore = 0;
    double average = 0;
    // loop
    for (int i = 0; i < scores.length; i++) {
      totalScore += scores[i];
      average = totalScore / scores.length;
    }

    System.out.println("The average score is: " + average);

    // declare and initialize an array
    // approach 1
    String[]  arr5 = new String[3];
    // approach 2
    String[] arr6 = {"abc", "def", "ijk"};
    // approach 3
    String[] arr7 = {"abc", "def", "ijk"};

    // Example 6
    int[] arr8 = new int[] {100, -20, 40, 33, 90, 44, 66};
    // Find all numbers that > 40 and divisible by 3
    int[] answers = new int[7]; // 90, 66
    int idx = 0;

    for (int i = 0; i < arr8.length; i++) {
      if (arr8[i] > 40 && arr8[i] % 3 == 0){
        answers[idx++] = arr8[i]; 
        // idx++;
      }
    }
    System.out.println(Arrays.toString(answers));

    // example 7
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    char backup;
    // swap by backup
    backup = arr9[0];
    arr9[0] = arr9[1];
    arr9[1] = backup;

    System.out.println(arr9);

    // example 8
    // loop + swap
    char[] arr10 = new char[] {'9', '4', '3', '2', '1', '0'};
    // Move the first character to the tail
    // Constraint: Cannot create another array
    // '4', '3', '2', '1', '0', '9'
    char temp = arr10[0];
    

    for (int i = 0; i < arr10.length; i++){
      if (i < arr10.length - 1) {
        arr10[i] = arr10[i + 1];      
      } else {
        arr10[arr10.length - 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr10));
  }
}
