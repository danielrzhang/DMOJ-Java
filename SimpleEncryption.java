import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleEncryption {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String key = in.readLine();
		String message = in.readLine().replaceAll("[^a-zA-Z]", "");
		String[] alphabet = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

		int tableWidth = key.length();
		int tableHeight = (message.length() / key.length()) + 1;
		String[][] table = new String[tableHeight][tableWidth];

		int counter = 0;
		for (int i = 0; i < tableHeight; i++) {
			for (int j = 0; j < tableWidth; j++) {
				if (counter < message.length()) {
					table[i][j] = Character.toString(message.charAt(counter));
					counter++;
				}
			}
		}

		int change, newNum;
		String newChar;
		for (int i = 0; i < tableWidth; i++) {
			change = key.charAt(i) - 65;
			for (int j = 0; j < tableHeight; j++) {
				if (table[j][i] == null) {
					break;
				}
				newNum = (table[j][i].charAt(0)) + change;
				if (newNum > 90) {
					newNum -= 26;
				}
				newChar = Character.toString((char) newNum);
				table[j][i] = newChar;
			}
		}

		String newString = "";
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] == null) {
					break;
				} else {
					newString += table[i][j];
				}
			}
		}
		System.out.println(newString);
	}
}
