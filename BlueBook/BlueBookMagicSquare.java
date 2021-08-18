import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BlueBookMagicSquare {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(in.readLine());
		
		int rc;
		ArrayList<Integer> square;
		ArrayList<Integer> sumList;
		boolean isMagic;
		int checkNum;
		int sum;
		
		for (int i = 0; i < testCases; i++) {
			rc = Integer.parseInt(in.readLine());
			square = new ArrayList<>();
			sumList = new ArrayList<>();
			isMagic = true;
			checkNum = 0;
			sum = 0;
			
			for (int j = 0; j < rc * rc; j++) {
				square.add(Integer.parseInt(in.readLine()));
			}
			
			for (int j = 0; j < rc; j++) {
				sum = 0;
				for (int k = 0; k < rc; k++) {
					sum += square.get(rc * k + j);
				}
				sumList.add(sum);
			}
			
			checkNum = sumList.get(0);
			
			for (int j = 0; j < sumList.size(); j++) {
				if (checkNum != sumList.get(j)) {
					isMagic = false;
				}
			}
			
			if (isMagic) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			in.readLine();
		}
	}

}
