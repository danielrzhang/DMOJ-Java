package other;
import java.util.Scanner;
public class artacademy0 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		in.nextLine();

		for (int i = 0; i < n; i++) {
			String emptyString = "";
			String str = in.nextLine().toUpperCase();
			for (int j = 1; j <= str.length(); j++) {
				String ch = str.substring(j - 1, j);

				if (ch.equals("A"))
					emptyString += "Hi! ";

				else if (ch.equals("E"))
					emptyString += "Bye! ";

				else if (ch.equals("I"))
					emptyString += "How are you? ";

				else if (ch.equals("O"))
					emptyString += "Follow me! ";

				else if (ch.equals("U"))
					emptyString += "Help! ";

				else if (ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5") || ch.equals("6") || ch.equals("7") || ch.equals("8") || ch.equals("9"))
					emptyString += "Yes! ";

				else
					emptyString += "";
			}
			System.out.println(emptyString.trim());
			in.close();
		}
	}
}



