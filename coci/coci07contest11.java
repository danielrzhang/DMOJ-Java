package coci;
import java.util.Scanner;
public class coci07contest11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstX = in.nextInt();
		int firstY = in.nextInt();
		int secondX = in.nextInt();
		int secondY = in.nextInt();
		int thirdX = in.nextInt();
		int thirdY = in.nextInt();
		int fourthX = -1;
		int fourthY = -1;

		if (firstX == secondX)
			fourthX = thirdX;

		else if (secondX == thirdX)
			fourthX = firstX;

		else if (firstX == thirdX)
			fourthX = secondX;

		if (firstY == secondY)
			fourthY = thirdY;

		else if (secondY == thirdY)
			fourthY = firstY;

		else if (firstY == thirdY)
			fourthY = secondY;

		System.out.println(fourthX + " " + fourthY);
		in.close();

	}
}

