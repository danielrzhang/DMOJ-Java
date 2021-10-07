package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ccc05j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> directions = new ArrayList<String>();
		ArrayList<String> streets = new ArrayList<String>();
		
		String direction, street;

		do {
			direction = in.readLine();
			street = in.readLine();
			
			directions.add(direction);
			streets.add(street);				
		} while (!street.equals("SCHOOL"));
		
		Collections.reverse(directions);
		Collections.reverse(streets);
		streets.remove("SCHOOL");

		for (int i = 0; i < directions.size(); i++) {
			if (directions.get(i).equals("R")) {
				directions.set(i, "LEFT");
			} else {
				directions.set(i, "RIGHT");
			}
		}
		
		for (int i = 0; i < streets.size(); i++) {
			System.out.println("Turn " + directions.get(i) + " onto " + streets.get(i) + " street.");
		}
		System.out.println("Turn " + directions.get(directions.size() - 1) + " into your HOME.");
	}
}
