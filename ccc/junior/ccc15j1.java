package ccc.junior;
import java.util.Scanner;

public class ccc15j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();

		if (month < 2) {
			System.out.println("Before");
		}

		else if (month > 2) {
			System.out.println("After");
		}

		else {
			if (day < 18) {
				System.out.println("Before");
			}

			else if (day > 18) {
				System.out.println("After");
			}

			else {
				System.out.println("Special");
			}
		}
		in.close();

	}
}