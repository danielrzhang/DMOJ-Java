import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmeraldExchange {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int counter = 0;
		int maxCounter = 0;

		String[] input = in.readLine().split(" ");

		int weight;
		for (int i = 0; i < input.length; i++) {
			weight = Integer.parseInt(input[i]);

			if (weight % 2 == 0) {
				counter += weight;
			} else {
				if (counter > maxCounter) {
					maxCounter = counter;
					counter = 0;
				} else {
					counter = 0;
				}
			}
			
			if (i == input.length - 1) {
				if (counter > maxCounter) {
					maxCounter = counter;
				}
			}
		}
		System.out.println(maxCounter);
	}
}
