package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookMultiple {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int first = Integer.parseInt(in.readLine());
		int second = Integer.parseInt(in.readLine());

		if (first % second == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
