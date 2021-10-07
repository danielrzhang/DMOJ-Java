package coci;
import java.util.Scanner;
public class coci15contest31 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int counter = 0;

		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			int power = number % 10;
			int division = number / 10;
			int result = (int) Math.pow(division, power);
			counter += result;
		}

		System.out.println(counter);
		in.close();

	}
}
