import java.util.Scanner;
public class dmpg16b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int nickel = in.nextInt();
		int dime = in.nextInt();
		int quarter = in.nextInt();
		int loonie = in.nextInt();
		int toonie = in.nextInt();

		int result = nickel * 5 + dime * 10 + quarter * 25 + loonie * 100 + toonie * 200;
		System.out.println(result);
		in.close();

	}
}