import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc07j3 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int[] amounts = new int[] {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		
		int n = readInt();
		
		int caseNumber;
		for (int i = 0; i < n; i++) {
			caseNumber = readInt() - 1;
			amounts[caseNumber] = 0;
		}
		
		double dealPrice = readDouble();
		
		double sum = 0;
		for (int i = 0; i < amounts.length; i++) {
			sum += amounts[i];
		}
		
		sum = sum / (10 - n);
				
		if (sum < dealPrice) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
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
