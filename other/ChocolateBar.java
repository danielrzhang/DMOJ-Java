package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateBar {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		String[] input;
		for (int i = 0; i < n; i++) {
			input = readSpaceInput();
			System.out.println(Integer.parseInt(input[0]) * Integer.parseInt(input[1]) - 1);
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
