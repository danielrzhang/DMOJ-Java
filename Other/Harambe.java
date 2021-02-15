import java.util.*;
import java.io.*;

public class Harambe {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String first = in.readLine();
    String second = in.readLine();
    int n = Integer.parseInt(in.readLine());
    int counter = 0;
    boolean inSpace = false;
    
    for (int i = 0; i < first.length(); i++) {
      if (first.charAt(i) != second.charAt(i)) {
        if ((first.charAt(i) == ' ' && second.charAt(i) != ' ') || (first.charAt(i) != ' ' && second.charAt(i) == ' ')) {
          inSpace = true;
          break;
        }
        else {
          counter++;
        }
        
      }
    }
    
    if (counter <= n && !inSpace) {
      System.out.println("Plagiarized");
    }
    else {
      System.out.println("No plagiarism");
    }
  }
}