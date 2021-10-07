package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherContest6Problem2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		int[] numbers = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}

		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}

		System.out.println(result);
	}

}
