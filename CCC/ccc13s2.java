import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc13s2 {
	
	public static void push(int[] array, int newNum) {
		for (int i = 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		array[array.length - 1] = newNum;
	}
	
	public static int sum(int[] array) {
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			counter += array[i];
		}
		return counter;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int maxWeight = Integer.parseInt(in.readLine());
		int[] bridgeTest = new int[4];
		
		int numCars = Integer.parseInt(in.readLine());
		
		int[] carArray = new int[numCars];
		
		for (int i = 0; i < numCars; i++) {
			carArray[i] = Integer.parseInt(in.readLine());
		}
		
		int counter = 0;
		boolean running = true;
		int carArrayIndex = 0;
		
		while (running) {
			push(bridgeTest, carArray[carArrayIndex]);
			if (sum(bridgeTest) <= maxWeight) {
				counter++;
				if (carArrayIndex == carArray.length - 1) {
					running = false;
				} else {
					carArrayIndex++;
				}
			} else {
				running = false;
			}
		}
		System.out.println(counter);
	}
}
