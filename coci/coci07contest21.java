package coci;
import java.util.Scanner;
public class coci07contest21 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int king = 1 - in.nextInt();
		int queen = 1 - in.nextInt();
		int rook = 2 - in.nextInt();
		int bishop = 2 - in.nextInt();
		int knight = 2 - in.nextInt();
		int pawn = 8 - in.nextInt();

		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
		in.close();

	}
}

