import java.util.*;

public class coci08contest31 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String[][] whole = new String[5][4];
    int[] scores = new int[5];
    int finalPerson = -1;
    int finalScore = -1;
    
    for (int i = 0; i < whole.length; i++) {
      int sum = 0;
      String[] grades = in.nextLine().split(" ");
      whole[i] = grades;
      
      for (int j = 0; j < whole[i].length; j++) {
        sum += Integer.parseInt(whole[i][j]);
      }
      scores[i] = sum;
    }
    
    int maxValue = -1;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > maxValue) {
        maxValue = scores[i];
        finalScore = maxValue;
        finalPerson = i;
      }
    }
    System.out.println((finalPerson + 1) + " " + finalScore);
  }
}