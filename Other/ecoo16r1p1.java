import java.util.Scanner;
public class ecoo16r1p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double testWeight = in.nextDouble() / 100;
		double assignmentWeight = in.nextDouble() / 100;
		double projectWeight = in.nextDouble() / 100;
		double quizWeight = in.nextDouble() / 100;

		for (int i = 0; i < 2; i++) {
			int numStudents = in.nextInt();
			int counter = 0;

			for (int j = 0; j < numStudents; j++) {
				double testMark = in.nextDouble();
				double assignmentMark = in.nextDouble();
				double projectMark = in.nextDouble();
				double quizMark = in.nextDouble();

				double totalMark = testMark * testWeight + assignmentMark * assignmentWeight + projectMark * projectWeight + quizMark * quizWeight;
				System.out.println(totalMark);
				if (totalMark >= 50.0) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		in.close();

	}
}