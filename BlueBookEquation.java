import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueBookEquation {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double first = Double.parseDouble(in.readLine());
		double second = Double.parseDouble(in.readLine());

		if (first == 0 && second == 0) {
			System.out.println("indeterminate");
		} else if (first == 0 && second != 0) {
			System.out.println("undefined");
		} else {
			System.out.printf("%.2f%n", -second / first);
		}
	}
}
