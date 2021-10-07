package bluebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BlueBookMin {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		ArrayList<Double> list = new ArrayList<Double>();

		for (int i = 0; i < n; i++) {
			list.add(Double.parseDouble(in.readLine()));
		}
		Collections.sort(list);
		System.out.printf("%.2f", list.get(0));
	}
}
