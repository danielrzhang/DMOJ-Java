package other;
import java.util.Scanner;
public class P2LOL {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int minX = 1001;
		int minY = 1001;
		int maxX = -1001;
		int maxY = -1001;


		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();

			if (x >= maxX) {
				maxX = x;
			}

			if (y >= maxY) {
				maxY = y;
			}

			if (x <= minX) {
				minX = x;
			}

			if (y <= minY) {
				minY = y;
			}
		}

		int result = (maxX - minX) * (maxY - minY);
		System.out.println(result);
		in.close();

	}
}

