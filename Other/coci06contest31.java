import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class coci06contest31 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> dwarves = new ArrayList<Integer>();
		
		int input;
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			input = readInt();
			dwarves.add(input);
			sum += input;
		}
		
		boolean stop = false;
		for (int i = 0; i < dwarves.size(); i++) {
			for (int j = 0; j < dwarves.size(); j++) {
				if (sum - dwarves.get(i) - dwarves.get(j) == 100) {
					dwarves.remove(dwarves.get(i));
					dwarves.remove(dwarves.get(j - 1));
					stop = true;
					break;
				}
			}
			
			if (stop) {
				break;
			}
		}
		
		for (int i = 0; i < dwarves.size(); i++) {
			System.out.println(dwarves.get(i));
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
