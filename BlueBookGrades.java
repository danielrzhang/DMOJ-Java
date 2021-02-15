import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookGrades {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int grade;

		for (int i = 0; i < n; i++) {
			grade = Integer.parseInt(in.readLine());

			if (grade <= 100 && grade >= 80) {
				System.out.println('A');
			} else if (grade >= 70 && grade <= 79) {
				System.out.println('B');
			} else if (grade >= 60 && grade <= 69) {
				System.out.println('C');
			} else if (grade >= 50 && grade <= 59) {
				System.out.println('D');
			} else if (grade >= 0 && grade <= 49) {
				System.out.println('F');
			} else {
				System.out.println('X');
			}
		}
	}
}
