package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FibonacciSequence {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static BigInteger zero = new BigInteger("0");
	public static BigInteger one = new BigInteger("1");
	public static BigInteger two = new BigInteger("2");
	public static BigInteger modulus = new BigInteger("1000000007");
	
	public static BigInteger fibonacci(BigInteger n) {
		if (n.compareTo(zero) == 0) {
			return zero;
		} else if (n.compareTo(one) == 0) {
			return one;
		} else {
			return fibonacci(n.subtract(two)).add(fibonacci(n.subtract(one)));
		}
	}
	
	public static void main(String[] args) throws IOException {
		BigInteger n = new BigInteger(readLine());
		System.out.println(fibonacci(n).mod(modulus));
		
		
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
