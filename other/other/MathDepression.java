package other;
import java.util.Scanner;
public class MathDepression {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int firstNum = (n / 3);
		int secondNum = (n - firstNum) / 2;
		int thirdNum = n - firstNum - secondNum;

		System.out.println(firstNum + " " + secondNum + " " + thirdNum);
		in.close();

	}
}