package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookPowersOf2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int total = 0;

		while (n > (int) (Math.pow(2, total))) {
			total++;
		}
		System.out.println(total);
	}
}