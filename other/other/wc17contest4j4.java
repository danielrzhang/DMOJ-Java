package other;
import java.util.Scanner;

public class wc17contest4j4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);

		String[] numbers = in.nextLine().split(" ");
		int rows = Integer.parseInt(numbers[0]);
		int columns = Integer.parseInt(numbers[1]);

		int hRow = 0;
		int hColumn = 0;

		int nCounter = 0;
		int eCounter = 0;
		int sCounter = 0;
		int wCounter = 0;
		int[] counterArray = new int[4];
		int maxCounter = 0;


		String[][] content = new String[rows][columns];

		for (int i = 0; i < rows; i++) {
			content[i] = in.nextLine().split("");
			for (int j = 0; j < columns; j++) {
				if (content[i][j].equals("H")) {
					hRow = i;
					hColumn = j;
				}
			}
		}

		for (int i = hRow; i >= 0; i--) {
			if (content[i][hColumn].equals("C")) {
				nCounter++;
			}
		}

		for (int i = hRow; i < rows; i++) {
			if (content[i][hColumn].equals("C")) {
				sCounter++;
			}
		}

		for (int i = hColumn; i >= 0; i--) {
			if (content[hRow][i].equals("C")) {
				wCounter++;
			}
		}

		for (int i = hColumn; i < columns; i++) {
			if (content[hRow][i].equals("C")) {
				eCounter++;
			}
		}

		counterArray[0] = nCounter;
		counterArray[1] = eCounter;
		counterArray[2] = sCounter;
		counterArray[3] = wCounter;
		for (int i = 0; i < counterArray.length; i++) {
			if (maxCounter < counterArray[i]) {
				maxCounter = counterArray[i];
			}
		}
		System.out.println(maxCounter);
	}
}