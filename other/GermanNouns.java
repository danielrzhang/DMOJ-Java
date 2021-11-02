package other;
import java.util.Scanner;
public class GermanNouns {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			int counter = 0;
			String input = in.nextLine();
			String [] line = input.split(" ");
			for (int j = 0; j < line.length; j++) {
				if (0 <= line[j].compareTo("A") && line[j].compareTo("A") <= 26) {
					counter++;
				}
			}
			System.out.println(counter);
			in.close();

		}
	}
}