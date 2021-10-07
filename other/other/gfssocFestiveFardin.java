package other;
import java.util.Scanner;

public class gfssocFestiveFardin{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String first = in.nextLine();
		String second = in.nextLine();

		if ((first.equals("red") || first.equals("green") || first.equals("white")) && (second.equals("red") || second.equals("green") || second.equals("white"))) {
			System.out.println("Jingle Bells");
		}

		else {
			System.out.println("Boring...");
		}
		in.close();

	}
}