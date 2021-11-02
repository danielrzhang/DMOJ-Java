package other;
import java.util.Scanner;
public class CTUOpenContest2018Die {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String firstRow = in.nextLine();
		String secondRow = in.nextLine();
		String thirdRow = in.nextLine();

		if (firstRow.equals(":::") && secondRow.equals(":o:") && thirdRow.equals(":::")) {
			System.out.println(1);
		}

		else if ((firstRow.equals("o::") && secondRow.equals(":::") && thirdRow.equals("::o")) || (firstRow.equals("::o") && secondRow.equals(":::") && thirdRow.equals("o::"))) {
			System.out.println(2);
		}

		else if ((firstRow.equals("o::") && secondRow.equals(":o:") && thirdRow.equals("::o")) || (firstRow.equals("::o") && secondRow.equals(":o:") && thirdRow.equals("o::"))) {
			System.out.println(3);
		}

		else if (firstRow.equals("o:o") && secondRow.equals(":::") && thirdRow.equals("o:o")) {
			System.out.println(4);
		}

		else if (firstRow.equals("o:o") && secondRow.equals(":o:") && thirdRow.equals("o:o")) {
			System.out.println(5);
		}

		else if ((firstRow.equals("ooo") && secondRow.equals(":::") && thirdRow.equals("ooo")) || (firstRow.equals("o:o") && secondRow.equals("o:o") && thirdRow.equals("o:o"))) {
			System.out.println(6);
		}

		else {
			System.out.println("unknown");
		}
		in.close();

	}
}