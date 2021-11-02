package other;
import java.util.Scanner;
public class ccchk08j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int maxC = 0;
		int maxN = 0;

		int c = in.nextInt();
		for (int i = 0; i < c; i++) {
			int weightC = in.nextInt();
			int lengthC = in.nextInt();

			int fishC = weightC * lengthC;

			if (fishC >= maxC) {
				maxC = fishC;
			}
		}

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int weightN = in.nextInt();
			int lengthN = in.nextInt();

			int fishN = weightN * lengthN;

			if (fishN >= maxN) {
				maxN = fishN;
			}
		}

		if (maxC > maxN) {
			System.out.println("Casper");
		}

		else if (maxN > maxC) {
			System.out.println("Natalie");
		}

		else {
			System.out.println("Tie");
		}
		in.close();

	}
}

