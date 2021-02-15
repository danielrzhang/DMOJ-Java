import java.io.*;
import java.util.*;

public class PostfixNotation {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Stack<Double> stack = new Stack<Double>();    
    
    String[] input = in.readLine().trim().split(" ");
    double first, second;
    double value = 0;
    
    for (int i = 0; i < input.length; i++) {
      switch (input[i]) {
        case "+":
        case "-":
        case "*":
        case "/":
        case "%":
        case "^": {
          second = stack.pop();
          first = stack.pop(); 
          
          switch (input[i]) {
            case "+": {
              value = first + second;
              break;
            }       
            case "-": {
              value = first - second;
              break;
            }
            case "*": {
              value = first * second;
              break;
            }
            case "/": {
              value = first / second;
              break;
            }
            
            case "%": {
              value = first % second;
              break;
            }
            
            case "^": {
              value = Math.pow(first, second);
              break;
            }
          }
          stack.push(value);
          break;
        }      
        default: {
          stack.push(Double.parseDouble(input[i]));
        }
      }
    }
    System.out.println(value);
  }
}