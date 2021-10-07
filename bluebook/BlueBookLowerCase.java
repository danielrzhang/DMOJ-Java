package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookLowerCase {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String line;

		for (int i = 0; i < n; i++) {
			line = in.readLine().toLowerCase();
			System.out.println(line);
		}
	}
}