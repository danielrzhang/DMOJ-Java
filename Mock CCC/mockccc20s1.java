import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mockccc20s1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] firstArray, secondArray;
		int war = 0;
		boolean inBattle = false;

		firstArray = in.readLine().split(" ");
		secondArray = in.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			if (firstArray[i].equals(secondArray[i]) && !inBattle) {
				inBattle = true;
				war++;
			} else {
				inBattle = false;
			}
		}
		System.out.println(war);
	}
}
