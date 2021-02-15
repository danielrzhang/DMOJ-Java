import java.io.*;
import java.util.*;

public class BubbleSort {
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i >= array.length - 1) {
        System.out.print(array[i]);
      }
      else {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int temp;
    boolean changed;
    int num = in.nextInt();
    in.nextLine();
    
    String[] tempArray = {"3", "6", "4", "2", "5", "1"};//in.nextLine().split(" ");
    int[] array = new int[num];
    
    for (int i = 0; i < tempArray.length; i++) {
      array[i] = Integer.parseInt(tempArray[i]);
    }
    
    for (int i = 0; i < array.length; i++) {
      changed = false;
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          printArray(array);
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          changed = true;
        }
      }
      if (!changed) {
        break;
      }
    }
    printArray(array);
  }
  
}