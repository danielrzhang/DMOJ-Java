package dmopc;
import java.util.Scanner;

public class dmopc14contest6p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int radius = in.nextInt();
		int height = in.nextInt();

		double equation = (Math.PI * Math.pow(radius, 2) * height) / 3;

		double multiply = Math.round(equation * 100);

		double result = multiply / 100;

		System.out.println(result);
		in.close();

	}
}