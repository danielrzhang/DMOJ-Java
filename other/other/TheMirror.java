package other;
import java.util.Scanner;
public class TheMirror {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();

		for (int m = 0; m < n; m++) {
			int startNumber = in.nextInt();
			int endNumber = in.nextInt();

			int counter = 0;
			for (int i = startNumber; i <= endNumber; i++) {
				if (i == 1) {
					continue;
				}

				else if (i == 2) {
					counter++;
				}
				int sqrtNum = (int) (Math.sqrt(i));
				boolean isPrime = true;
				for (int j = 2; j <= sqrtNum + 1; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}

				if (isPrime) {
					counter++;
				}
			}

			System.out.println(counter);
		}
		in.close();

	}
}