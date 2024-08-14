import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    
    // while loop
    int sum = 0;
    int count = 0;
    while (count < 5){ // when count == 5, exit loop
      sum += count;
      count++;
    }
    System.out.println(sum);

    // random
    int value = new Random().nextInt(5) + 1; // 1 - 5
    System.out.println(value);

    int number = -1;
    // guess a number:
    Scanner scanner = new Scanner(System.in);
    while (number != value) {
      System.out.println("Please continue to guess ");
      number = scanner.nextInt();
    }
    System.out.println("Correct!");

    // leetcode
    int code = 1234;

    //char[] codes = new char[]; // ['1', '2', '3', '4']

    //approach 1
    //int => Integer => String => charArray
    char[] codes = new Integer(code).toString().toCharArray();
    System.out.println(Arrays.toString(codes));

    // approach 2
    // Tips: % and /
    int a = code;
    int arrLength = 0;
    // this loop is to find out the length of the char[]
    while (a > 0) {
      // 1234 % 10 -> 4
      // (char) (a % 10 + '0'); // int -> char
      // how to convert 4 to '4'
      // 1234 / 10 -> 123
      a = a / 10;
      arrLength++;
    }
    codes = new char[arrLength];
    a = code; // reset a to 1234
    int idx = 0;
    while (a > 0) { //array length is known, then get assigned to corresponding value at descending order
      codes[idx++] = (char) (a % 10 + '0'); //  0 -> '0', 1 -> '1'
      // or use below
      // codes[idx] = (char) (a % 10 + '0');
      // idx++;
      a = a / 10;
    }
    System.out.println(Arrays.toString(codes)); // [4, 3, 2, 1]
    // reverse
    char backup = ' ';
    // swap index 0 and 3, 1 and 2 to sort into ascending order
    for (int i = 0; i < codes.length / 2; i++) {
      backup = codes[i];
      codes[i] = codes[codes.length - i - 1];
      codes[codes.length - i - 1] = backup;
    }
    System.out.println(Arrays.toString(codes)); // [1, 2, 3, 4]

    char c = (char) ('a' + 1);
    System.out.println(c); // b

    count = 0;
    sum = 0;
    while (true) { // by default infinite loop
      // 1000 lines ... 6 break
      sum += count;
      count++;
      if (count > 4)
        break;
    }
    System.out.println(sum); // 10


    

    
  }
}

