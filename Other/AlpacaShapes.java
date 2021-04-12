import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlpacaShapes {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		
		double s = Double.parseDouble(input[0]);
		double r = Double.parseDouble(input[1]);
		
		double square = Math.pow(s, 2);
		double circle = Math.PI * Math.pow(r, 2);
		
		if (square > circle) {
			System.out.println("SQUARE");
		} else {
			System.out.println("CIRCLE");
		}
	}

}
