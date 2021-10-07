package dmopc;
import java.util.Scanner;
public class dmpg18b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int pproni = in.nextInt();
		int cheese = in.nextInt();
		int veggie = in.nextInt();

		int numPproni =  (int) Math.ceil(pproni / 3.0);
		int numCheese =  (int) Math.ceil(cheese / 3.0);
		int numVeggie =  (int) Math.ceil(veggie / 3.0);

		System.out.println(numPproni + numCheese + numVeggie);
		in.close();

	}
}
