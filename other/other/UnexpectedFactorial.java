package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class UnexpectedFactorial {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static BigInteger zero = new BigInteger("0");
	public static BigInteger one = new BigInteger("1");
	
	public static BigInteger factorial(BigInteger n) {
		if (n.equals(zero) || n.equals(one)) {
			return one;
		} else {
			return n.multiply(factorial(n.subtract(one)));
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = in.readLine();
		
		int singleDigit;
		int doubleDigit;
		boolean isSingle = false;
		boolean isDouble = false;
		
		// Iterate double digits
		for (int i = 0; i < str.length() - 2; i++) {
			try {
				doubleDigit = Integer.parseInt(str.substring(i, i + 2));
				if (i <= str.length() - 2) {
					if (str.substring(i + 2, i + 3).equals("!")) {
						isDouble = true;
						System.out.println(factorial(new BigInteger(Integer.toString(doubleDigit))));
						break;
					}
				}
 			} catch (NumberFormatException e) {
			}
		}
		
		// Iterate single digits
		for (int i = 0; i < str.length() - 1; i++) {
			try {
				singleDigit = Integer.parseInt(str.substring(i, i + 1));
				if (i <= str.length() - 1) {
					if (str.substring(i + 1, i + 2).equals("!") && !isDouble) {
						isSingle = true;
						System.out.println(factorial(new BigInteger(Integer.toString(singleDigit))));
						break;
					}
				}
			} catch (NumberFormatException e) {
			}
		}
		
		if (!isDouble && !isSingle) {
			System.out.println(-1);
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
