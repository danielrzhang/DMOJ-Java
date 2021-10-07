package dmopc;
import java.util.Scanner;
public class dmopc19contest6p0 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int thirdNum = in.nextInt();

		if (firstNum + secondNum > thirdNum && secondNum + thirdNum > firstNum && thirdNum + firstNum > secondNum) {
			System.out.println("yes");
		}

		else {
			System.out.println("no");
		}
		in.close();

	}
}
