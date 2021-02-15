import java.util.*;
import java.io.*;

public class BlueBookMaxIsLast {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    ArrayList<Double> list = new ArrayList<Double>();
    double maxNum;
    
    for (int i = 0; i < n; i++) {
      list.add(Double.parseDouble(in.readLine()));
    }
    
    maxNum = Collections.max(list);
    list.remove(maxNum);
    list.add(maxNum);
    
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("%.2f%n", list.get(i));
    }
  }
}