import java.util.*;
import java.io.*;

public class BlueBookMax {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Double> numbers = new ArrayList<Double>();
    
    int n = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < n; i++) {
      numbers.add(Double.parseDouble(in.readLine()));
    }
    Collections.sort(numbers);
    System.out.printf("%.4f%n", numbers.get(numbers.size() - 1));
  }
}