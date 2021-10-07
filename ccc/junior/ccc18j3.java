package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc18j3 {
	
	public static void printArray(int[] array) {
		String str = "";
		for (int i = 0; i < 4; i++) {
			str += Math.abs(array[i]) + " ";
		}
		str += array[4];
		System.out.println(str);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		int[] distances = new int[4];
		int[] cities = new int[5];
		
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Integer.parseInt(input[i]);
		}
		
		int counter = 0;
		for (int i = 1; i < 5; i++) {
			counter += distances[i - 1];
			cities[i] = counter;
		}
				
		printArray(cities);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < cities.length; j++) {
				cities[j] = cities[j] - distances[i];
			}
			printArray(cities);
		}
		
		
	}

}
