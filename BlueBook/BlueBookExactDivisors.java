import java.util.*;
import java.io.*;

public class BlueBookExactDivisors {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    
    for (int i = 1; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println(i);
        if (n / i != i) {
          System.out.println(n / i);
        }
      }
    }
  }
}