import java.io.*;
import java.util.Scanner;

public class dmopc14contest7p1 { 
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    String[] stationArray = new String[n];
    boolean between = false;
    
    for (int i = 0; i < n; i++) {
      stationArray[i] = in.readLine();
    }
    
    for (int i = 1; i < n - 1; i++) {
      if ((stationArray[i - 1].equals("Bayview") && stationArray[i].equals("Bessarion") && stationArray[i + 1].equals("Leslie"))
            || (stationArray[i - 1].equals("Leslie") && stationArray[i].equals("Bessarion") && stationArray[i + 1].equals("Bayview"))) {
        between = true;
        break;
      }
    }
    
    if (between) {
      System.out.println("Y");
    }
    
    else {
      System.out.println("N");
    }
  }
}