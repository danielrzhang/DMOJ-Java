package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc12j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] strings = new String[] {"*x*", " xx", "* *"};

		int n = Integer.parseInt(in.readLine());

		String str;
		for (int i = 0; i < 3; i++) { // Iterate through array
			str = "";

			for (int j = 0; j < 3; j++) { // Iterate through characters
				for (int l = 0; l < n; l++) { 
					str += strings[i].charAt(j);
				}
			}
			
			for (int l = 0; l < n; l++) {
				System.out.println(str);
			}
		}
	}
}
