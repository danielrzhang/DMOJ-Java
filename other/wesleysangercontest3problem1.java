package other;
import java.util.Scanner;
public class wesleysangercontest3problem1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int temperature = in.nextInt();
		int snowfall = in.nextInt();
		int rainRisk = in.nextInt();
		String result = "";

		if (temperature < -40 && snowfall >= 15) {
			result = "YES";
		}

		else if (snowfall >= 15 && rainRisk > 50) {
			result = "YES";
		}

		else if (rainRisk > 50 && temperature < -40) {
			result = "YES";
		}

		else if (snowfall >= 15 && temperature < -40 && rainRisk > 50) {
			result = "YES";
		}

		else {
			result = "NO";
		}
		System.out.println(result);
		in.close();

	}
}