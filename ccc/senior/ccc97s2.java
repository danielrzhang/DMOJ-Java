package ccc.senior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ccc97s2 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		
		int number;
		ArrayList<Integer> firstFactors;
		ArrayList<Integer> secondFactors;
		boolean isNasty;
		
		for (int i = 0; i < n; i++) {
			number = Integer.parseInt(in.readLine());
			firstFactors = new ArrayList<Integer>();
			secondFactors = new ArrayList<Integer>();
			isNasty = false;
			
			for (int j = 1; j <= Math.sqrt(number); j++) {
				if (number % j == 0) {
					firstFactors.add(j);
					secondFactors.add(number / j);
				}
			}
			
			for (int j = 0; j < firstFactors.size() - 1; j++) {
				for (int k = j + 1; k < firstFactors.size(); k++) {
					if ((firstFactors.get(j) - secondFactors.get(j) == firstFactors.get(k) + secondFactors.get(k)) || 
							(firstFactors.get(j) + secondFactors.get(j) == firstFactors.get(k) - secondFactors.get(k)) ||
							(secondFactors.get(j) - firstFactors.get(j) == secondFactors.get(k) + firstFactors.get(k)) ||
							(secondFactors.get(j) + firstFactors.get(j) == secondFactors.get(k) - firstFactors.get(k)))	{
						isNasty = true;
						break;
					}
				}
				
				if (isNasty) {
					break;
				}
			}
			
			if (isNasty) {
				System.out.println(number + " is nasty");
			} else {
				System.out.println(number + " is not nasty");
			}
		}
	}
	
	public static String readLine() throws IOException {
		return in.readLine();
	}
	
	public static int readInt() throws IOException {
		return Integer.parseInt(readLine());
	}
	
	public static long readLong() throws IOException {
		return Long.parseLong(readLine());

	}
	public static double readDouble() throws IOException {
		return Double.parseDouble(readLine());
	}
	
	public static char readCharacter() throws IOException {
		return readLine().charAt(0);
	}
	
	public static String[] readSpaceInput() throws IOException {
		return in.readLine().split(" ");
	}
}
