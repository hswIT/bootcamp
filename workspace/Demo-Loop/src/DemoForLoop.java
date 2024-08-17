public class DemoForLoop {

  public static void main(String[] args) {
    int x = 3;
    x += 3;
    x += 3;
    x += 3;
    System.out.println(x); // 81

    int y = 3;
    for (int i = 0; i < 3; i++) { // (counter initialization, continue condition, counter + 1)
      y = y * 3;
    }
    // Step 1: i = 0
    // Step 2: i < 3 -> true
    // Step 3: y = y * 3
    // Step 4: i++ --> 1
    // Step 5: i < 3 - true
    // Step 6: y = y * 3
    // Step 7: i++ --> 2
    // Step 8: i < 3 - true
    // Step 9: y = y * 3
    // Step 10: i++ --> 3
    // Step 11: i < 3 - false
    // Step 12: Exit the loop 
    System.out.println(y); // 81

    //Example 1
    // Print 5 tmes  Hello World
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello World");
    }

    //Example 2
    // We can use i for other purpose
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
    }

    // Example 3
    // Print  all odd number between 0 and 10
    // loop and if

    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // Example 4
    // 10
    // 8
    // 6
    // 4
    // 2

    // Approach 1
    for (int i = 10; i > 0; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // Approach 2
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println(10 - i);
      }
    }

    // Example 5
    // "acegik"

    String str = "abcdefghijk";
    String str1 = "";

    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        str1 += str.charAt(i);
      }
    }
    System.out.println(str1);

    // Example 6
    // The number of character e is 3
    String str2 = "bbaeaaaccee";
    char target = 'e';
    int count = 0;

    for (int i = 0; i < str2.length(); i++){
      if (str2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println("The nunber of character " + target + " is " + count);

    // Example 7
    // from 1 to 100
    // how many numbers can be divided by 3 OR 4

    int count1 = 0;
    
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0){
        count1++;
      }
    }
    System.out.println("There are " + count1 + " numbers that can be divided by 3 or 4");

    // Example 8
    // from 1 to 50
    // find the total number, which sum up all odd numbers and substract all even

    int total = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 != 0) { // odd nunber -> add
        total += i;
      } else { // even number -> substract
        total -= i;
      }
    }
    System.out.println(total);

    // Example 9
    // Print the index of j. If j is not found, print -1
    String str3 = "abcdxyzijk";
    char target1 = 'j';
    boolean found = false;
    int pos = -1;

    for (int i = 0; i < str3.length(); i++) {
      if (str3.charAt(i) == target1) { // found j
        found = true;
        pos = i + 1;
      } else { // fail to find j
        if (found) {
          break;
        } else {
          pos = -1;
        }
        
      }
    }
    System.out.println("The index of " + target1 + " is " + pos);
    System.out.println(str.indexOf(target1));

    // Example 10
    // check if the last character is 0 -> true
    String str4 = "hello";
    char targetEndWith = 'o';

    System.out.println(str4.indexOf(str.length() - 1) == targetEndWith);
    System.out.println(str4.endsWith("o"));
    System.out.println(str4.startsWith("he"));

    // substring
    String s5 = "abcdefghik";
    // Find "def"
    System.out.println(s5.contains(s5)); // true
    // Find the index between 2 and 4
    System.out.println(s5.substring(2, 5)); // cde

    // Example 11
    // for loop
    // don't use indexOf() and contains()
    // found or not found


    String s6 = "abcdefghik";
    String subString = "def";

    for (int i = 0; i < s6.length(); i++) {
      if (s6.charAt(i) == subString.charAt(0)) { // first character match 
        if (s6.substring(i, i + subString.length()) == subString) { // substring is matched
          System.out.println("Example 11 Found");
          break; 
        } else { // substring not matched
          System.out.println("Example 11 Not found");
        }
      } else { // no first character matched
        System.err.println("Example 11 Not found");
        break; 
      }
    }




    // Nested loop
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("i=" + i + " j=" + j);
      }
    }

    // Example 12
    // break
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      if (i >= 3) {
        break;
      }
    }

    // Example 13
    // break -- searching
    String s7 = "ijkdef";
    found = false;

    for (int i = 0; i < s7.length(); i++) {
      if (s7.charAt(i) == 'k') {
        found = true;
        break;
      }
    }

    // Example 14
    // continue -- skip some patterns
    for (int i = 0; i < 50; i++) { // 0 - 49
      if (i % 2 == 0) {
        continue; // skip the rest of the code for current iteration
      }

      if (i > 30) {
        break;
      }
      System.out.println(i); // odd number
    }

    // Example 15
    // *****
    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    System.out.println("");

    // Example 16
    // *****
    // ****
    // ***
    // **
    // *
    
    int nextRow = 0;

    for (int i = 0; i < 5; i++) { // different row iteration
      for (int j = 0; j < 5 - nextRow; j++) { // same row iteration
        System.out.print("*");
      }
      nextRow += 1;
      System.out.println("");
    }

    // Example 17
    // ******
    // ****
    // **


    // Challenge (Continue)
    String searchMe = "peter piper picked a peck of pickled peppers";
    int num = 0;

    for (int i = 0; i < searchMe.length(); i++) {
      // if (searchMe.charAt(i) != 'p') {
      //   continue; 
      // } 
      // num++;

      if (searchMe.charAt(i) == 'p') {
        num++; 
      } 
    }
    System.out.println("Found " + num + " p's in the string");

    // String
    // char[], ASCII, int

    // Method => 3 types
    // 1. searching (contains, indexOf, lastIndexOf)
    // 2. presentation (length, charAt, imEmpty, isBlank, substring,startsWith, endsWith)
    // 3. transform (replace, trim, toLowerCase, toUpperCase)
  }
}
