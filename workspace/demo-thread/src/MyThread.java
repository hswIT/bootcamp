public class MyThread extends Thread { // worker
  // task
  @Override
  public void run() {
  // similar to Collections.sort() -> compareTo()
  // start() -> run()
    System.out.println("MyThread is running ...");
  }
  
  public static void main(String[] args) {
    
    int y = 3;
    Thread thread3 = y >= 3 ? new MyThread() : new Thread(() -> System.out.println("hello"));
    thread3.start(); //open-close coding style
  }
}
