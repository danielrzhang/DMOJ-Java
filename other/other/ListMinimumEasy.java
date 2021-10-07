package other;
import java.util.Scanner;
public class ListMinimumEasy {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		in.close();

	}
}