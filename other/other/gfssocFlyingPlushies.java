package other;
import java.util.Scanner;

public class gfssocFlyingPlushies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int flight = in.nextInt();
		int number = in.nextInt();
		int counter = 0;

		for (int i = 0; i < number; i++) {
			int plushy = in.nextInt();
			if (plushy >= flight) {
				counter++;
			}
		}
		System.out.println(Integer.toString(counter));
		in.close();

	}
}