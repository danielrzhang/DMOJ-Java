package bluebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookChange {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int quarters = n / 25;
		int dimes = (n - (quarters * 25)) / 10;
		int nickels = (n - (quarters * 25) - (dimes * 10)) / 5;
		int pennies = n - (quarters * 25) - (dimes * 10) - (nickels * 5);
		String result = "";

		if (n == 1) {
			result += n + " cent requires ";
		} else {
			result += n + " cents requires ";
		}

		if (quarters == 1) {
			result += quarters + " quarter";
		}
		else if (quarters != 0) {
			result += quarters + " quarters";
		}

		if (dimes == 1) {
			if (quarters != 0) {
				result += ", ";
			}
			result += dimes + " dime";
		}
		else if (dimes != 0) {
			if (quarters != 0) {
				result += ", ";
			}
			result += dimes + " dimes";
		}

		if (nickels == 1) {
			if (dimes != 0 || quarters != 0) {
				result += ", ";
			}
			result += nickels + " nickel";
		}
		else if (nickels != 0) {
			if (dimes != 0 || quarters != 0) {
				result += ", ";
			}
			result += nickels + " nickels";
		}

		if (pennies == 1) {
			if (nickels != 0 || dimes != 0 || quarters != 0) {
				result += ", ";
			}
			result += pennies + " cent";
		}
		else if (pennies != 0) {
			if (nickels != 0 || dimes != 0 || quarters != 0) {
				result += ", ";
			}
			result += pennies + " cents";
		}
		System.out.println(result + ".");
	}
}