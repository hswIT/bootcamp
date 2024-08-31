public class SmallPerson extends Person {

  // @Override // Compile error
  // public void walk() {
  //   System.out.println("SmallPerson is walking ...");
  // }

  public static void main(String[] args) {

    SmallPerson sp1 = new SmallPerson();
    sp1.walk();
    sp1.swim();
  }
}


