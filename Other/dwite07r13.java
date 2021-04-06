import java.util.Scanner;
public class dwite07r13 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String dvorak = "~!@#$%^&*(){}`1234567890[]\"<>PYFGCRL?+|\',.pyfgcrl/=\\AOEUIDHTNS_aoeuidhtns-:QJKXBMWVZ;qjkxbmwvz ";
		String qwerty = "~!@#$%^&*()_+`1234567890-=QWERTYUIOP{}|qwertyuiop[]\\ASDFGHJKL:\"asdfghjkl;\'ZXCVBNM<>?zxcvbnm,./ ";

		String input = in.nextLine();
		String emptyString = "";

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < dvorak.length(); j++) {
				char inputLetter = input.charAt(i);
				char dvorakLetter = dvorak.charAt(j);

				if (inputLetter == dvorakLetter) {
					emptyString += Character.toString(qwerty.charAt(j));
				}
			}

		}

		System.out.println(emptyString);
		in.close();
	}
}