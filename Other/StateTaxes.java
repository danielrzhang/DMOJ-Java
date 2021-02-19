import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateTaxes {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] firstInput = in.readLine().split(" ");
		int numCitizens = Integer.parseInt(firstInput[0]);
		int numOperations = Integer.parseInt(firstInput[1]);

		String[] stringCitizens = in.readLine().split(" ");
		int[] salaries = new int[numCitizens];
		int[] revenue = new int[numCitizens];

		for (int i = 0; i < numCitizens; i++) {
			salaries[i] = Integer.parseInt(stringCitizens[i]);
		}

		String[] operation;
		int startIndex, endIndex, increment;
		for (int i = 0; i < numOperations; i++) {
			operation = in.readLine().split(" ");

			if (operation.length == 3) {
				startIndex = Integer.parseInt(operation[1]) - 1;
				endIndex = Integer.parseInt(operation[2]) - 1;

				for (int j = startIndex; j <= endIndex; j++) {
					revenue[j] += salaries[j];
				}
			}

			else {
				startIndex = Integer.parseInt(operation[1]) - 1;
				endIndex = Integer.parseInt(operation[2]) - 1;
				increment = Integer.parseInt(operation[3]);

				for (int j = startIndex; j <= endIndex; j++) {
					salaries[j] += increment;
				}
			}
		}

		String endString = "";
		for (int i = 0; i < revenue.length; i++) {
			endString += revenue[i] + " ";
		}
		System.out.println(endString.trim());
	}
}
