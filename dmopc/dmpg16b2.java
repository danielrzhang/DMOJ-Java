package dmopc;
import java.util.*;
public class dmpg16b2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int times = in.nextInt();
			int minimum = in.nextInt();
			int counter = 0;
			for (int j = 0; j < times - 1; j++) {
				int competitors = in.nextInt();
				if (competitors > minimum) { 
					counter++;
				}
			}
			double result = Math.round((Math.sqrt(times - counter) * 100) * 100) / 100.0;
			System.out.printf("Bob wins $%.2f at IOI!%n", result);
		}
		in.close();
	}
}