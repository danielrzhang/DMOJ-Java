import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CounterfeitDeduction {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
		String str = in.readLine();
		int counter = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == '2') {
				if (str.charAt(i + 1) != '5') {
					counter++;
				} else {
					i++;
				}
			}
		}
		
		if (str.charAt(str.length() - 1) == '2') {
			counter++;
		}
		System.out.println(counter);
	}

}
