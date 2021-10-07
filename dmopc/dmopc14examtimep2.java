package dmopc;
import java.util.Scanner;
public class dmopc14examtimep2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		double h = 0;
		int total;

		for (int i = 0; i < number; i++) {
			int s = in.nextInt();
			double x = Math.sin(in.nextInt() * Math.PI / 180);
			double t = in.nextDouble();

			double result = t * s * x;
			h += result;
		}
		total = (int) Math.round(Math.sqrt(2 * 9.8 * h));

		System.out.println(total);
		in.close();

	}
}
