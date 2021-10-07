package dmopc;
import java.util.Scanner;
public class dmopc14contest3p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int start = in.nextInt();
		int multiply = in.nextInt();
		int days = in.nextInt();

		for (int i = 0; i < days; i++) {
			start *= multiply;
		}
		System.out.println(start);
		in.close();

	}
}