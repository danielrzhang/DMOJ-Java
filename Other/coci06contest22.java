import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class coci06contest22 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(input[i]));
		}
		
		Collections.sort(list);
		
		String sequence = in.readLine();
		
		if (sequence.equals("ABC")) {
			System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		} else if (sequence.equals("ACB")) {
			System.out.println(list.get(0) + " " + list.get(2) + " " + list.get(1));
		} else if (sequence.equals("BAC")) {
			System.out.println(list.get(1) + " " + list.get(0) + " " + list.get(2));
		} else if (sequence.equals("BCA")) {
			System.out.println(list.get(1) + " " + list.get(2) + " " + list.get(0));
		} else if (sequence.equals("CAB")) {
			System.out.println(list.get(2) + " " + list.get(0) + " " + list.get(1));
		} else if (sequence.equals("CBA")) {
			System.out.println(list.get(2) + " " + list.get(1) + " " + list.get(0));
		}   
		
	}
}
