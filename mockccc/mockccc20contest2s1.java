package mockccc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class mockccc20contest2s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> sequence = new ArrayList<Integer>();
		String[] numbers = in.readLine().split(" ");

		for (String nums: numbers) {
			sequence.add(Integer.parseInt(nums));
		}
		Collections.sort(sequence);

		for (int i = 0; i < sequence.size(); i++) {
			if (i == sequence.size() - 1) {
				System.out.println(sequence.get(i));
			}
			else {
				System.out.print(sequence.get(i) + " ");
			}
		}
	}
}