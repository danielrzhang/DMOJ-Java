import java.util.*;
import java.io.*;

public class ccc16s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String first = in.readLine();
    String second = in.readLine();
    boolean isAnagram = true;
    
    int[] letterCount = new int [26];
    
    for (int i = 0; i < first.length(); i++) {
      letterCount[((int) first.charAt(i)) - 97]++;
    }
    
    for (int i = 0; i < second.length(); i++) {
      if (second.charAt(i) != '*') {
        if (letterCount[(int) second.charAt(i) - 97] == 0) {
          isAnagram = false;
          break;
        }
        else {
          letterCount[(int) second.charAt(i) - 97]--;
        }
      }
    }
    if (isAnagram) {
      System.out.println("A");
    }
    else {
      System.out.println("N");
    }
  }
}
