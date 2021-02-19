import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlayfulPlaydoughs {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] nq = in.readLine().split(" ");
		int n = Integer.parseInt(nq[0]);
		int q = Integer.parseInt(nq[1]);
		ArrayList<Double> playDoughs = new ArrayList<Double>();

		String[] doughs = in.readLine().split(" ");
		for (int i = 0; i < doughs.length; i++) {
			playDoughs.add(Double.parseDouble(doughs[i]));
		}

		int command;
		Double weight;
		int counter;

		String[] commands;
		for (int i = 0; i < q; i++) {
			counter = 0;
			commands = in.readLine().split(" ");
			command = Integer.parseInt(commands[0]);
			weight = Double.parseDouble(commands[1]);

			if (command == 1) {
				for (int j = 0; j < playDoughs.size(); j++) {
					if (playDoughs.get(j).compareTo(weight) == 0) {
						playDoughs.remove(j);

						playDoughs.add(Math.floor(weight / 2));
						playDoughs.add(Math.ceil(weight / 2));
					}
				}
			} else if (command == 2){
				for (int j = 0; j < playDoughs.size(); j++) {
					if (playDoughs.get(j).compareTo(weight) == 0) {
						counter++;
					}
				}
				System.out.println(counter);
			}
		}
	}
}

