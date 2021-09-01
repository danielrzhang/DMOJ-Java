import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrashPush {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int t = readInt();
		
		String[] input;
		int n, k;
		for (int i = 0; i < t; i++) {
			input = readSpaceInput();
			n = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			
			System.out.println((int) (Math.ceil(n * 1.0 / k)));
			
		}
	}
	
	public static String readLine() throws IOException {
		return in.readLine();
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
