package mockccc;
import java.util.Scanner;
public class mockccc19contest1s1 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double n = in.nextInt() * 1.0;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			int mark = in.nextInt();
			counter += mark;
		}

		double finalMark = counter / n;
		System.out.printf("%.1f",finalMark);
		System.out.println();
		in.close();

	}
}