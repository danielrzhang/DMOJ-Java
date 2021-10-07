package other;
import java.util.Scanner;
public class RenAshbell {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int maxPower = in.nextInt();
		String result = "";

		for (int i = 0; i < number - 1; i++) {
			int nextNums = in.nextInt();

			if (nextNums >= maxPower) {
				result = "NO";
				break;
			}

			else {
				result = "YES";
			}
		}

		System.out.println(result);
		in.close();

	}
}