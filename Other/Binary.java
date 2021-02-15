import java.util.*;
import java.io.*;

public class Binary {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    int number;
    String binary;
    String result;
    int addZeros;
    int counter;
    
    for (int i = 0; i < n; i++) {
      result = "";
      binary = "";
      counter = 0;
      number = Integer.parseInt(in.readLine());
      binary = Integer.toBinaryString(number);
      if (binary.length() % 4 != 0) {
        addZeros = 4 - (binary.length() % 4);
        for (int j = 0; j < addZeros; j++) {
          result += "0";
        }
        result += binary;
      }
      else {
        result = binary;
      }
      
      for (int j = 0; j < result.length(); j++) {
        if (j % 4 == 0 && j != 0 && j + counter < result.length()) {
          result = result.substring(0, j + counter) + " " + result.substring(j + counter);
          j++;
          counter++;
        }
      }
      System.out.println(result.trim());
    }
  }
}