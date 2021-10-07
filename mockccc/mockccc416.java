package mockccc;
import java.util.Scanner;
public class mockccc416 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String [] numbers = (in.nextLine()).split(" ");
		if (numbers[1].length() == 7) {
			if (numbers[0].equals("416"))
				System.out.println("valuable");
			else if (numbers[0].equals("437") || numbers[0].equals("647"))
				System.out.println("valueless");
			else
				System.out.println("invalid");
		}
		else
			System.out.println("invalid");
		in.close();

	}
}