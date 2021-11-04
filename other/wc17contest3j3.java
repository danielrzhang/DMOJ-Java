package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wc17contest3j3 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String str = readString();
		
		int lowerCounter = 0;
		int upperCounter = 0;
		int digitCounter = 0;
		boolean alphanumeric = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				lowerCounter++;
			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCounter++;
			} else if (Character.isDigit(str.charAt(i))) {
				digitCounter++;
			} else {
				alphanumeric = false;
				break;
			}
		}
		
		if (alphanumeric && str.length() >= 8 && str.length() <= 12 && lowerCounter >= 3 && upperCounter >= 2 && digitCounter >= 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
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
