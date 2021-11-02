package other;
import java.util.Scanner;

public class ThreeNPlusOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();

		int counter = 0;
		do {
			if (n == 1) {
				break;
			}

			else {
				if (n % 2 == 0) {
					n = n / 2;
				}

				else {
					n = 3 * n + 1;
				}
				counter++;
			}
		} while (n != 1);
		System.out.println(counter);
	}
}