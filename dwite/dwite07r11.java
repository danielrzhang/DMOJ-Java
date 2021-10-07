package dwite;
import java.util.Scanner;
public class dwite07r11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		boolean isPrime = true;

		if (number <= 1)
			System.out.println("not");

		else if (number == 2)
			System.out.println("prime");

		else {
			for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
				if (number % i == 0) {
					System.out.println("not");
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println("prime");
		}
		in.close();

	}
}
