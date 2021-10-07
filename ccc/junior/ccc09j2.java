package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc09j2 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int troutPoints = readInt();
		int pikePoints = readInt();
		int pickerelPoints = readInt();
		int maxPoints = readInt();
		
		int counter = 0;
		
		for (int i = 0; i <= maxPoints + 1; i++) {
			for (int j = 0; j <= maxPoints + 1; j++) {
				for (int k = 0; k <= maxPoints + 1; k++) {
					if ((i * troutPoints + j * pikePoints + k * pickerelPoints <= maxPoints) && (i + j + k != 0)) {
						System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel");
						counter++;
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + counter);
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
