package mockccc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mockccc20contest1j4 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String houses = in.readLine();
		int ratingCounter = 0;

		for (int i = 0; i < houses.length(); i++) {
			if (houses.charAt(i) == '0') {
				ratingCounter++;
			}
		}
		System.out.println(ratingCounter);
	}
}