package other;
import java.util.Scanner;
public class pib20p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int counter = 0;

		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			if (number > 0) {
				counter++;
			}
		}
		System.out.println(counter);
		in.close();

	}
}