import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class PhoneNumber {
	String name;
	int phoneNumber;
	int frequency;
	
	public PhoneNumber(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		frequency = 0;
	}
	
	public void add() {
		frequency++;
	}
	
	public void printInfo() {
		System.out.println(name + " " + phoneNumber + " " + frequency);
	}
}

public class ccchk08j3 {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		ArrayList<PhoneNumber> list = new ArrayList<PhoneNumber>();
		
		String[] input;
		for (int i = 0; i < n; i++) {
			input = readSpaceInput();
			list.add(new PhoneNumber(input[0], Integer.parseInt(input[1])));
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).name + " ");
//			System.out.println(list.get(i).phoneNumber);
//		}
		
		int d = readInt();
		int phoneNumber;
		
		for (int i = 0; i < d; i++) {
			phoneNumber = readInt();
			
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).phoneNumber == phoneNumber) {
					list.get(j).add();
					break;
				}
			}
		}
		
		int maxValue = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).frequency > maxValue) {
				maxValue = list.get(i).frequency;
			}
		}
		
		int favouriteNumber = 99999999;
		String name = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).frequency == maxValue && favouriteNumber > list.get(i).phoneNumber) {
				favouriteNumber = list.get(i).phoneNumber;
				name = list.get(i).name;
			}
		}
		System.out.println(name);
	}
	
	public static String readLine() throws IOException {
		return in.readLine();
	}
	
	public static String readString() throws IOException {
		return readLine();
	}
	
	public static int readInt() throws IOException {
		return Integer.parseInt(readLine());
	}
	
	public static long readLong() throws IOException {
		return Long.parseLong(readLine());

	}
	public static double readDouble() throws IOException {
		return Double.parseDouble(readLine());
	}
	
	public static char readCharacter() throws IOException {
		return readLine().charAt(0);
	}
	
	public static String[] readSpaceInput() throws IOException {
		return in.readLine().split(" ");
	}
}
