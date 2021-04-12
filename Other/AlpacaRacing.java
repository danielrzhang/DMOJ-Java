import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AlpacaRacing {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = in.readLine().split(" ");
		
		int n = Integer.parseInt(input1[0]);
		int k = Integer.parseInt(input1[2]);
		BigInteger x = new BigInteger(input1[3]);
		
		int kCounter = 0;
		
		BigInteger[] alpacaSpeeds = new BigInteger[n];
		for (int i = 0; i < n; i++) {			
			alpacaSpeeds[i] = new BigInteger(in.readLine());
		}
		
		BigInteger p = new BigInteger(in.readLine());
		
		BigInteger currentAlpacaSpeed;
		BigInteger hundred = new BigInteger("100");
		
		boolean breakFor = false;
		for (int i = 0; i < alpacaSpeeds.length; i++) {
			currentAlpacaSpeed = alpacaSpeeds[i];
			
			while (currentAlpacaSpeed.compareTo(p) >= 0) {
				currentAlpacaSpeed = currentAlpacaSpeed.subtract(currentAlpacaSpeed.multiply(x).divide(hundred));
				
				
				if (kCounter > k) {
					breakFor = true;
					break;
				}
				kCounter++;
			}
			
			if (breakFor) {
				break;
			}
		}
		
		if (kCounter <= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
