public class JavaQuest8a {
  // Write a loop to find the second max number.
  public static void main(String[] args) {

    int secondMax =0;;
    int tempIndex = 0;
    boolean isMaxFound = false;
    
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    int[][] arr = { nums, nums2, nums3, nums4 };
    for (int j = 0; j < arr.length; j++) { // iterate through the outerarray
      for (int i = 0; i < nums.length; i++) { // look for the max in each inner array
        if (arr[j][i] > tempIndex) { // check the value of each element in the inner array
          tempIndex = arr[j][i];
        }
      }

      for (int i = 0; i < nums.length; i++) { // start to check the second max
        if (arr[j][i] == tempIndex && !isMaxFound) { // skip the checking of the max
          isMaxFound = true;
          continue;
        } else if (arr[j][i] > secondMax) {
          secondMax = arr[j][i];          
        } else {
          continue; //
        }
      }
      System.out.print(secondMax + " ");
      secondMax = 0;
      tempIndex = 0;
      isMaxFound = false;
    }  
  }
}
