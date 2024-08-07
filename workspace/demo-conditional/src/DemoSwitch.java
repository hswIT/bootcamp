public class DemoSwitch {

  public static void main(String[] args) {

    int age = 18;
    boolean isAdult = false;
    // if (age >= 18) {
    //   isAdult = true;
    // }

    // 1. if you do not break the switch case, the flow will go thru all cases
    // 2. for case, you can only define one value for checking. No range checking
    // 3. "Switch" statement is only for finite scenario
    // 4. For Switch, java will check your case value , it alerts when it is duplicated

    switch (age) {
      case 18:
        isAdult = true;
        System.out.println("isAdult = " + isAdult);
        break;
      case 17:
        isAdult = true;
        System.out.println("isAdult = " + isAdult);
        break;
      case 16:
        isAdult = true;
        System.out.println("isAdult = " + isAdult);
        break;
    }
    System.out.println("isAdult = " + isAdult);

    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("Weekday");
        //break;
      case "Tuesday":
        System.out.println("Weekday"); // print
        //break;
      case "Wednesday":
        System.out.println("Weekday"); // print
        //break;
      default:
        System.out.println("Weekend"); // print
    }

  }
}
