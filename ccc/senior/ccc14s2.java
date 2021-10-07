package ccc.senior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc14s2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(in.readLine());

		String[] array1 = in.readLine().split(" ");
		String[] array2 = in.readLine().split(" ");

		boolean isGood = true;
		boolean isMatched;
		for (int i = 0; i < array1.length; i++) {
			isMatched = true;

			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					if (array1[j].equals(array2[i]) && !(array1[i].equals(array2[i]) || array1[j].equals(array2[j]))) {
						isMatched = true;
					} else {
						isMatched = false;
						break;
					}
				} 
			}

			if (!isMatched) {
				isGood = false;
				break;
			}
		}

		if (isGood) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}

}
