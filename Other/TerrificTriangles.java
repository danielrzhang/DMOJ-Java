import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class TerrificTriangles {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		String[] input;
		ArrayList<BigInteger> numbers;

		for (int i = 0; i < n; i++) {
			numbers = new ArrayList<BigInteger>();
			input = in.readLine().split(" ");
			for (String word: input) {
				numbers.add(new BigInteger(word));
			}
			Collections.sort(numbers);

			if (numbers.get(0).pow(2).add(numbers.get(1).pow(2)).equals(numbers.get(2).pow(2))) {
				System.out.println("R");
			} else if (numbers.get(0).pow(2).add(numbers.get(1).pow(2)).compareTo(numbers.get(2).pow(2)) == 1) {
				System.out.println("A");
			} else if (numbers.get(0).pow(2).add(numbers.get(1).pow(2)).compareTo(numbers.get(2).pow(2)) == -1) {
				System.out.println("O");
			}
		}
	}

}
