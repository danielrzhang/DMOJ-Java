package mockccc;
import java.util.Scanner;

public class mockccc19contest2j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;

		for (int i = 0; i < 5; i++) {
			String tapioca = in.nextLine();
			if (tapioca.equals("P")) {
				counter++;
			}
		}
		System.out.println(Integer.toString(counter));
		in.close();

	}
}