package dmopc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc19contest6p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double x1, y1, x2, y2, x3, y3, x4, y4;

		double slope1 = 0;
		double slope2 = 0;

		double b1 = 0;
		double b2 = 0;

		double intersectX = 0;
		double intersectY = 0;

		int result = -1; // 0 = coincident, 1 = parallel, 2 = intersect

		String[] firstSet = in.readLine().split(" ");
		String[] secondSet = in.readLine().split(" ");

		boolean undefined1 = false;
		boolean undefined2 = false;

		x1 = Integer.parseInt(firstSet[0]);
		y1 = Integer.parseInt(firstSet[1]);
		x2 = Integer.parseInt(firstSet[2]);
		y2 = Integer.parseInt(firstSet[3]);
		x3 = Integer.parseInt(secondSet[0]);
		y3 = Integer.parseInt(secondSet[1]);
		x4 = Integer.parseInt(secondSet[2]);
		y4 = Integer.parseInt(secondSet[3]);

		slope1 = (y2 - y1) / (x2 - x1);
		slope2 = (y4 - y3) / (x4 - x3);

		if ((slope1 == Double.POSITIVE_INFINITY) || (slope1 == Double.NEGATIVE_INFINITY)) {
			undefined1 = true;

		}else{
			b1 = y1 - (slope1 * x1);
		}

		if (slope2 == Double.POSITIVE_INFINITY || slope2 == Double.NEGATIVE_INFINITY) {
			undefined2 = true;

		}else{
			b2 = y3 - (slope2 * x3);
		}

		//System.out.println("y = " + slope1 + "x + " + b1);
		//System.out.println("y = " + slope2 + "x + " + b2);


		// Check if undefined
		if (undefined1 || undefined2) {
			// (vertical, vertical): parallel, then coincident
			if (undefined1 && undefined2) {
				if ((x1 == x3) && (x2 == x4) && (x1 == x4) && (x2 == x3)) {
					result = 0;
				}else{
					result = 1;
				}
			}

			// (slant/horizontal, vertical): Find intersection
			else if ((undefined1) && (!undefined2)) {
				intersectX = x1;
				intersectY = (slope2 * intersectX) + b2;
			}

			// (vertical, slant/horizontal): Find intersection
			else if ((!undefined1) && (undefined2)) {
				intersectX = x3;
				intersectY = (slope1 * intersectX) + b1;
			}
		}

		else {
			// (slant, slant), (horizontal, horizontal): parallel, then coincident
			if (slope1 == slope2) {
				if (b1 == b2) {
					result = 0;
				}else{
					result = 1;
				}
			}

			// (slant, slant), (slant, horizontal), (horizontal, slant): Find intersection
			else if (slope1 != slope2) {
				intersectX = (b2 - b1) / (slope1 - slope2);
				intersectY = (slope1 * intersectX) + b1;
			}
		}

		//System.out.println("(" + intersectX + ", " + intersectY + ")");
		if (result == 0) {
			System.out.println("coincident");
		}

		else if (result == 1) {
			System.out.println("parallel");
		}

		else {
			System.out.printf("%.6f %.6f%n", intersectX, intersectY);
		}
	}
}