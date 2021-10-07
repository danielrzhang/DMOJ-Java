package coci;
import java.util.Scanner;
public class coci06contest21 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNumber = in.nextInt();
		int secondNumber = in.nextInt();

		int result = secondNumber * 2 - firstNumber;
		System.out.println(result);
		in.close();

	}
}

