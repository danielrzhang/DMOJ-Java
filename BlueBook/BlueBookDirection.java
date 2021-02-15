import java.util.*;
import java.io.*;

public class BlueBookDirection {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    int direction;
    String result;
    
    for (int i = 0; i < n; i++) {
      direction = Integer.parseInt(in.readLine());
      if (direction >= 0 && direction <= 90) {
        if (direction <= 90 - direction) {
          result = "N";
        }
        else {
          result = "E";
        }
      }
      else if (direction >= 90 && direction <= 180) {
        if (direction - 90 <= 180 - direction) {
          result = "E";
        }
        else {
          result = "S";
        }
      }
      else if (direction >= 180 && direction <= 270) {
        if (direction - 180 <= 270 - direction) {
          result = "S";
        }
        else {
          result = "W";
        }
      }
      else { 
        if (direction - 270 <= 360 - direction) {
          result = "W";
        }
        else {
          result = "N";
        }
      }
      System.out.println(result);
    }
  }
}