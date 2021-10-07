package bluebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookFirstBlank {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String str;
		int index;

		for (int i = 0; i < n; i++) {
			index = 0;
			str = in.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ') {
					index = j + 1;
					break;
				}
			}
			System.out.println(index);
		}
	}

}
