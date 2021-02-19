import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class mockccc21s1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String alphabet = in.readLine();
		String str = in.readLine();
		ArrayList<String> wordList = new ArrayList<String>();

		String addString, changeString, removeString;
		for (int i = 0; i < alphabet.length(); i++) {
			addString = "";
			changeString = "";
			removeString = "";

			for (int j = 0; j <= str.length(); j++) {
				addString = str.substring(0, j) + alphabet.charAt(i) + str.substring(j);
				if (!wordList.contains(addString)) {
					wordList.add(addString);
				}
			}

			for (int j = 0; j < str.length(); j++) {
				changeString = str.substring(0, j) + alphabet.charAt(i) + str.substring(j + 1);
				removeString = str.substring(0, j) + str.substring(j + 1);

				if (!wordList.contains(changeString) && !changeString.equals(str)) {
					wordList.add(changeString);
				}

				if (!wordList.contains(removeString)) {
					wordList.add(removeString);
				}
			}
		}
		Collections.sort(wordList);
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
	}
}
