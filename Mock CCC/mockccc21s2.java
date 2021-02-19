import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mockccc21s2 {

	private static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		findValidSubsequences(str, "");

		String element;

		for (int i = 0; i < list.size(); i++) {
			element = list.get(i);
			if (checkHasDuplicate(element)) {
				list.remove(element);
				i--;
			}
		}
		System.out.println(list.size() % (int) (Math.pow(10, 9) + 7));
	}

	public static void findValidSubsequences(String str, String subSequence) {
		if (str.length() == 0) {
			if (!list.contains(subSequence)) {
				list.add(subSequence);
			}
			return;
		} else {
			findValidSubsequences(str.substring(1), subSequence + str.charAt(0));
			findValidSubsequences(str.substring(1), subSequence);
		}
	}

	public static boolean checkHasDuplicate(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
