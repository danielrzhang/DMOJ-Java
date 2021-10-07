package coci;
import java.util.Scanner;
public class coci08contest61 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		long firstNum = in.nextLong();
		char character = in.next().charAt(0);
		long secondNum = in.nextLong();
		long result = 0;

		if (character == '+') {
			result = firstNum + secondNum;
		}

		else if (character == '*') {
			result = firstNum * secondNum;
		}

		System.out.println(result);
		in.close();

	}
}
