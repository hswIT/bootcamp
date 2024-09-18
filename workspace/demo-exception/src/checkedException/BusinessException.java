package checkedException;
// Once the class extends Exception, this class becomes Checked Exception class
public class BusinessException extends Exception {

  public static void main(String[] args)  {
   //BusinessException be = new BusinessException();

   try {
   calculate(19, 1);
   } catch (BusinessException e) {
     System.out.println("business exception handled");
   }
  }


  public static int calculate(int x, int y) throws BusinessException {
    if (x + y < 20)
      return x + y;
    throw new BusinessException();
  }
}
