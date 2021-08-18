import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BluebookMode {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(in.readLine());
		HashMap<Integer, Integer> mode = new HashMap<Integer, Integer>();
		ArrayList<Integer> highest = new ArrayList<Integer>();
		
		while (input != -1) {
			if (mode.get(input) == null) {
				mode.put(input, 1);
			} else {
				mode.put(input, mode.get(input) + 1);
			}
			input = Integer.parseInt(in.readLine());
		}
		
		int maxMode = 0;
		for (Integer key: mode.keySet()) {
			if (mode.get(key) > maxMode) {
				maxMode = mode.get(key);
			}
		}
		
		for (Integer key: mode.keySet()) {
			if (mode.get(key) == maxMode) {
				highest.add(key);
			}
		}
		
		Collections.sort(highest);
		
		for (Integer n: highest) {
			System.out.println(n);
		}
	}
}
