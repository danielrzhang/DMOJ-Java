package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSpookyFourMe {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = in.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int l = Integer.parseInt(input[1]);
		int s = Integer.parseInt(input[2]);
		
		House[] houses = new House[l];
		
		for (int i = 0; i < l; i++) {
			houses[i] = new House(i + 1, 0);
		}
		
		String[] houseRange;
		int startHouse = 0;
		int endHouse = 0;
		int spooky = 0;
		House tempHouse;
		
		for (int i = 0; i < n; i++) {
			houseRange = in.readLine().split(" ");
			startHouse = Integer.parseInt(houseRange[0]);
			endHouse = Integer.parseInt(houseRange[1]);
			spooky = Integer.parseInt(houseRange[2]);
			
			for (int j = startHouse; j <= endHouse; j++) {
				tempHouse = houses[j - 1];
				tempHouse.add(spooky);
			}
		}
		
		int counter = 0;
		for (int i = 0; i < l; i++) {
			if (houses[i].spookiness < s) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

class House {
	int number;
	int spookiness;
	
	public House(int number, int spookiness) {
		this.number = number;
		this.spookiness = spookiness;
	}
	
	public void add(int plusSpooky) {
		spookiness += plusSpooky;
	}
}
