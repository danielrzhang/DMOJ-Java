package mockccc;
import java.util.Scanner;

public class mockccc19contest1j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dig1 = in.nextInt();
		int dig2 = in.nextInt();

		if (dig1 > dig2) {
			System.out.println("CS452");
		}

		else if (dig2 > dig1) {
			System.out.println("PHIL145");
		}

		else {
		}
		in.close();

	}
}