package dmopc;
import java.util.Scanner;
public class dmopc19contest1p0 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int minNum = 1000001;
		int maxNum = 0;

		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			if (number >= maxNum) {
				maxNum = number;
			}

			if (number <= minNum) {
				minNum = number;
			}
		}

		System.out.println(maxNum - minNum);
		in.close();

	}
}