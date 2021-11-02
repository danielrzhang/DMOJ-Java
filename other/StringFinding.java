package other;
import java.util.Scanner;

public class StringFinding {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String firstString = in.nextLine();
		String secondString = in.nextLine();
		int result = 0;

		for (int i = 0; i <= firstString.length() - secondString.length(); i++) {
			if (firstString.substring(i, i + secondString.length()).equals(secondString)) {
				result = i;
				break;
			}
			result = -1;
		}
		System.out.println(result);
		in.close();

	}
}