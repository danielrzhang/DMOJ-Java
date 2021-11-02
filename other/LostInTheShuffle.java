package ucrpcf21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostInTheShuffle {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		String[] swapInput;
		int first, second, temp;
		for (int i = 0; i < n; i++) {
			swapInput = readSpaceInput();
			first = Integer.parseInt(swapInput[0]) - 1;
			second = Integer.parseInt(swapInput[1]) - 1;
			
			temp = array[first];
			array[first] = array[second];
			array[second] = temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 3) {
				System.out.println(i + 1);
				break;
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
