package coci;
import java.util.Scanner;
public class coci07contest52 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int counter = 0;
		for (int i = n - 1; i > 1; i--) {
			counter++;
			if (n % i == 0) {
				break;
			}
		}

		System.out.println(counter);
		in.close();

	}
}

