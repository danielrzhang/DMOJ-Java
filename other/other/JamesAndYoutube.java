package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JamesAndYoutube {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(in.readLine());
		
		int[] start = new int[m];
		int[] end = new int[m];
		
		String[] input;
		for (int i = 0; i < m; i++) {
			input = in.readLine().split(" ");
			start[i] = Integer.parseInt(input[0]);
			end[i] = Integer.parseInt(input[1]);
		}
		
		int n = Integer.parseInt(in.readLine());
		
		int startMin, endMin;
		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			startMin = Integer.parseInt(input[0]);
			endMin = Integer.parseInt(input[1]);
			
			for (int j = 0; j < m; j++) {
				if (start[j] >= startMin || endMin >= end[j]) {
					System.out.println("Break is Over! Stop playing games! Stop watching Youtube!");
					break;
				} 
				
				if (j == m - 1) {
					System.out.println(":eyy:");
				}
			}
		}
	}
}
