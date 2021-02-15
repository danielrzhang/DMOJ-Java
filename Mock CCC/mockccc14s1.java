import java.util.*;
import java.io.*;

public class mockccc14s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String reversed = in.readLine();
    String find = in.readLine();
    String actual = "";
    int n = 0;
    boolean found = false;
    
    for (int i = reversed.length() - 1; i >= 0; i--) {
      actual += reversed.charAt(i);
    }
    
    for (int i = find.length(); i < actual.length(); i++) {
      if (find.equals(actual.substring(i - find.length(), i))) {
        n = reversed.length() - i + find.length();
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println(n);
    }
    else {
      System.out.println(-1);
    }
  }
}