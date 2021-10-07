package dmopc;
import java.util.Scanner;
public class dmopc14examtimep1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String verb = in.nextLine();
		String noun = in.nextLine();

		char nounLetter = noun.charAt(noun.length() - 1);
		String result;

		if (nounLetter == 'e')
			result = "la";

		else if (nounLetter == 's')
			result = "les";

		else
			result = "le";

		System.out.println(verb + "-tu " + result + " " + noun + " ?");

		in.close();

	}
}
