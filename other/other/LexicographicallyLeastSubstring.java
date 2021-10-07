package other;
import java.util.Scanner;
public class LexicographicallyLeastSubstring {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String sentence = in.nextLine();
		int number = in.nextInt();
		String result = "{";

		for (int i = number; i < sentence.length(); i++) {
			String substr = sentence.substring(i - number, i);
			if (result.compareTo(substr) > 0) {
				result = substr;
			}
		}
		System.out.println(result);
		in.close();

	}
}
