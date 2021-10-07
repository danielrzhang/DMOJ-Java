package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookInterest {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		double principal = Double.parseDouble(input[0]);
		double rate = Double.parseDouble(input[1]);
		double years = Double.parseDouble(input[2]);
		double total;

		for (int i = 0; i <= (int) years; i++) {
			total = principal * Math.pow(1 + (rate * 0.01), i);
			System.out.printf("%d %.2f%n", i, total);
		}

	}
}