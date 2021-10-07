package dwite;
import java.util.Scanner;
public class dwite10r11 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			int day = in.nextInt();
			int month = in.nextInt();
			int year = in.nextInt();
			String result;

			if (year < 1997) {
				result = "old enough";
			}

			else if (year > 1997) {
				result = "too young";
			}

			else {
				if (month < 10) {
					result = "old enough";
				}

				else if (month > 10) {
					result = "too young";
				}

				else {
					if (day <= 27) {
						result = "old enough";
					}

					else {
						result = "too young";
					}
				}
			}
			System.out.println(result);
		}
		in.close();

	}
}
