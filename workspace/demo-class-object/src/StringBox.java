import java.util.Arrays;

public class StringBox {
  private char[] characters; // object reference

  // new String
  public StringBox(String s) {
    // s -> char[]
      this.characters = new char[s.length()]; // !!!!
      for (int i = 0; i < s.length(); i++) {
        this.characters[i] = s.charAt(i);
      }
      //System.out.println(this.charAt(1));
  }

  public char[] getCharacters() {
    return this.characters;
  }
  // Design: revise the data of the object (modify itself, the original data)
  public void setCharAt(char c, int index){
    this.characters[index] = c;
  }

  public char charAt(int index) {
    return this.characters[index];
  }

  public int length() {
    return this.characters.length;
  }

  // first indexOf 
  public int indexOf(char c) {
    for (int i = 0; i < this.characters.length; i++) {
      if (this.characters[i] == c) {
        return i;
      }
      return -1;
    }
  }

  // replace('c', 'x')
  public String replace(char o, char n) {
    char[] arr = new char[this.characters.length];
    for (int i = 0; i < this.characters.length; i++){
      arr[i] = this.characters[i] == o ? n : this.characters[i];
    }
    return String.valueOf(arr); // new String(arr)
  }

  public String substring(int beginIndex, int endIndex) {
    char[] arr = new char[this.characters.length];
    for (int i = beginIndex; i < endIndex; i++){
      arr[i] = this.characters[i];
    }
    return String.valueOf(arr); // char[] to String
  }

  public String toString() {
    return String.valueOf(this.characters) + " modified toString";
  }

  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    System.out.println(s.charAt(1));
    System.out.println(sb.charAt(0));

    System.out.println(s.indexOf('c'));
    System.out.println(sb.replace('c', 'x'));

    System.out.println(sb);
    System.out.println(s.substring(0, 2));

    StringBox sb2 = sb;
    System.out.println(sb2);

    sb.setCharAt('a', 2); // Stringbox object address
    System.out.println(sb); // abc => aba
    System.out.println(sb2);

    char[] arr = sb.getCharacters(); // getCharacters() is a method, return the address of the characters
    arr[0] = '@';
    System.out.println(sb2);

    // remove the linkages between sb/sb2 and StringBox Object
    sb = null;
    sb2 = null;
    // but the char array still exit
    System.out.println(Arrays.toString(arr)); // [m, b, a]
  }
}
