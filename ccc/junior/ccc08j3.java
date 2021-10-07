package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc08j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[][] characters = new String[][] {{"a", "b", "c", "d", "e", "f"}, {"g", "h", "i", "j", "k", "l"}, 
			{"m", "n", "o", "p", "q", "r"}, {"s", "t", "u", "v", "w", "x"}, 
			{"y", "z", " ", "-", ".", "enter"}};
			
		int previousRow = 0;
		int previousColumn = 0;
		
		int currentRow = 0;
		int currentColumn = 0;
		
		int enterRow = 4;
		int enterColumn = 5;
		
		int counter = 0;
		
		boolean found;
		
		String input = in.readLine().toLowerCase();
		
		for (int i = 0; i < input.length(); i++) { // Iterate through word
			found = false;
			
			for (int j = 0; j < characters.length; j++) { // Iterate through rows
				for (int k = 0; k < characters[j].length; k++) { // Iterate through columns
					if (characters[j][k].equals(input.substring(i, i + 1))) {
						previousRow = currentRow;
						previousColumn = currentColumn;
						
						currentRow = j;
						currentColumn = k;
						
						counter += Math.abs(currentRow - previousRow) + Math.abs(currentColumn - previousColumn);
						found = true;
					}
				}
				
				if (found) {
					break;
				}
			}
		}
		
		counter += Math.abs(currentRow - enterRow) + Math.abs(currentColumn - enterColumn);
		
		System.out.println(counter);

	}
}
