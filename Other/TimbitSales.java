import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimbitSales {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		String[] input;
		double change, newPrice, originalPrice;

		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			newPrice = Double.parseDouble(input[0]);
			change = Double.parseDouble(input[1]);

			originalPrice = newPrice / (1 + (change / 100));
			System.out.printf("%.5f%n", originalPrice);
		}
	}
}
