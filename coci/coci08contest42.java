package coci;
import java.util.Scanner;
public class coci08contest42 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int day = in.nextInt();
		int month = in.nextInt();
		String result = "";

		if (month == 1 || month == 10) {
			if (day % 7 == 0)
				result = "Wednesday";
			else if (day % 7 == 1)
				result = "Thursday";
			else if (day % 7 == 2)
				result = "Friday";
			else if (day % 7 == 3)
				result = "Saturday";
			else if (day % 7 == 4)
				result = "Sunday";
			else if (day % 7 == 5)
				result = "Monday";
			else if (day % 7 == 6)
				result = "Tuesday";
		}

		else if (month == 2 || month == 3 || month == 11) {
			if (day % 7 == 0)
				result = "Saturday";
			else if (day % 7 == 1)
				result = "Sunday";
			else if (day % 7 == 2)
				result = "Monday";
			else if (day % 7 == 3)
				result = "Tuesday";
			else if (day % 7 == 4)
				result = "Wednesday";
			else if (day % 7 == 5)
				result = "Thursday";
			else if (day % 7 == 6)
				result = "Friday";
		}

		else if (month == 4 || month == 7) {
			if (day % 7 == 0)
				result = "Tuesday";
			else if (day % 7 == 1)
				result = "Wednesday";
			else if (day % 7 == 2)
				result = "Thursday";
			else if (day % 7 == 3)
				result = "Friday";
			else if (day % 7 == 4)
				result = "Saturday";
			else if (day % 7 == 5)
				result = "Sunday";
			else if (day % 7 == 6)
				result = "Monday";
		}

		else if (month == 5) {
			if (day % 7 == 0)
				result = "Thursday";
			else if (day % 7 == 1)
				result = "Friday";
			else if (day % 7 == 2)
				result = "Saturday";
			else if (day % 7 == 3)
				result = "Sunday";
			else if (day % 7 == 4)
				result = "Monday";
			else if (day % 7 == 5)
				result = "Tuesday";
			else if (day % 7 == 6)
				result = "Wednesday";
		}

		else if (month == 6) {
			if (day % 7 == 0)
				result = "Sunday";
			else if (day % 7 == 1)
				result = "Monday";
			else if (day % 7 == 2)
				result = "Tuesday";
			else if (day % 7 == 3)
				result = "Wednesday";
			else if (day % 7 == 4)
				result = "Thursday";
			else if (day % 7 == 5)
				result = "Friday";
			else if (day % 7 == 6)
				result = "Saturday";
		}

		else if (month == 9 || month == 12) {
			if (day % 7 == 0)
				result = "Monday";
			else if (day % 7 == 1)
				result = "Tuesday";
			else if (day % 7 == 2)
				result = "Wednesday";
			else if (day % 7 == 3)
				result = "Thursday";
			else if (day % 7 == 4)
				result = "Friday";
			else if (day % 7 == 5)
				result = "Saturday";
			else if (day % 7 == 6)
				result = "Sunday";
		}

		else if (month == 8) {
			if (day % 7 == 0)
				result = "Friday";
			else if (day % 7 == 1)
				result = "Saturday";
			else if (day % 7 == 2)
				result = "Sunday";
			else if (day % 7 == 3)
				result = "Monday";
			else if (day % 7 == 4)
				result = "Tuesday";
			else if (day % 7 == 5)
				result = "Wednesday";
			else if (day % 7 == 6)
				result = "Thursday";
		}

		System.out.println(result);
		in.close();

	}
}