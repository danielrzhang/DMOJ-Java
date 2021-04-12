import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCCCodingCompetition20P2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String[] input;
		int minTime = Integer.MAX_VALUE;
		
		int counter;
		for (int i = 0; i < n; i++) {
			counter = 0;
			input = in.readLine().split(" ");
			
			for (int j = 1; j < input.length; j++) {
				counter += Integer.parseInt(input[j]);
			}
			
			if (counter < minTime) {
				minTime = counter;
			}
		}
		System.out.println(minTime);
	}

}
