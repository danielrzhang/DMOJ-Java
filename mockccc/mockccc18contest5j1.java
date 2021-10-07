package mockccc;
import java.util.Scanner;
public class mockccc18contest5j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String result = "";
		String string = in.nextLine();
		if (string.contains("CCC")) {
			result = "NO";
		}

		else {
			result = "YES";
		}

		System.out.println(result);
		in.close();

	}
}