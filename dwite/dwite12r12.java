package dwite;
import java.util.Scanner;
public class dwite12r12 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			double firstNum = in.nextDouble();
			double secondNum = in.nextDouble();

			double sum = firstNum + secondNum;

			double decimal = firstNum / sum;

			double result = decimal * 10;

			int stars = (int) Math.floor(result);

			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}

			for (int k = 0; k < 10 - stars; k++) {
				System.out.print(".");
			}
			System.out.println();
		}
		in.close();
	}
}

