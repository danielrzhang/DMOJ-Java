package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCCCodingCompetition20P1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String str1 = in.readLine();
		String str2 = in.readLine();
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (str1.substring(i, i + 1).equals(str2.substring(i, i + 1)) && str1.substring(i, i + 1).equals("0")) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
