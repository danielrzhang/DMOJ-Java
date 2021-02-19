import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class dmopc20contest3p2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split(" ");
		int rows = Integer.parseInt(input[0]);
		int columns = Integer.parseInt(input[1]);
		int[][] beats = new int[rows][columns];
		String[] beatInput;
		ArrayList<int[]> totalInfo = new ArrayList<int[]>();

		for (int i = 0; i < Integer.parseInt(input[0]); i++) {
			beatInput = in.readLine().split(" ");

			for (int j = 0; j < beatInput.length; j++) {
				beats[i][j] = Integer.parseInt(beatInput[j]);
			}
		}

		int newK = Integer.parseInt(input[2]);

		for (int i = 0; i < columns - 1; i++) {
			for (int j = 0; j < rows - 1; j++) {
				for (int k = 0; k < rows - 1; k++) {
					if (j == k) {
						k++;
					}

					if (beats[j][i] - beats[k][i] == newK && beats[j][i + 1] - beats[k][i + 1] == newK) {
						System.out.println(beats[j][i] + " " + beats[k][i] + " " + beats[j][i + 1] + " " + beats[k][i + 1]);
						totalInfo.add(new int[] {k + 1, j + 1, i + 1});
					}
				}
			}
		}

		for (int i = 0; i < totalInfo.size(); i++) {
			System.out.println(Arrays.toString(totalInfo.get(i)));
		}

		System.out.println(totalInfo.size());
	}
}

