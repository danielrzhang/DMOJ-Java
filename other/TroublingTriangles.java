package other;
import java.util.Scanner;
public class TroublingTriangles {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		for (int i = 0; i < number; i++) {
			int firstX = in.nextInt();
			int firstY = in.nextInt();
			int secondX = in.nextInt();
			int secondY = in.nextInt();
			int thirdX = in.nextInt();
			int thirdY = in.nextInt();

			double firstSide = Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firstY - secondY, 2));
			double secondSide = Math.sqrt(Math.pow(secondX - thirdX, 2) + Math.pow(secondY - thirdY, 2));
			double thirdSide = Math.sqrt(Math.pow(thirdX - firstX, 2) + Math.pow(thirdY - firstY, 2));
			double perimeter = firstSide + secondSide + thirdSide;

			double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
			double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
			System.out.printf("%.2f %.2f%n", area, perimeter);
		}
		in.close();

	}
}