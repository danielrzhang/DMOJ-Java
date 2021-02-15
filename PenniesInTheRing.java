import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PenniesInTheRing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(in.readLine());
		int counter;
		while (input != 0) {
			counter = 0;
			for (int i = 0; i <= input; i++) {
				for (int j = 0; j <= input; j++) {
					if ((int) (Math.pow(i, 2)) + (int) (Math.pow(j, 2)) <= (int) (Math.pow(input, 2))) {
						counter++;
					}
				}
			}
			counter = (4 * counter) - (4 * input) - 3;
			System.out.println(counter);
			input = Integer.parseInt(in.readLine());
		}
	}
}
