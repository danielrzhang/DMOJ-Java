import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HappyAlpacas {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);

		if (x == n - 1 || (n % 2 == 1 && x % 2 == 0) || x > n || (n % 2 == 0 && x % 2 == 1)) { // (Second-last number) or (odd number and 0) or (happy over total)
			System.out.println(-1);
		} 
		
		else if (x == n) { // Last
			for (int i = 0; i < n - 1; i++) {
				System.out.print(1 + " ");
			}
			System.out.print(1 + "\n");
		} 
		
		else if (n % 2 == 0 && x == 0) { // (Even number and 0)
			for (int i = 0; i < (n / 2) - 1; i++) {
				System.out.print(1 + " " + 0 + " ");
			}
			System.out.print(1 + " " + 0 + "\n");
		} 
		
		else if (x == 1) { // (Any number and 1)
			System.out.print("1 1 ");
			
			for (int i = 0; i < (n - x) - 2; i++) {
				System.out.print(0 + " ");
			}
			System.out.print(0 + "\n");
		}
		
		else {
			for (int i = 0; i < x; i++) {
				System.out.print(1 + " ");
			}
			
			for (int i = 0; i < n - x; i++) {
				if (i % 2 == 0 && i != n - x - 1) {
					System.out.print(0 + " ");
				} else if (i % 2 == 1 && i != n - x - 1){
					System.out.print(1 + " ");
				} else {
					if (i % 2 == 0) {
						System.out.print(0 + "\n");
					} else {
						System.out.print(1 + "\n");
					}
				}
			}
		}
	}

}
