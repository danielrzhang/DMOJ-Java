package other;
import java.util.Scanner;

public class valentinesday19j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		for (int i = 0; i < number; i++) {
			int rank = in.nextInt();
			if (rank < 1000) {
				System.out.println("Newbie");
			}

			else if (rank >= 1000 && rank <= 1199) {
				System.out.println("Amateur");
			}

			else if (rank >= 1200 && rank <= 1499) {
				System.out.println("Expert");
			}

			else if (rank >= 1500 && rank <= 1799) {
				System.out.println("Candidate Master");
			}

			else if (rank >= 1800 && rank <= 2199) {
				System.out.println("Master");
			}

			else if (rank >= 2200 && rank <= 2999) {
				System.out.println("Grandmaster");
			}

			else if (rank >= 3000 && rank <= 3999) {
				System.out.println("Target");
			}

			else {
				System.out.println("Rainbow Master");
			}
		}
		in.close();

	}
}