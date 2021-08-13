import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkeyShopping {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		int num3 = Integer.parseInt(input[2]);
		int num4 = Integer.parseInt(input[3]);
		
		if (num1 >= num2 && num3 >= num4) {
			System.out.println("Stay home");
		} else if (num1 < num2 && num3 >= num4) {
			System.out.println("Go to the grocery store");
		} else if (num1 >= num2 && num3 < num4) {
			System.out.println("Go to the pharmacy");
		} else {
			System.out.println("Go to the department store");
		}
		

	}

}
