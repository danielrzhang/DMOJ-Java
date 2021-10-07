package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookPopExplosion {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		double rate = Double.parseDouble(input[0]);
		long initialPop = Long.parseLong(input[1]);
		int year = Integer.parseInt(input[2]);
		long targetPop = Long.parseLong(input[3]);
		int numYears = 0;
		long changePop = 0;

		while (changePop < targetPop) {
			numYears++;
			changePop = (long) (initialPop * Math.pow(1 + (rate / 100), numYears));
		}
		System.out.println(year + numYears);
	}
}