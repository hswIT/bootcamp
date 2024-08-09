public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {

    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    boolean isFound = false;
    // if not found, print "Not Found."
    for (int i = 0; i < str.length() ; i++) { //starting iterration from the end
      if (str.charAt(str.length() - 1 - i) == target) { // target is found
        System.out.println("The index of the last character of " + target + " is " + (str.length() - 1 -i));
        isFound = true;
        break;
      }   
    }
    if (!isFound) { 
      System.out.println("Not Found.");
    }
  }
}
