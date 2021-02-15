import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookDigits {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] number;
		int digits;

		for (int i = 0; i < n; i++) {
			digits = 0;
			number = in.readLine().split("");
			for (int j = 0; j < number.length; j++) {
				if (!number[j].equals("-")) {
					digits++;
				}
			}
			System.out.println(digits);
		}
	}
}
