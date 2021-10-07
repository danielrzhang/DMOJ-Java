package coci;
import java.util.Scanner;
public class coci14contest31 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int qCounter = 0;
		int wCounter = 0;
		int eCounter = 0;
		int rtCounter = 0;
		int yuCounter = 0;
		int iCounter = 0;
		int oCounter = 0;
		int pCounter = 0;

		String type = in.nextLine();
		char [] list = type.toCharArray();

		for (int i = 0; i < list.length; i++) {
			int n = list[i];
			if (n == 49 || n == 81 || n == 65 || n == 90)
				qCounter++;

			else if (n == 50 || n == 87 || n == 83 || n == 88)
				wCounter++;

			else if (n == 51 || n == 69 || n == 67 || n == 68)
				eCounter++;

			else if (n == 52 || n == 53 || n == 82 || n == 84 || n == 70 || n == 71 || n == 86 || n == 66)
				rtCounter++;

			else if (n == 54 || n == 55 || n == 89 || n == 85 || n == 72 || n == 74 || n == 77 || n == 78)
				yuCounter++;

			else if (n == 56 || n == 73 || n == 75 || n == 44)
				iCounter++;

			else if (n == 78 || n == 79 || n == 76 || n == 46)
				oCounter++;

			else if (n == 48 || n == 80 || n == 59 || n == 47 || n == 45 || n == 61 || n == 91 || n == 93 || n == 39)
				pCounter++;
		}

		System.out.println(qCounter);
		System.out.println(wCounter);
		System.out.println(eCounter);
		System.out.println(rtCounter);
		System.out.println(yuCounter);
		System.out.println(iCounter);
		System.out.println(oCounter);
		System.out.println(pCounter);
		in.close();

	}
}