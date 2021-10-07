package coci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class coci08contest52 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] s = br.readLine().split(" ");

		int firstNum = Integer.parseInt(s[0]);
		int secondNum = Integer.parseInt(s[1]);

		int smallNum = Math.min(firstNum, secondNum);

		for (int i = 1; i <= smallNum; i++) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				System.out.println(i + " " + firstNum / i + " " + secondNum / i);
			}
		}
	}
}