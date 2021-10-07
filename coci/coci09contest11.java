package coci;
import java.util.Scanner;
public class coci09contest11 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		String scales = in.nextLine();
		String result;
		if (scales.equals("1 2 3 4 5 6 7 8")) {
			result = "ascending";
		}

		else if (scales.equals("8 7 6 5 4 3 2 1")) {
			result = "descending";
		}

		else {
			result = "mixed";
		}
		System.out.println(result);
		in.close();

	}
}