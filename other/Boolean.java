package other;
import java.util.Scanner;
public class Boolean {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		int notCounter = 0;
		String last = str.substring(str.length() - 4, str.length());

		for (int i = 3; i < str.length(); i++) {
			String str2 = str.substring(i - 3, i);
			if (str2.equals("not"))
				notCounter++;
		}

		if (notCounter % 2 == 0 && last.equals("True"))
			System.out.println("True");

		else if (notCounter % 2 == 1 && last.equals("True"))
			System.out.println("False");

		else if (notCounter % 2 == 0 && last.equals("alse"))
			System.out.println("False");

		else if (notCounter % 2 == 1 && last.equals("alse"))
			System.out.println("True");
		in.close();
	}
}