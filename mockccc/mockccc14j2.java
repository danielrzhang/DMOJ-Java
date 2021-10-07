package mockccc;
import java.util.*;
import java.io.*;

public class mockccc14j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    ArrayList<String> words = new ArrayList<String>();
    String removedWord, reversedWord;
    String finalWord = "";
    
    for (int i = 0; i < n; i++) {
      words.add(in.readLine().trim());
    }
    Collections.reverse(words);
    
    for (int i = 0; i < words.size(); i++) {
      reversedWord = "";
      if ((i + 1) % 2 == 0) {
        removedWord = words.remove(i);
        for (int j = removedWord.length() - 1; j >= 0; j--) {
          reversedWord += removedWord.charAt(j);
        }
        words.add(i, reversedWord);
      }
    }
    for (String chunk: words) {
      finalWord += chunk;
    }
    System.out.println(finalWord);
  }
}