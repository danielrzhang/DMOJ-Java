package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc10j2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] n = new int[] {Integer.parseInt(in.readLine()), Integer.parseInt(in.readLine())};
		int[] b = new int[] {Integer.parseInt(in.readLine()), Integer.parseInt(in.readLine())};

		int totalSteps = Integer.parseInt(in.readLine());
		
//		System.out.println(n[0] + " " + n[1] + " " + b[0] + " " + b[1] + " " + totalSteps);

		boolean nRunning = true;
		boolean bRunning = true;

		int nDisplacement = 0;
		int bDisplacement = 0;

		int nCounter = 0;
		int bCounter = 0;

		int nState = 0;
		int bState = 0;

		while (nRunning) {
			if (nCounter + n[nState] <= totalSteps) {
				if (nState == 0) {
					nDisplacement += n[0];
				} else if (nState == 1) {
					nDisplacement -= n[1];
				}
			} else {
				if (nState == 0) {
					nDisplacement += (totalSteps - nCounter);
				} else if (nState == 1) {
					nDisplacement -= (totalSteps - nCounter);
				}
				nRunning = false;
			}
			nCounter += n[nState];
			nState = 1 - nState;
		}

		while (bRunning) {
			if (bCounter + b[bState] <= totalSteps) {
				if (bState == 0) {
					bDisplacement += b[0];
				} else if (bState == 1) {
					bDisplacement -= b[1];
				} 
			} else {
				if (bState == 0) {
					bDisplacement += (totalSteps - bCounter);
				} else if (bState == 1) {
					bDisplacement -= (totalSteps - bCounter);
				}
				bRunning = false;
			}
			bCounter += b[bState];
			bState = 1 - bState;
		}
		
//		System.out.println(nDisplacement + " " + bDisplacement);
		
		if (nDisplacement > bDisplacement) {
			System.out.println("Nikki");
		} else if (bDisplacement > nDisplacement) {
			System.out.println("Byron");
		} else {
			System.out.println("Tied");
		}
	}
}
