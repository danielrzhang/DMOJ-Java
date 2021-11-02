package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FizzCoke {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		
		ArrayList<NumberWord> list = new ArrayList<NumberWord>();
		
		String[] input1;
		for (int i = 0; i < m; i++) {
			input1 = in.readLine().split(" ");
			
			list.add(new NumberWord(Integer.parseInt(input1[0]), input1[1]));
		}
		Collections.sort(list);
		
		String line;
		for (int i = 1; i <= n; i++) {
			line = "";
			for (int j = 0; j < list.size(); j++) {
				if (i % list.get(j).number == 0) {
					line += list.get(j).word;
				}
			}
			
			if (line.equals("")) {
				System.out.println(i);
			} else {
				System.out.println(line);
			}
		}
	}
}

class NumberWord implements Comparable<NumberWord> {
	int number;
	String word;
	
	public NumberWord(int number, String word) {
		this.number = number;
		this.word = word;
	}

	@Override
	public int compareTo(NumberWord n) {
		return this.number - n.number;
	}
}
