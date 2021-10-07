package dmopc;
import java.util.Scanner;

public class dmopc16contest1p0 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int width = in.nextInt();
		int cheesy = in.nextInt();
		String result;

		if (width == 3 && cheesy >= 95) {
			result = "absolutely";
		}

		else if (width == 1 && cheesy <= 50) {
			result = "fairly";
		}

		else {
			result = "very";
		}
		System.out.println("C.C. is " + result + " satisfied with her pizza.");
		in.close();

	}
}