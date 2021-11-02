package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDates {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void checkValidDate(String str) {
		if (str.length() < 10) {
			return;
		}
		
		for (int i = 0; i <= str.length() - 10; i++) {
			if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1)) && Character.isDigit(str.charAt(i + 2))
					&& Character.isDigit(str.charAt(i + 3)) && str.charAt(i + 4) == '-' && Character.isDigit(str.charAt(i + 5))
					&& Character.isDigit(str.charAt(i + 6)) && str.charAt(i + 7) == '-' && Character.isDigit(str.charAt(i + 8))
					&& Character.isDigit(str.charAt(i + 9))) {
				System.out.println(str.substring(i, i + 10));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		int n = readInt();

		String input;
		for (int i = 0; i < n; i++) {
			input = readString();

			checkValidDate(input);
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
