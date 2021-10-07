package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VasileAndHaircuts {
	public static void main(String[] args) throws IOException {
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] input;
		int initial;
		int min;
		int max;
		int desire;

		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			initial = Integer.parseInt(input[0]);
			min = Integer.parseInt(input[1]);
			max = Integer.parseInt(input[2]);
			desire = Integer.parseInt(input[3]);
			if (initial - max <= desire && initial - min >= desire) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}