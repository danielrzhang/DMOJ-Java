package mockccc;
import java.util.Scanner;
public class mockccc20contest1j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int thirdNum = in.nextInt();
		int fourthNum = in.nextInt();

		System.out.println(Math.min(Math.min(firstNum, secondNum), Math.min(thirdNum, fourthNum)));
		System.out.println(Math.max(Math.max(firstNum, secondNum), Math.max(thirdNum, fourthNum)));
		in.close();

	}
}