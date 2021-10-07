package dmopc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc17contest5p0 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int budget = Integer.parseInt(in.readLine());
		int pizzas = Integer.parseInt(in.readLine());
		String veg = in.readLine();

		if (pizzas * 5 <= budget) {
			if (veg.equals("N")) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		}

		else if (pizzas * 2 <= budget) {
			if (veg.equals("N")) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
		}

		else {
			System.out.println("NO PIZZA");
		}
	}
}