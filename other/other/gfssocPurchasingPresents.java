package other;
import java.util.Scanner;
public class gfssocPurchasingPresents {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int people = in.nextInt();
		double totalMoney = in.nextDouble();
		double start = 0.00;


		for (int i = 0; i < people; i++) {
			double thing = in.nextDouble();
			start += thing;
		}
		if (totalMoney >= start) {
			System.out.printf("%.2f", totalMoney - start);
			System.out.println();
		}

		else {
			System.out.println("Fardin's broke");
		}
		in.close();

	}
}