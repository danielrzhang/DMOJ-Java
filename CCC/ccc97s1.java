import java.io.*;
import java.util.*;

public class ccc97s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int numSets = Integer.parseInt(in.readLine());
    int numSubj, numVerb, numObj, index;
    String[] subjList, verbList, objList, sentences;
    
    for (int i = 0; i < numSets; i++) {
      numSubj = Integer.parseInt(in.readLine());
      numVerb = Integer.parseInt(in.readLine());
      numObj = Integer.parseInt(in.readLine());
      
      subjList = new String[numSubj];
      verbList = new String[numVerb];
      objList = new String[numObj];
      sentences = new String[numSubj * numVerb * numObj];
      
      for (int j = 0; j < numSubj; j++) {
        subjList[j] = in.readLine();
      }
      
      for (int j = 0; j < numVerb; j++) {
        verbList[j] = in.readLine();
      }
      
      for (int j = 0; j < numObj; j++) {
        objList[j] = in.readLine();
      }
      
      for (int k = 0; k < numSubj; k++) {
        for (int m = 0; m < numVerb; m++) {
          for (int n = 0; n < numObj; n++) { 
            System.out.println(subjList[k] + " " + verbList[m] + " " + objList[n] + ".");
          }
        }
      }
      System.out.println();
    }
  }
}