import java.util.*;
import java.io.*;

public class BlueBookPayment {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int input;
    int aCounter = 0;
    int bCounter = 0;
    int cCounter = 0;
    int dCounter = 0;
    int eCounter = 0;
    int fCounter = 0;
    
    do {
      input = Integer.parseInt(in.readLine());
      if (input == -1) {
        break;
      }
      
      else if (input <= 9999) {
        aCounter++;
      }
      else if (input <= 19999) {
        bCounter++;
      }
      else if (input <= 29999) {
        cCounter++;
      }
      else if (input <= 39999) {
        dCounter++;
      }
      else if (input <= 49999) {
        eCounter++;
      }
      else if (input <= 1000000) {
        fCounter++;
      }
    } while (input != -1);
    
    System.out.println(aCounter);
    System.out.println(bCounter);
    System.out.println(cCounter);
    System.out.println(dCounter);
    System.out.println(eCounter);
    System.out.println(fCounter);
  }
}