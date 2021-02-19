import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordBot {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);
		int v = Integer.parseInt(input[2]);
		String word = in.readLine().toLowerCase();
		boolean isWord = true;

		int cCounter = 0;
		int vCounter = 0;

		for (int i = 0; i < n; i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				vCounter++;
				cCounter = 0;
			} else if (word.charAt(i) != 'y') {
				cCounter++;
				vCounter = 0;
			} else {
				vCounter++;
				cCounter++;
			}

			if (vCounter > v || cCounter > c) {
				isWord = false;
				break;
			}
		}

		if (isWord) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
