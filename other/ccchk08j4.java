package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccchk08j4 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static int scanGrid(String snapshot, char ch) {
		int counter = 0;
		
		for (int i = 0; i < snapshot.length(); i++) {
			if (snapshot.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		String snapshot;
		for (int i = 0; i < n; i++) {
			snapshot = readString();
			
			if (scanGrid(snapshot, 'X') >= scanGrid(snapshot, 'O')) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
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
