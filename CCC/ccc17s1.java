import java.io.*;
import java.util.*;

public class ccc17s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    int swiftCounter = 0;
    int semaphoreCounter = 0;
    int dayCounter = 0;
    
    String[] swifts = in.readLine().split(" ");;
    String[] semaphores = in.readLine().split(" ");
    
    for (int i = 0; i < swifts.length; i++) {
      swiftCounter += Integer.parseInt(swifts[i]);
      semaphoreCounter += Integer.parseInt(semaphores[i]);
      if (swiftCounter == semaphoreCounter && swiftCounter != 0 && semaphoreCounter != 0) {
        dayCounter = i + 1;
      }
    }
    System.out.println(dayCounter);
  }
}