package ucrpcf21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathsOfGlory {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String[] input1 = readSpaceInput();
		int teamOne = Integer.parseInt(input1[0]);
		int teamTwo = teamOne;
		int rounds = Integer.parseInt(input1[1]);
		
		boolean printedMessage = false;
		
		String[] input2;
		int first, second, third, fourth;
		for (int i = 0; i < rounds; i++) {
			input2 = readSpaceInput();
			first = Integer.parseInt(input2[0]);
			second = Integer.parseInt(input2[1]);
			third = Integer.parseInt(input2[2]);
			fourth = Integer.parseInt(input2[3]);

			teamOne -= third * fourth;
			teamTwo -= first * second;
			
			if (teamOne <= 0 && teamTwo > 0) {
				System.out.println("Team 2 wins at round " + (i + 1) + "!");
				printedMessage = true;
				break;
			} else if (teamOne > 0 && teamTwo <= 0) {
				System.out.println("Team 1 wins at round " + (i + 1) + "!");
				printedMessage = true;
				break;
			} else if (teamOne <= 0 && teamTwo <= 0) {
				System.out.println("It's a tie at round " + (i + 1) + "!");
				printedMessage = true;
				break;
			}
		}
		
		if (!printedMessage) {
			System.out.println("Oh no!");
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
