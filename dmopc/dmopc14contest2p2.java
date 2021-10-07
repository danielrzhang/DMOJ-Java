package dmopc;
import java.util.Scanner;
public class dmopc14contest2p2{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		in.nextInt();
		in.nextLine();
		String log = in.nextLine();

		String [] logList = log.split("X");

		for (int i = 0; i < logList.length; i++) {
			String cutLog = logList[i];
			System.out.println(cutLog);

			if (cutLog.equals(" ")) {


			}
		}
		in.close();

	}
}