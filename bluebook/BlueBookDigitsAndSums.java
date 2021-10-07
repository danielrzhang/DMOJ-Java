package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookDigitsAndSums {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		int n1 = Integer.parseInt(input[0]);
		int n2 = Integer.parseInt(input[1]);
		int currentNum;
		int copyNum;
		int total;

		for (int i = n1; i <= n2; i++) {
			total = 0;
			currentNum = i;
			copyNum = i;
			for (int j = 0; j < 3; j++) {
				total += (int) Math.pow(currentNum % 10, 3);
				currentNum /= 10;
			}
			if (total == copyNum) {
				System.out.println(i);
			}
		}
	}
}