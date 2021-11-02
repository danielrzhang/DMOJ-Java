package other;
import java.io.*;
import java.util.*;

public class ListMinimumHard {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(in.readLine()));
    }
    
    Collections.sort(list);
     
    for (int i = 0; i < n; i++) {
      System.out.println(list.get(i));
    }
  }
}