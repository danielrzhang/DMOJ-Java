import java.util.*;
import java.io.*;

public class mockccc14j1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int firstDay = Integer.parseInt(in.readLine());
    int secondDay = Integer.parseInt(in.readLine());
    int overDose = Integer.parseInt(in.readLine());
    
    if (firstDay > overDose) {
      System.out.println("Bob overdoses on day 1.");
    }
    else if ((firstDay / 2.0) + secondDay > overDose) {
      System.out.println("Bob overdoses on day 2.");
    }
    else {
      System.out.println("Bob never overdoses.");
    }
  }
}