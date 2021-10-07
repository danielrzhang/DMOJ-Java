package other;
import java.util.Scanner;

public class CodeFights {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = in.nextInt();
		int time = in.nextInt();

		for (int i = 0; i <= time - 1; i++) {
			int currentScore = in.nextInt();
			int difference1 = currentScore - min;

			if (difference1 <= 100 && difference1 >= -100) {
				System.out.println("fite me! >:3");
			}

			else {
				System.out.println("go away! 3:<");
			}
		}
		in.close();

	}
}