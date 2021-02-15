import java.util.*;
import java.io.*;

public class BlueBookWorldPop {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    double rate = Double.parseDouble(in.readLine());
    int firstYear = Integer.parseInt(in.readLine());
    long population = Long.parseLong(in.readLine());
    int lastYear = Integer.parseInt(in.readLine());
    long total;
    
    total = (long) Math.ceil(population * Math.pow(1 + (rate / 100), lastYear - firstYear));
    System.out.println(total);
  }
}