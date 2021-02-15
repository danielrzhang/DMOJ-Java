import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheOddNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int n = Integer.parseInt(in.readLine());
		int number;
		boolean justAdded;

		for (int i = 0; i < n; i++) {
			number = Integer.parseInt(in.readLine());
			justAdded = false;

			if (numbers.size() == 0) {
				numbers.add(number);
				justAdded = true;
			}

			for (int j = 0; j < numbers.size(); j++) {
				if (number == numbers.get(j) && !justAdded) {
					numbers.remove(j);
				} else if (number == numbers.get(j) && justAdded) {
					continue;
				} else {
					numbers.add(number);
				}
			}
		}
		System.out.println(numbers.get(0));
	}
}
