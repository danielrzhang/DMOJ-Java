package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookPowerBase {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] input;
		double total;

		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			total = Math.pow(Double.parseDouble(input[0]), Integer.parseInt(input[1]));
			System.out.printf("%.2f%n", total);
		}
	}
}