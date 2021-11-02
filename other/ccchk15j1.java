package other;
import java.util.Scanner;
public class ccchk15j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		String [] alice = (in.nextLine()).split(" ");
		String [] bob = (in.nextLine()).split(" ");

		int aliceCounter = 0;
		int bobCounter = 0;

		for (int i = 0; i < n; i++) {
			String aliceTurn = alice[i];
			String bobTurn = bob[i];

			if (aliceTurn.equals("rock") && bobTurn.equals("scissors"))
				aliceCounter++;
			else if (aliceTurn.equals("rock") && bobTurn.equals("paper"))
				bobCounter++;
			else if (aliceTurn.equals("paper") && bobTurn.equals("rock"))
				aliceCounter++;
			else if (aliceTurn.equals("paper") && bobTurn.equals("scissors"))
				bobCounter++;
			else if (aliceTurn.equals("scissors") && bobTurn.equals("rock"))
				bobCounter++;
			else if (aliceTurn.equals("scissors") && bobTurn.equals("paper"))
				aliceCounter++;
			else if (bobTurn.equals("rock") && aliceTurn.equals("scissors"))
				bobCounter++;
			else if (bobTurn.equals("rock") && aliceTurn.equals("paper"))
				aliceCounter++;
			else if (bobTurn.equals("paper") && aliceTurn.equals("rock"))
				bobCounter++;
			else if (bobTurn.equals("paper") && aliceTurn.equals("scissors"))
				aliceCounter++;
			else if (bobTurn.equals("scissors") && aliceTurn.equals("rock"))
				aliceCounter++;
			else if (bobTurn.equals("scissors") && aliceTurn.equals("paper"))
				bobCounter++;
		}
		System.out.println(aliceCounter + " " + bobCounter);
		in.close();

	}
}