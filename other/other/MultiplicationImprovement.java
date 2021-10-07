package other;
import java.util.Arrays;
import java.util.Scanner;
public class MultiplicationImprovement {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String sequence = in.nextLine();
		String [] numbers = sequence.split("x");
		long [] newNumbers = new long [numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = Long.parseLong(numbers[i]);
		}

		Arrays.sort(newNumbers);

		long result = 1;
		String emptyString = "";

		for (int j = 0; j < newNumbers.length; j++) {
			result *= newNumbers[j];
		}

		for (int k = 0; k < newNumbers.length - 1; k++) {
			emptyString += Long.toString(newNumbers[k]) + "x";
		}
		emptyString += Long.toString(newNumbers[numbers.length - 1]);

		System.out.println(emptyString);

		System.out.println(result);
		in.close();

	}
}