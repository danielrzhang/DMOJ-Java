package other;
import java.util.Scanner;
public class valentinesday19j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int counter = 0;
		for (int i = 0; i < number; i++) {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();

			if (r >= 240 && r <= 255 && g >= 0 && g <= 200 && b >= 95 && b <= 220) {
				counter++;
			}
		}

		System.out.println(counter);
		in.close();

	}
}
