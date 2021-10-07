package other;
import java.util.Scanner;
public class ThorGoesForThePapaya {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int [] numberList = new int [n];
		String emptyString = "";

		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			numberList[i] = number;
		}

		for (int j = 1; j < n; j++) {
			int multiplied = numberList[j - 1] * numberList[j];
			int remainder = multiplied % 26;

			if (remainder == 0)
				emptyString += "A";

			else if (remainder == 1)
				emptyString += "B";

			else if (remainder == 2)
				emptyString += "C";

			else if (remainder == 3)
				emptyString += "D";

			else if (remainder == 4)
				emptyString += "E";

			else if (remainder == 5)
				emptyString += "F";

			else if (remainder == 6)
				emptyString += "G";

			else if (remainder == 7)
				emptyString += "H";

			else if (remainder == 8)
				emptyString += "I";

			else if (remainder == 9)
				emptyString += "J";

			else if (remainder == 10)
				emptyString += "K";

			else if (remainder == 11)
				emptyString += "L";

			else if (remainder == 12)
				emptyString += "M";

			else if (remainder == 13)
				emptyString += "N";

			else if (remainder == 14)
				emptyString += "O";

			else if (remainder == 15)
				emptyString += "P";

			else if (remainder == 16)
				emptyString += "Q";

			else if (remainder == 17)
				emptyString += "R";

			else if (remainder == 18)
				emptyString += "S";

			else if (remainder == 19)
				emptyString += "T";

			else if (remainder == 20)
				emptyString += "U";

			else if (remainder == 21)
				emptyString += "V";

			else if (remainder == 22)
				emptyString += "W";

			else if (remainder == 23)
				emptyString += "X";

			else if (remainder == 24)
				emptyString += "Y";

			else if (remainder == 25)
				emptyString += "Z";

		}

		System.out.println("Thanos is on Planet: " + emptyString);
		in.close();

	}
}


