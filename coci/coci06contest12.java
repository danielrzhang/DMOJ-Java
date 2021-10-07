package coci;
import java.util.Scanner;
public class coci06contest12 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int radius = in.nextInt();
		double pi = Math.PI;

		double realArea = Math.pow(radius, 2) * pi;
		double euclideanArea = Math.pow(radius, 2) * 2;

		System.out.printf("%.6f" ,realArea);
		System.out.printf("\n%.6f", euclideanArea);
		System.out.println();
		in.close();

	}
}