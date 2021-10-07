package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TheReturnOfAPlusB {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		HashMap<String, Integer> numbers = new HashMap<String, Integer>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		numbers.put("five", 5);
		numbers.put("six", 6);
		numbers.put("seven", 7);
		numbers.put("eight", 8);
		numbers.put("nine", 9);
		numbers.put("ten", 10);
		
		numbers.put("un", 1);
	    numbers.put("deux", 2);
	    numbers.put("trois", 3);
	    numbers.put("quatre", 4);
	    numbers.put("cinq", 5);
	    numbers.put("six", 6);
	    numbers.put("sept", 7);
	    numbers.put("huit", 8);
	    numbers.put("neuf", 9);
	    numbers.put("dix", 10);
	    
	    numbers.put("一", 1);
	    numbers.put("二", 2);
	    numbers.put("三", 3);
	    numbers.put("四", 4);
	    numbers.put("五", 5);
	    numbers.put("六", 6);
	    numbers.put("七", 7);
	    numbers.put("八", 8);
	    numbers.put("�?", 9);
	    numbers.put("�??", 10);
	    	    
		String[] input;
		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			try {
				System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
			} catch (Exception e) {
				System.out.println(numbers.get(input[0]) + numbers.get(input[1]));
			}
		}
	}
}