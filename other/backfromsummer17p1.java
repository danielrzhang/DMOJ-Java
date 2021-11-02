package other;
import java.util.Scanner;
public class backfromsummer17p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int counter = -1;

		for (int i = 0; i < number + 1; i++) {
			String passtime = in.nextLine();
			int length = passtime.length();
			if (length <= 10) {
				counter++;
			}
		}

		System.out.println(counter);
		in.close();
	}
}
