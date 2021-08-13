import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggysNewClothes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		
		if ((s + 2) * 3 + 16 <= x) {
			System.out.println("Yes it fits!");
		} else {
			System.out.println("No, it's too small :(");
		}
	}

}
