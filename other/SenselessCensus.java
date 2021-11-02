package ucrpcf21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SenselessCensus {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String[] nums = readSpaceInput();
		int n = Integer.parseInt(nums[0]);
		
		int toadCounter = 0;
		
		String snapshot;
		for (int i = 0; i < n; i++) {
			snapshot = readString();
			
			for (int j = 0; j < snapshot.length(); j++) {
				if (snapshot.charAt(j) == 't') {
					toadCounter++;
				}
			}
		}
		System.out.println(toadCounter);
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
