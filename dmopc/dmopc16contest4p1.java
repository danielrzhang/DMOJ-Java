package dmopc;
import java.util.Scanner;
public class dmopc16contest4p1 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			long number = in.nextInt();
			char status = ' ';
			boolean running = true;
			while (running) {
				if (number == 1) {
					status = 'T';
					running = false;
				}

				else if (number % 2 == 0) {
					number /= 2;
				}

				else {
					status = 'F';
					running = false;
				}
			}

			System.out.println(status);
		}
		in.close();

	}
}


