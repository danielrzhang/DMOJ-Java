import java.util.*;
import java.io.*;

public class BlueBookFindTheCharacter {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    char ch = in.readLine().toLowerCase().charAt(0);
    String input = in.readLine();
    int counter = 0;
    
    for (int i = 0; i < input.length(); i++) {
      if (input.toLowerCase().charAt(i) == ch) {
        counter++;
      }
    }
    System.out.println(input);
    System.out.println(counter);
  }
}