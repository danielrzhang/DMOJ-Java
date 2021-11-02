package other;
import java.util.Scanner;
public class mwc151p5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String firstName = in.nextLine().toLowerCase();
		String secondName = in.nextLine().toLowerCase();

		int [] firstArray = new int [firstName.length()];
		int [] secondArray = new int [secondName.length()];

		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (ch == 'a')
				firstArray[i] = 1;

			else if (ch == 'b')
				firstArray[i] = 2;

			else if (ch == 'c')
				firstArray[i] = 3;

			else if (ch == 'd')
				firstArray[i] = 4;

			else if (ch == 'e')
				firstArray[i] = 5;

			else if (ch == 'f')
				firstArray[i] = 6;

			else if (ch == 'g')
				firstArray[i] = 7;

			else if (ch == 'h')
				firstArray[i] = 8;

			else if (ch == 'i')
				firstArray[i] = 9;

			else if (ch == 'j')
				firstArray[i] = 10;

			else if (ch == 'k')
				firstArray[i] = 11;

			else if (ch == 'l')
				firstArray[i] = 12;

			else if (ch == 'm')
				firstArray[i] = 13;

			else if (ch == 'n')
				firstArray[i] = 14;

			else if (ch == 'o')
				firstArray[i] = 15;

			else if (ch == 'p')
				firstArray[i] = 16;

			else if (ch == 'q')
				firstArray[i] = 17;

			else if (ch == 'r')
				firstArray[i] = 18;

			else if (ch == 's')
				firstArray[i] = 19;

			else if (ch == 't')
				firstArray[i] = 20;

			else if (ch == 'u')
				firstArray[i] = 21;

			else if (ch == 'v')
				firstArray[i] = 22;

			else if (ch == 'w')
				firstArray[i] = 23;

			else if (ch == 'x')
				firstArray[i] = 24;

			else if (ch == 'y')
				firstArray[i] = 25;

			else if (ch == 'z')
				firstArray[i] = 26;
		}

		for (int i = 0; i < secondName.length(); i++) {
			char ch = secondName.charAt(i);
			if (ch == 'a')
				secondArray[i] = 1;

			else if (ch == 'b')
				secondArray[i] = 2;

			else if (ch == 'c')
				secondArray[i] = 3;

			else if (ch == 'd')
				secondArray[i] = 4;

			else if (ch == 'e')
				secondArray[i] = 5;

			else if (ch == 'f')
				secondArray[i] = 6;

			else if (ch == 'g')
				secondArray[i] = 7;

			else if (ch == 'h')
				secondArray[i] = 8;

			else if (ch == 'i')
				secondArray[i] = 9;

			else if (ch == 'j')
				secondArray[i] = 10;

			else if (ch == 'k')
				secondArray[i] = 11;

			else if (ch == 'l')
				secondArray[i] = 12;

			else if (ch == 'm')
				secondArray[i] = 13;

			else if (ch == 'n')
				secondArray[i] = 14;

			else if (ch == 'o')
				secondArray[i] = 15;

			else if (ch == 'p')
				secondArray[i] = 16;

			else if (ch == 'q')
				secondArray[i] = 17;

			else if (ch == 'r')
				secondArray[i] = 18;

			else if (ch == 's')
				secondArray[i] = 19;

			else if (ch == 't')
				secondArray[i] = 20;

			else if (ch == 'u')
				secondArray[i] = 21;

			else if (ch == 'v')
				secondArray[i] = 22;

			else if (ch == 'w')
				secondArray[i] = 23;

			else if (ch == 'x')
				secondArray[i] = 24;

			else if (ch == 'y')
				secondArray[i] = 25;

			else if (ch == 'z')
				secondArray[i] = 26;
		}

		long firstTotal = 0;
		long secondTotal = 0;

		for (int j = 0; j < firstArray.length; j++) {
			int number = firstArray[j];
			long subtotal = (long) Math.pow(number, j + 1);
			firstTotal += subtotal;
		}

		for (int k = 0; k < secondArray.length; k++) {
			int number = secondArray[k];
			long subtotal = (long) Math.pow(number, k + 1);
			secondTotal += subtotal;
		}

		String firstString = Long.toString(firstTotal);
		String secondString = Long.toString(secondTotal);

		int firstDigit = Integer.parseInt(firstString.substring(firstString.length()-1));
		int secondDigit = Integer.parseInt(secondString.substring(secondString.length()-1));

		if (firstDigit == 0) {
			firstDigit = 10;
		}

		if (secondDigit == 0) {
			secondDigit = 10;
		}

		System.out.println(firstDigit + secondDigit);
		in.close();

	}
}

