import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookTriangle {
	
	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static long combination(long n, long r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(in.readLine());
		
		for (long i = 0; i < n; i++) {
			for (long j = 0; j <= i; j++) {
				if (j < i) {
					System.out.print(combination(i, j) + " ");
				} else {
					System.out.println(combination(i, j));
				}
			}
		}
		
	}

}
