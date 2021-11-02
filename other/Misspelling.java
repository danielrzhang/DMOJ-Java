package other;
import java.util.Scanner;

public class Misspelling {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		in.nextLine();

		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			int num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			String newStr = str.substring(str.indexOf(" "), str.length());

			String otherStr = newStr.substring(0, num);
			String otherStr2 = newStr.substring(num + 1);
			System.out.println((i + 1) + otherStr + otherStr2);
		}
	}
}