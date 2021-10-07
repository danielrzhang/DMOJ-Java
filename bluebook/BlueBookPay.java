package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookPay {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		double pay;
		int hours;
		char tax;
		char donate;
		int overTimeHours;
		double finalPay;
		double beforeTax;

		for (int i = 0; i < n; i++) {
			pay = Double.parseDouble(in.readLine());
			hours = Integer.parseInt(in.readLine());
			tax = in.readLine().charAt(0);
			donate = in.readLine().charAt(0);
			if (i != n - 1) {
				in.readLine();
			}

			if (hours > 40) {
				overTimeHours = hours - 40;
				hours = 40;
			}
			else {
				overTimeHours = 0;
			}
			beforeTax = pay * hours + overTimeHours * pay * 2;

			if (tax == 'A') {
				finalPay = beforeTax;
			}
			else if (tax == 'B') {
				finalPay = beforeTax * 0.9;
			}
			else if (tax == 'C') {
				finalPay = beforeTax * 0.8;
			}
			else if (tax == 'D') {
				finalPay = beforeTax * 0.71;
			}
			else {
				finalPay = beforeTax * 0.65;
			}

			if (donate == 'y') {
				finalPay -= 10;
			}
			System.out.printf("%.2f%n", finalPay);
		}
	}
}