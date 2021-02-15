import java.io.*;
import java.util.*;

public class gfssoc12s2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n1 = Integer.parseInt(in.readLine());
    int n2 = Integer.parseInt(in.readLine());
    
    int counter = 0;
    boolean isAce;
    
    String number;
    char digit;
    
    for (int i = n1; i <= n2; i++) {
      number = Integer.toHexString(i);
      isAce = true;
      
      for (int j = 0; j < number.length(); j++) {
        digit = number.charAt(j);
        
        if (digit != 'a' && digit != 'c' && digit != 'e') {
          isAce = false;
          break;
        }
      }
      
      if (isAce) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}