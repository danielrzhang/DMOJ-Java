import java.util.*;
import java.io.*;

public class CatLovers {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    String animal;
    int catCounter = 0;
    int dogCounter = 0;
    
    for (int i = 0; i < n; i++) {
      animal = in.readLine();
      if (animal.equals("cats")) {
        catCounter++;
      }
      else {
        dogCounter++;
      }
    }
    if (catCounter < dogCounter) {
      System.out.println("dogs");
    }
    else if (catCounter > dogCounter) {
      System.out.println("cats");
    }
    else {
      System.out.println("equal");
    }
  }
}