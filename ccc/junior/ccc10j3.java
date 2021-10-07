package ccc.junior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc10j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;
		int b = 0;
		
		String str = in.readLine();
		String[] input;
		while (!str.equals("7")) {
			input = str.split(" ");
			
			switch (Integer.parseInt(input[0])) {
				case 1: {
					if (input[1].equals("A")) {
						a = Integer.parseInt(input[2]);
					} else {
						b = Integer.parseInt(input[2]);
					}
					break;
				}
				
				case 2: {
					if (input[1].equals("A")) {
						System.out.println(a);
					} else {
						System.out.println(b);
					}
					break;
				}
				
				case 3: {
					if (input[1].equals("A") && input[2].equals("A")) {
						a = a + a;
					} else if (input[1].equals("B") && input[2].equals("B")){
						b = b + b;
					} else if (input[1].equals("A") && input[2].equals("B")){
						a = a + b;
					} else {
						b = b + a;
					}
					break;
				}
				
				case 4: {
					if (input[1].equals("A") && input[2].equals("A")) {
						a = a * a;
					} else if (input[1].equals("B") && input[2].equals("B")){
						b = b * b;
					} else if (input[1].equals("A") && input[2].equals("B")){
						a = a * b;
					} else {
						b = b * a;
					}
					break;
				}
				
				case 5: {					
					if (input[1].equals("A") && input[2].equals("A")) {
						a = a - a;
					} else if (input[1].equals("B") && input[2].equals("B")){
						b = b - b;
					} else if (input[1].equals("A") && input[2].equals("B")){
						a = a - b;
					} else {
						b = b - a;
					}
					break;
				}
				
				case 6: {
					if (input[1].equals("A") && input[2].equals("A")) {
						a = a / a;
					} else if (input[1].equals("B") && input[2].equals("B")){
						b = b / b;
					} else if (input[1].equals("A") && input[2].equals("B")){
						a = a / b;
					} else {
						b = b / a;
					}
					break;
				}
				
				case 7: {
					break;
				}
			}
			str = in.readLine();
		}
	}

}
