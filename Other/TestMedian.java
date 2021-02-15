import java.io.*;
import java.util.*;

public class TestMedian {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    
    ArrayList<Double> scores = new ArrayList<Double>();
    int n = Integer.parseInt(in.readLine());
    double result;
    
    for (int i = 0; i < n; i++) {
      scores.add(Double.parseDouble(in.readLine()));
    }
    Collections.sort(scores);
    if (scores.size() % 2 == 0) {
      result = (scores.get((scores.size() - 1) / 2) + scores.get(((scores.size() - 1) / 2) + 1)) / 2;
    }
    else {
      result = scores.get((scores.size() - 1) / 2);
    }
    System.out.println("The median on the test is " + result);
  }
}