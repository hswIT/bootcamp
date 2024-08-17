public class Question3210 {
  public static void main(String[] args) {
    System.out.println(getEncryptedString("dark", 3));
    System.out.println(getEncryptedString("aaa", 1));
    System.out.println(getEncryptedString("dark", 7));
    System.out.println(getEncryptedString("classic", 8));
  }

  public static String getEncryptedString(String s, int k) {
    char[] result = new char[s.length()];
        int tempIdx = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.length() == k){
                return s;
            }    
            tempIdx = k > s.length() ? (k % s.length()) : k; 
            if ((i + tempIdx) >= s.length()) {
                result[i] = s.toCharArray()[(i + tempIdx - s.length())];
            } else {
                result[i] = s.toCharArray()[(i + tempIdx)];
            }
        }
        return String.valueOf(result);
  }  
}

// // 3210
// class Solution {
//   public String getEncryptedString(String s, int k) {
//       int target = -1;
//       // String encrypted = "";
//       char[] arr = new char[s.length()];
//       int idx = 0;
//       for (int i = 0; i < s.length(); i++) {
//           target = (i + k) % s.length();
//           // encrypted += s.charAt(idx); // String + char
//           arr[idx++] = s.charAt(target);
//       }
//       return String.valueOf(arr); // new String(arr);
//   }
// }


