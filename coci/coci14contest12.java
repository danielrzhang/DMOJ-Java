package coci;
import java.util.Scanner;
public class coci14contest12 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int minX = 101;
		int minY = 101;
		int maxX = -1;
		int maxY = -1;

		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();

			if (x <= minX) {
				minX = x;
			}

			if (x >= maxX) {
				maxX = x;
			}

			if (x <= minY) {
				minY = y;
			}

			if (y >= maxY) {
				maxY = y;
			}
		}

		int xDistance = maxX - minX;
		int yDistance = maxY - minY;

		System.out.println((int) Math.pow(Math.max(xDistance, yDistance), 2));
		in.close();

	}
}