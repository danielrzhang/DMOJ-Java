package ccc.junior;
import java.util.Scanner;

public class ccc14j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if (a + b + c == 180) {
			if (a == 60 && b == 60 && c == 60) {
				System.out.println("Equilateral");
			}
			else if (a == b || b == c || c == a) {
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalene");
			}
		}
		else {
			System.out.println("Error");
		}
		in.close();

	}
}