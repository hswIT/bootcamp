

class Week1_Day2 {
  public static void main(String[] args) {
  
    byte x = 100;
    byte y = 20;
    int z = x + y; // arithematic operation will perform by converting byte to int in the process. 
    // Same for short, char
  
    int z1 = z++ + 50; //  z1 become 170, z become 121, the expression of z itself take place after assignment
  
    
  
    System.out.println(z1);
    System.out.println(z);
  
    String game = "bingo";
    System.out.println(game.equals("bingo")); // check if game is equivalent to "bingo"
    System.out.println(game.charAt(1) == '0'); // remainder: using '' for char but not ""
    System.out.println(game.charAt(0) == ("bingo".charAt(3))); 
    System.out.println("bingo".charAt(0) == ('b'));
    
    if (!game.equals("bingo") || !(game.charAt(1) == '0')) {
      System.out.println("Correct");
    } else {
      System.out.println("Wrong");
    }
    
  }
}