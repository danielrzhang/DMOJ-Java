import java.io.*;
import java.util.*;

public class wc18contest3j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    int pikachu;
    
    int jessie = 0;
    int james = 0;
    int jessieIndex = 0;
    int jamesIndex = 0;
    
    int[] pikachuArray = new int[n];
    
    for (int i = 0; i < n; i++) {
      pikachuArray[i] = Integer.parseInt(in.readLine());
    }
    
    for (int i = 0; i < pikachuArray.length; i++) {
      if (pikachuArray[i] > jessie && pikachuArray[i] <= 100) {
        jessie = pikachuArray[i];
        jessieIndex = i;
      }
    }
    
    for (int i = 0; i < pikachuArray.length; i++) {
      if (pikachuArray[i] > james && pikachuArray[i] <= 100 && i != jessieIndex) {
        james = pikachuArray[i];
        jamesIndex = i;
      }
    }
    System.out.println(jessie + james);
  }
}