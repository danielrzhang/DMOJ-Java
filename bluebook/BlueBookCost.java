package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookCost {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int mass;
		int amount;
		double extra;

		for (int i = 0; i < n; i++) {
			mass = Integer.parseInt(in.readLine());
			if (mass <= 30) {
				amount = 38;
			}
			else if (mass <= 50) {
				amount = 55;
			}
			else if (mass <= 100) {
				amount = 73;
			}
			else {
				extra = (mass - 100) / 50.0;
				amount = 73 + (int) (Math.ceil(extra)) * 24;
			}
			System.out.println(amount);
		}
	}
}