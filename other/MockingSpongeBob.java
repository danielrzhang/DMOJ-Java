package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MockingSpongeBob {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		String input;
		String newString;
		boolean isLower;
		for (int i = 0; i < n; i++) {
			input = readString().toLowerCase();
			newString = "";
			isLower = true;
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) >= 97 && input.charAt(j) <= 122) {
					if (isLower) {
						newString += input.charAt(j);
					} else {
						newString += Character.toString(input.charAt(j)).toUpperCase();
					}
					isLower = !isLower;
				} else {
					newString += input.charAt(j);
				}
			}
			System.out.println(newString);
		}
	}
	
	public static String readLine() throws IOException {
		return in.readLine();
	}
	
	public static String readString() throws IOException {
		return readLine();
	}
	
	public static int readInt() throws IOException {
		return Integer.parseInt(readLine());
	}
	
	public static long readLong() throws IOException {
		return Long.parseLong(readLine());

	}
	public static double readDouble() throws IOException {
		return Double.parseDouble(readLine());
	}
	
	public static char readCharacter() throws IOException {
		return readLine().charAt(0);
	}
	
	public static String[] readSpaceInput() throws IOException {
		return in.readLine().split(" ");
	}
}
