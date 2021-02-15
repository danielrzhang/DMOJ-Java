import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		int l = Integer.parseInt(in.readLine());

		if (s + 2 * m + 3 * l < 10) {
			System.out.println("sad");
		} else {
			System.out.println("happy");
		}
	}

}
