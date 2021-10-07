package dmopc;
import java.util.Scanner;
public class dmopc14contest1p3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n1 = in.nextInt();
		int subtotal = 0;

		for (int i = 0; i < n1; i++) {
			int number = in.nextInt();
			subtotal += number;
		}

		int n3 = in.nextInt();

		for (int j = 1; j <= n3; j++) {
			int transfer = in.nextInt();
			subtotal += transfer;
			double result = subtotal / ((n1 + j) * 1.0);
			System.out.printf("%.3f%n", result);
		}
		in.close();
	}
}

