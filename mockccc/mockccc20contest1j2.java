package mockccc;
import java.util.Scanner;
public class mockccc20contest1j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int uc = in.nextInt();
		int um = in.nextInt();
		int k = in.nextInt();

		int result = k * Math.max(uc, um);
		System.out.println(result);
		in.close();

	}
}