public class DemoStaticMethod {

  public static void main(String[] args) {
    //Approach 1
    //  Bad => careless mistake
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 * 3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 * 3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 * 3.14);

    // Approach 2
    // Bad
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    double area = 0.0;
    for (int i = 0; i < radiusList.length; i++) {
      area = radiusList[i] * radiusList[i] * 3.14;
      System.out.println(area);
    }
    

        // Approach 3
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    // sum up all circle area
    double totalArea = 0.0;
    for (int i = 0; i < radiusList2.length; i++) {
      totalArea += calculateCircleArea(radiusList2[i]);
    }
    System.out.println(totalArea);


  }
      // if inout is able to produce output, then is is a static method
  public static double calculateCircleArea(double radius) {
    //return radius * radius * Math.PI;
    return Math.pow(radius, 2.0) * Math.PI;
  }

  


}
