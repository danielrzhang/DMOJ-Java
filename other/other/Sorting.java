package other;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		for (int i = 0; i < number; i++) {
			String result;
			long firstNumber = in.nextLong();
			long secondNumber = in.nextLong();
			long thirdNumber = in.nextLong();

			if (firstNumber * secondNumber == thirdNumber) {
				result = "POSSIBLE DOUBLE SIGMA";
			}

			else {
				result = "16 BIT S/W ONLY";
			}

			System.out.println(result);
		}
		in.close();


	}
}