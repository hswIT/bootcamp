public class Question2000 {

  public static void main(String[] args) {
    reversePrefix("abcdefd", 'd');
  }
  public static void reversePrefix(String word, char ch) {
    if (word.indexOf(ch) == -1){
      System.out.println(word);
    }

    StringBuilder sb = new StringBuilder();

    System.out.println(word.charAt(word.indexOf(ch) + 1));

    for (int i = 0; i < word.indexOf(ch) + 1; i++){
        sb.append(word.charAt(word.indexOf(ch) - i));
        System.out.println(sb);
    }
    for (int i = word.indexOf(ch) + 1; i < word.length(); i++){
        sb.append(word.charAt(i));
    }

    System.out.println(sb);
  }
}
