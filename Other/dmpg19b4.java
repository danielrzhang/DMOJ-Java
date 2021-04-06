import java.util.Scanner;
public class dmpg19b4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String phrase = in.nextLine();

		String firstRow = "";
		String secondRow = "";
		String thirdRow = "";

		String [] row1 = {"o.", "o.", "oo", "oo", "o.", "oo", "oo", "o.", ".o", ".o", "o.", "o.", "oo", "oo", "o.", "oo", "oo", "o.", ".o", ".o", "o.", "o.", ".o", "oo", "oo", "o.", ".."};
		String [] row2 = {"..", "o.", "..", ".o", ".o", "o.", "oo", "oo", "o.", "oo", "..", "o.", "..", ".o", ".o", "o.", "oo", "oo", "o.", "oo", "..", "o.", "oo", "..", ".o", ".o", ".."};
		String [] row3 = {"..", "..", "..", "..", "..", "..", "..", "..", "..", "..", "o.", "o.", "o.", "o.", "o.", "o.", "o.", "o.", "o.", "o.", "oo", "oo", ".o", "oo", "oo", "oo", ".."};

		for (int i = 0; i < phrase.length(); i++) {
			char ch = phrase.charAt(i);

			if (ch == 'A') {
				firstRow += row1[0];
				secondRow += row2[0];
				thirdRow += row3[0];
			}

			else if (ch == 'B') {
				firstRow += row1[1];
				secondRow += row2[1];
				thirdRow += row3[1];
			}

			else if (ch == 'C') {
				firstRow += row1[2];
				secondRow += row2[2];
				thirdRow += row3[2];
			}

			else if (ch == 'D') {
				firstRow += row1[3];
				secondRow += row2[3];
				thirdRow += row3[3];
			}

			else if (ch == 'E') {
				firstRow += row1[4];
				secondRow += row2[4];
				thirdRow += row3[4];
			}

			else if (ch == 'F') {
				firstRow += row1[5];
				secondRow += row2[5];
				thirdRow += row3[5];
			}

			else if (ch == 'G') {
				firstRow += row1[6];
				secondRow += row2[6];
				thirdRow += row3[6];
			}

			else if (ch == 'H') {
				firstRow += row1[7];
				secondRow += row2[7];
				thirdRow += row3[7];
			}

			else if (ch == 'I') {
				firstRow += row1[8];
				secondRow += row2[8];
				thirdRow += row3[8];
			}

			else if (ch == 'J') {
				firstRow += row1[9];
				secondRow += row2[9];
				thirdRow += row3[9];
			}

			else if (ch == 'K') {
				firstRow += row1[10];
				secondRow += row2[10];
				thirdRow += row3[10];
			}

			else if (ch == 'L') {
				firstRow += row1[11];
				secondRow += row2[11];
				thirdRow += row3[11];
			}

			else if (ch == 'M') {
				firstRow += row1[12];
				secondRow += row2[12];
				thirdRow += row3[12];
			}

			else if (ch == 'N') {
				firstRow += row1[13];
				secondRow += row2[13];
				thirdRow += row3[13];
			}

			else if (ch == 'O') {
				firstRow += row1[14];
				secondRow += row2[14];
				thirdRow += row3[14];
			}

			else if (ch == 'P') {
				firstRow += row1[15];
				secondRow += row2[15];
				thirdRow += row3[15];
			}

			else if (ch == 'Q') {
				firstRow += row1[16];
				secondRow += row2[16];
				thirdRow += row3[16];
			}

			else if (ch == 'R') {
				firstRow += row1[17];
				secondRow += row2[17];
				thirdRow += row3[17];
			}

			else if (ch == 'S') {
				firstRow += row1[18];
				secondRow += row2[18];
				thirdRow += row3[18];
			}

			else if (ch == 'T') {
				firstRow += row1[19];
				secondRow += row2[19];
				thirdRow += row3[19];
			}

			else if (ch == 'U') {
				firstRow += row1[20];
				secondRow += row2[20];
				thirdRow += row3[20];
			}

			else if (ch == 'V') {
				firstRow += row1[21];
				secondRow += row2[21];
				thirdRow += row3[21];
			}

			else if (ch == 'W') {
				firstRow += row1[22];
				secondRow += row2[22];
				thirdRow += row3[22];
			}

			else if (ch == 'X') {
				firstRow += row1[23];
				secondRow += row2[23];
				thirdRow += row3[23];
			}

			else if (ch == 'Y') {
				firstRow += row1[24];
				secondRow += row2[24];
				thirdRow += row3[24];
			}

			else if (ch == 'Z') {
				firstRow += row1[25];
				secondRow += row2[25];
				thirdRow += row3[25];
			}

			else if (ch == ' ') {
				firstRow += row1[26];
				secondRow += row2[26];
				thirdRow += row3[26];
			}
		}
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println(thirdRow);
		in.close();

	}
}