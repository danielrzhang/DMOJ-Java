import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COVIDParty {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(in.readLine());
		int counter = 2;
		int maxSum = 0;

		if (s != 2) {
			while (s > maxSum) {
				counter++;

				maxSum = counter;
				for (int i = counter - 2; i > 0; i -= 2) {
					maxSum += (2 * i);
				}
			}
		}
		System.out.println(counter - 1);
	}
}
