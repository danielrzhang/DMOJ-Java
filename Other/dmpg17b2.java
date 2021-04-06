import java.util.Scanner;
public class dmpg17b2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String yodaSpeak = in.nextLine();
		String secondPart = "";
		String solution = "";

		String trimmedYodaSpeak = yodaSpeak.substring(0, yodaSpeak.length() - 1);
		String punctuation = yodaSpeak.substring(yodaSpeak.length() - 1);

		String [] yodaTalk = trimmedYodaSpeak.split(",");
		String firstPart = yodaTalk[0].trim().toLowerCase();

		try {
			secondPart = yodaTalk[1].trim();
			solution = secondPart.substring(0, 1).toUpperCase() + secondPart.substring(1) + " " + firstPart + punctuation;
		} catch (ArrayIndexOutOfBoundsException ae) {
			secondPart = "";
			solution = firstPart.substring(0, 1).toUpperCase() + firstPart.substring(1) + punctuation;
		}



		System.out.println(solution.trim());
		in.close();


	}
}
