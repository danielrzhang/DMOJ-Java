package dmopc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc14contest2p1 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		int sum;
		int numTrees;
		int tree;
		for (int i = 1; i <= n; i++) {
			sum = 0;
			numTrees = readInt();
			
			for (int j = 0; j < numTrees; j++) {
				tree = readInt();
				sum += tree;
			}
			
			if (sum == 0) {
				System.out.println("Weekend");
			} else {
				System.out.println("Day " + i + ": " + sum);
			}
			
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
