package other;
import java.util.Scanner;
public class HailstoneNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int counter = 0;
		while (number != 1) {
			if (number % 2 == 0) {
				number /= 2;
			}

			else {
				number = number * 3 + 1;
			}
			counter++;
		}
		System.out.println(counter);
		in.close();

	}
}
