package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABlockGame {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = in.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int k = Integer.parseInt(input1[1]);
		int d = Integer.parseInt(input1[2]);
		
		double jw = Double.parseDouble(in.readLine());
		
		boolean isHacking = true;
		
		String[] input2;
		for (int i = 0; i < n; i++) {
			input2 = in.readLine().split(" ");
			k += Integer.parseInt(input2[0]);
			d += Integer.parseInt(input2[1]);
			
			if (Integer.parseInt(input2[1]) != 0) {
				isHacking = false;
			}
		}
		
//		System.out.println(k * 1.0 / d);
//		System.out.println(jw);
		
		if (isHacking) {
			System.out.println("stop hacking!");
		} else {
			if (k * 1.0 / d * 1.0 >= jw) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}

}
