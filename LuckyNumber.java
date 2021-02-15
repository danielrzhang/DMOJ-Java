import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LuckyNumber {

	public static BigInteger getNewNum(BigInteger n) {
		BigInteger sum = new BigInteger("0");
		BigInteger ten = new BigInteger("10");

		while (n.compareTo(new BigInteger("1")) >= 0) {
			sum = sum.add(n.mod(ten));
			n = n.divide(ten);
		}

		if (sum.compareTo(ten) == -1) {
			return sum;
		} else {
			return getNewNum(sum);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		BigInteger number;
		for (int i = 0; i < n; i++) {
			number = new BigInteger(in.readLine());
			System.out.println(getNewNum(number));
		}
	}
}
