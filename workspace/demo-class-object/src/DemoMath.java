import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // min
    System.out.println(Math.min(7,3)); // 3
    System.out.println(Math.min(2,8)); // 2
    System.out.println(Math.min(5,5)); // 5

    // max
    System.out.println(Math.min(7,3)); // 7
    System.out.println(Math.min(2,8)); // 8
    System.out.println(Math.min(5,5)); // 5

    // find max
    int[] arr = new int[] {3, 6, -1, 100, 4};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println("max " + max);

    // find min
    arr = new int[] {3, 6, -1, 100, 4};
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(arr[i], min);
    }
    System.out.println("min "+ min);

    // 
    int[] arr2 = new int[] {3, 6, -1, -400, 3500};
    // Sum up of Absolute value
    int sum = 0;
    for (int i = 0; i < arr2.length; i++) {
      //sum += arr[i] < 0 ? arr[i] * -1 : arr[i];
      sum += Math.abs(arr2[i]);
      System.out.println(sum);
    }

    //  sqrt()
    int x = 81;
    System.out.println(Math.sqrt(x)); // 9.0

    // pow()
    double result = Math.pow(2.0, 3L);
    System.out.println(result);

    // Math.round()c=> round to the nearest integer
    System.out.println(Math.round(10.44111)); // 10 (round to the nearest integer)
    System.out.println(Math.round(10.456789)); // 10 (round to the nearest integer)
    System.out.println(Math.round(10.556789)); // 11 (round to the nearest integer)

    //Math.floor() => round down to the nearest integer
    System.out.println(Math.floor(10.44111)); // 10
    System.out.println(Math.floor(10.456789)); // 10
    System.out.println(Math.floor(10.556789)); // 10

    // Math.ceil() => round up to the nearest integer
    System.out.println(Math.ceil(10.44111)); // 11
    System.out.println(Math.ceil(10.456789)); // 11
    System.out.println(Math.ceil(10.556789)); // 11

    //Math.log()
    System.out.println(Math.log(2)); 

    //Mat.log10()
    System.out.println(Math.log10(1000)); // 3.0

    // random()
    // 0.0 (inclusive) to 1.0 (exclusive)
    System.out.println(Math.random()); // 0.46296295686592226
    System.out.println(Math.random() * 100); // 91.74721213384355
    System.out.println(Math.round((Math.random() * 100))); //

    System.out.println(new Random().nextInt(80) + 120); // 120 - 200

  }
}
