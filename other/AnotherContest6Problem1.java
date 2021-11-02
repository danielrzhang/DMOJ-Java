package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherContest6Problem1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		String result = "";
		
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}
		
		System.out.println(result);
	}

}
