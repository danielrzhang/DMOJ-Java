package other;
import java.util.Arrays;
import java.util.Scanner;
public class ListMinimum {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int [] emptyArray = new int [n];

		for (int i = 0; i < n; i++) {
			emptyArray[i] = in.nextInt();
		}
		Arrays.sort(emptyArray);

		for (int i = 0; i < n; i++) {
			System.out.println(emptyArray[i]);
		}
		in.close();

	}
}
