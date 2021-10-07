package dmopc;
import java.util.Scanner;
public class dmopc18contest2p1 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int minX = -1000000;
		int maxX = 1000000;
		int minY = -1000000;
		int maxY = 1000000;

		for (int i = 0; i < number; i++) {
			int x = in.nextInt();
			int y = in.nextInt();

			if (minX <= x) {
				minX = x;
			}

			if (maxX >= x) {
				maxX = x;
			}

			if (minY <= y) {
				minY = y;
			}

			if (maxY >= y) {
				maxY = y;
			}

		}
		int resultX = minX - maxX;
		int resultY = minY - maxY;

		System.out.println(2 * resultX + 2 * resultY);
		in.close();

	}
}
