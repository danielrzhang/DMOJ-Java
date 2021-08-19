import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookDays {
	
	public static boolean checkLeapYear(int year) {		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(in.readLine());
		
		int[] dayArray = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] input;
		int year, month, day;
		boolean isLeapYear;
		int dayCounter;
		
		for (int i = 0; i < testCases; i++) {
			input = in.readLine().split(" ");
			year = Integer.parseInt(input[0]);
			month = Integer.parseInt(input[1]);
			day = Integer.parseInt(input[2]);
			isLeapYear = checkLeapYear(year);
			dayCounter = 0;
			
			for (int j = 0; j < month - 1; j++) {
				if (j == 1 && isLeapYear) {
					dayCounter += 29;
				} else {
					dayCounter += dayArray[j];
				}
			}
			
			dayCounter += day;
			System.out.println(dayCounter);
		}
	}

}
