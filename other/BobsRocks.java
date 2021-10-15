package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class BobsRocks {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		readInt();
		
		String[] input = readSpaceInput();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < input.length; i++) {
			if (map.get(input[i]) == null) {
				map.put(input[i], Integer.parseInt(input[i]));
			} else {
				map.put(input[i], map.get(input[i]) + Integer.parseInt(input[i]));
			}
		}
		
		int maxValue = 0;
		String maxAge = "";
		for (Entry<String, Integer> entry: map.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxAge = entry.getKey();
			}
		}
		System.out.println(maxAge);
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
