import java.util.*;
import java.io.*;

public class dmopc18contest1p0 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> ints = new ArrayList<Integer>();

    int n = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < n; i++) {
      ints.add(Integer.parseInt(in.readLine()));
    }
    Collections.sort(ints);
    
    for (int num: ints) {
      System.out.println(num);
    }
  }
}