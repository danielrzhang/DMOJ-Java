package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookLeapYear {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int year;

		for (int i = 0; i < n; i++) {
			year = Integer.parseInt(in.readLine());
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else {
					System.out.println(1);
				}
			} else {
				System.out.println(0);
			}
		}
	}
}
