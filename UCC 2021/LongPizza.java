import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Slice {
	int sliceNum;
	int numCheese;
	
	public Slice(int sliceNum, int numCheese) {
		this.sliceNum = sliceNum;
		this.numCheese = numCheese;
	}
}

public class LongPizza {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		Slice[] slices = new Slice[n];
				
		String[] query = in.readLine().split(" ");
		int start = Integer.parseInt(query[0]);
		int end = Integer.parseInt(query[1]);
		
		for (int i = 0; i < n; i++) {
			slices[i] = new Slice(i + 1, 0);
		}
		
		int times = Integer.parseInt(in.readLine());
		
		String[] toppingRun;
		for (int i = 0; i < times; i++) {
			toppingRun = in.readLine().split(" ");
			
			for (int j = Integer.parseInt(toppingRun[0]) - 1; j < Integer.parseInt(toppingRun[1]); j++) {
				slices[j].numCheese++; 
			}
		}
				
		int counter = 0;
		for (int i = start - 1; i < end; i++) {
			counter += slices[i].numCheese;
		}
		System.out.println(counter);
	}

}
