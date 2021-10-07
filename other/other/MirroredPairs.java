package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MirroredPairs {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ready");

		String input = in.readLine();
		String[] list = new String[] {"qp", "db", "pq", "bd"};
		List<String> pairs = Arrays.asList(list);

		while (!input.equals("  ")) {
			if (pairs.contains(input)) {
				System.out.println("Mirrored Pair");
			} else  {
				System.out.println("Ordinary Pair");
			}
			input = in.readLine();
		}
	}
}
