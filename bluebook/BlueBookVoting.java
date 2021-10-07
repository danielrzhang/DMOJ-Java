package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookVoting {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String vote;
		int aCounter, bCounter, cCounter, dCounter, eCounter, fCounter, spoilCounter;
		aCounter = bCounter = cCounter = dCounter = eCounter = fCounter = spoilCounter = 0;

		for (int i = 0; i < n; i++) {
			vote = in.readLine();
			if (vote.equals("A")) {
				aCounter++;
			}
			else if (vote.equals("B")) {
				bCounter++;
			}
			else if (vote.equals("C")) {
				cCounter++;
			}
			else if (vote.equals("D")) {
				dCounter++;
			}
			else if (vote.equals("E")) {
				eCounter++;
			}
			else if (vote.equals("F")) {
				fCounter++;
			}
			else {
				spoilCounter++;
			}
		}

		System.out.println(aCounter);
		System.out.println(bCounter);
		System.out.println(cCounter);
		System.out.println(dCounter);
		System.out.println(eCounter);
		System.out.println(fCounter);
		System.out.println(spoilCounter);
	}
}