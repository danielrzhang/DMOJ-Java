package dmopc;
import java.util.Arrays;
import java.util.Scanner;
public class dmopc14contest1p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double n = in.nextInt();
		double [] list = new double [(int) n];

		for (int i = 0; i < n; i++) {
			double number = in.nextInt();
			list[i] = number;
		}
		Arrays.sort(list);

		double result = 0;
		if (n % 2 == 0) {
			for (int j = 0; j < n; j++) {
				result += list[j];
			}
			double median1 = list[(int) (n / 2)];
			double median2 = list[(int) (n / 2) - 1];
			result = (median1 + median2) / 2;
		}

		else {
			result = list[(int) (n / 2)];
		}
		System.out.println((int) (Math.round(result)));
		in.close();

	}
}
