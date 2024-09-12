package animal;

public class SmallCat extends Cat implements Runnable {
  // @Override
  public void run() {
    System.out.println("Small Cat is running ....");
  }
}