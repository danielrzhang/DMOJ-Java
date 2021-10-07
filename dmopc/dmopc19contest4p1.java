package dmopc;
import java.util.Scanner;
public class dmopc19contest4p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();

		for (int i = 0; i < n; i++) {
			int openCounter = 0;
			int closedCounter = 0;

			String str = in.nextLine();

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == '(') {
					openCounter++;
				}

				if (ch == ')') {
					closedCounter++;
				}
			}

			if (openCounter == closedCounter)
				System.out.println("YES");

			else
				System.out.println("NO");
		}
		in.close();

	}
}
