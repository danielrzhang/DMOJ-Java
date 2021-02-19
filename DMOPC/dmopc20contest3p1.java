import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc20contest3p1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		String[] nums = in.readLine().split(" ");
		boolean[] numReceived = new boolean[n];
		boolean allReceived = true;

		if (numReceived.length == n) {
			for (int i = 0; i < numReceived.length; i++) {
				if (numReceived[Integer.parseInt(nums[i]) - 1] == true) {
					numReceived[Integer.parseInt(nums[i]) - 1] = false;
				} else {
					numReceived[Integer.parseInt(nums[i]) - 1] = true;
				}
			}

			for (int i = 0; i < numReceived.length; i++) {
				if (numReceived[i] == false) {
					allReceived = false;
					break;
				}
			}
		} else {
			allReceived = false;
		}

		if (allReceived) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
