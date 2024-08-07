package workspace.Exercise.src;

import java.util.Scanner;

/**
 * Expected Output:
 * 
 * Example 1: Input a month number: 2 Input a year: 2016
 * 
 * February 2016 has 29 days
 * 
 * Example 2: Input a month number: 12 Input a year: 2014
 * 
 * December 2014 has 31 days
 */

// Program the number of days that the month of a year has.

public class JavaQuest3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName;

    System.out.print("Input a year: ");
    int year = input.nextInt();

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      number_Of_DaysInMonth = 31;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      number_Of_DaysInMonth = 30;
    } else if (month == 2) {
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        number_Of_DaysInMonth = 29;
      } else {
        number_Of_DaysInMonth = 28;
      }
    } else {
      System.out.println("Invalid input");
    }



    // Complete the switch statement
    switch (month) {
      case 1:
        monthOfName = "January";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 2:
        monthOfName = "February";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 3:
        monthOfName = "March";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 4:
        monthOfName = "April";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 5:
        monthOfName = "May";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 6:
        monthOfName = "June";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 7:
        monthOfName = "July";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 8:
        monthOfName = "August";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 9:
        monthOfName = "September";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 10:
        monthOfName = "October";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 11:
        monthOfName = "November";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      case 12:
        monthOfName = "December";
        System.out.println(monthOfName + year + " has " + number_Of_DaysInMonth + " days");
        break;
      default:
        System.out.println("Invalid input");
        break;
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
    }
    System.out.println(monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }
}
