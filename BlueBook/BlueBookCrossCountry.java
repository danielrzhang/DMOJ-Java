import java.util.*;
import java.io.*;

public class BlueBookCrossCountry {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String code = in.readLine();
    
    switch (code) {
      case "MG": {
        System.out.println("midget girls");
        break;
      }
      
      case "MB": {
        System.out.println("midget boys");
        break;
      }
      
      case "JG": {
        System.out.println("junior girls");
        break;
      }
      
      case "JB": {
        System.out.println("junior boys");
        break;
      }
      
      case "SG": {
        System.out.println("senior girls");
        break;
      }
      
      case "SB": {
        System.out.println("senior boys");
        break;
      }
      
      default: {
        System.out.println("invalid code");
      }
    }
  }
}