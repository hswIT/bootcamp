public class Circle {
  private double radius; // radius is object reference

  // label IS NOT object reference
  // String Object "LAB" exists, even though there is no Circle object reference
  private static String label = "LAB"; // stack memory
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public static String getLabel1() {
    return label;
  }

  public String getLabel2(){
    return label;
  }


  /// !!!!!!!!!    STATIC METHODS   !!!!!!!!!
  // never return instance variable
  // public static double getRadius2() {
  //   return this.radius;
  // }

  // Presentation, so no need to store 
  public double area() {
    return Math.pow(this.radius, 2.0) * Math.PI;
  }


  public static void main(String[] args) {
    Circle circle = new Circle(2.0);
    System.out.println(circle.area());

    // because "label" is a static variable
    // it doesn't belong to any Circle object
    
    // Way to static method
    Circle.getLabel1(); // Label1 is a shared tool

    // Way to instance method
    // Every circle object has getLabel2() method
    new Circle(3.3).getLabel2(); // return static variable
    new Circle(4.5).getLabel2();  // return static variable
    new Circle(10.2).getLabel2(); // return static variable
    new Circle(20.9).getLabel2(); // return static variable
    
    // technically OK but should not call the static method
    // in this way. Should call Circle.getLabel1()
    new Circle(23.1).getLabel1(); 

  }
}
