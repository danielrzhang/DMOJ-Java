package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddReversedNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String[] input;
		String a, b, newC;
		int newA, newB, c;
		StringBuilder stringA, stringB, stringC;
		
		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			a = input[0].replaceAll("0*$", "").replaceAll("\\.$", "");
			b = input[1].replaceAll("0*$", "").replaceAll("\\.$", "");
			stringA = new StringBuilder();
			stringB = new StringBuilder();
			a = stringA.append(a).reverse().toString();
			b = stringB.append(b).reverse().toString();
			newA = Integer.parseInt(a);
			newB = Integer.parseInt(b);
			
			c = newA + newB;
			newC = Integer.toString(c);
			newC = newC.replaceAll("0*$", "").replaceAll("\\.$", "");
			stringC = new StringBuilder();
			newC = stringC.append(newC).reverse().toString();
			System.out.println(newC);
		}
	}
}
