package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class TheOddNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int num;
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(in.readLine());
			
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {  
            if (entry.getValue() % 2 != 0) {
                System.out.println(entry.getKey()); 
                break;
            }
		}
	}
}
