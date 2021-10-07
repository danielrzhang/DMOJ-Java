package other;
import java.util.Scanner;
public class backtoschool17avalon {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		double r = 1;

		for (int i = 0; i < n; i++) {
			double a = in.nextInt();
			double b = in.nextInt();
			r *= (b - a) / b;
		}

		System.out.printf("%.6f%n", r);
		in.close();
	}
}


