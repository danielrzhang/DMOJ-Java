import java.util.*;
import java.io.*;

public class dmopc20contest1p1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    String input;
    
    for (int i = 0; i < n; i++) {
      input = in.readLine();
      if (!input.contains("M") && !input.contains("C")) {
        System.out.println("PASS");
      }
      else if ((input.contains("M") && !input.contains("C")) || (input.contains("C") && !input.contains("M"))) {
        System.out.println("FAIL");
      }
      else {
        System.out.println("NEGATIVE MARKS");
      }
    }
  }
}