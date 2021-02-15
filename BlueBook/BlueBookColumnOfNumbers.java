import java.util.*;
import java.io.*;

public class BluebookColumnOfNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String number = in.readLine();
    
    for (int i = number.length() - 1; i >= 0; i--) {
      System.out.println(number.charAt(i));
    }
  }
}