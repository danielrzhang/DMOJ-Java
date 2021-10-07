package mockccc;
import java.util.Scanner;
public class mockccc19contest1j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String pusheen = in.nextLine();
		int counter = 7;

		if (pusheen.charAt(0) == 'p') {
			counter--;
		}

		if (pusheen.charAt(1) == 'u') {
			counter--;
		}

		if (pusheen.charAt(2) == 's') {
			counter--;
		}

		if (pusheen.charAt(3) == 'h') {
			counter--;
		}

		if (pusheen.charAt(4) == 'e') {
			counter--;
		}

		if (pusheen.charAt(5) == 'e') {
			counter--;
		}

		if (pusheen.charAt(6) == 'n') {
			counter--;
		}

		System.out.println(counter);
		in.close();

	}
}


