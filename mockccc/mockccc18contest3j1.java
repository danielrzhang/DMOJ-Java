package mockccc;
import java.util.Scanner;
public class mockccc18contest3j1 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int counter = 0;
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			counter += number;
		}
		System.out.println(counter);
		in.close();

	}
}
