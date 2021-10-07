package dmopc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc19contest7p0 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		double first = Double.parseDouble(input[0]);
		double second = Double.parseDouble(input[1]);
		double third = Double.parseDouble(input[2]);
		double fourth = Double.parseDouble(input[3]);

		System.out.printf("%.6f%n", (first + second) / 2);
		System.out.printf("%.6f%n", (first + third) / 2);
		System.out.printf("%.6f%n", (first + fourth) / 2);
		System.out.printf("%.6f%n", (second + third) / 2);
		System.out.printf("%.6f%n", (second + fourth) / 2);
		System.out.printf("%.6f%n", (third + fourth) / 2);
		System.out.printf("%.6f%n", (first + second + third) / 3);
		System.out.printf("%.6f%n", (first + second + fourth) / 3);
		System.out.printf("%.6f%n", (first + third + fourth) / 3);
		System.out.printf("%.6f%n", (second + third + fourth) / 3);
		System.out.printf("%.6f%n", (first + second + third + fourth) / 4);
	}
}