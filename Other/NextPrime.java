import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrime {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(in.readLine());
		boolean running = true;
		boolean isPrime;

		if (num == 1) {
			num = 2;
		} else {
			while (running) {
				isPrime = true;
				
				for (long i = 2; i <= (long) Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
				
				if (isPrime) {
					running = false;
				} else {
					num++;
				}
			}
		}
		System.out.println(num);
	}
}
