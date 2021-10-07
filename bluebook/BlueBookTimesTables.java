package bluebook;
import java.io.*;

public class BlueBookTimesTables {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    
    for (int i = 1; i <= n; i++) {
      System.out.println(n + " X " + i + " = " + (n * i));
    }
  }
}