package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class utsopen18p1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		BigInteger firstNum = new BigInteger(input[0]);
		BigInteger secondNum = new BigInteger(input[1]);

		BigInteger sum = firstNum.add(secondNum);
		BigInteger difference = firstNum.subtract(secondNum);
		BigInteger product = firstNum.multiply(secondNum);

		ArrayList<BigInteger> list = new ArrayList<BigInteger>(Arrays.asList(sum, difference.abs(), product));

		System.out.println(Collections.max(list));
	}
}
