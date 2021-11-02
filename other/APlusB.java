package other;
import java.util.Scanner;

public class APlusB {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		for (int i = 0; i < number; i++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			System.out.println(num1 + num2);
		}
		in.close();
	}
}