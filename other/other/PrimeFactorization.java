package other;
import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		for (int z = 0; z < n; z++) {
			int number = in.nextInt();
			int [] factorList = new int [200];
			int index = 0;

			int [] primeList = new int [200];
			int [] finalList = new int [200];

			for (int j = 2; j <= number; j++) {
				if (number % j == 0) {
					factorList[index] = j;
					index++;
				}
			}

			int newIndex = 0;
			boolean isPrime = true;
			for (int i = 0; i < index; i++) {
				int factor = factorList[i];

				if (factor == 2 || factor == 3) {
					primeList[newIndex] = factor;
					newIndex++;
				}

				else {
					for (int j = 2; j <= (int) (Math.sqrt(factor)); j++) {
						if (factor % j != 0) {
							isPrime = true;
						}

						else {
							isPrime = false;
							break;
						}
					}
					if (isPrime) {
						primeList[newIndex] = factor;
						newIndex++;
					}
				}
			}

			int newerIndex = 0;
			int newestIndex = 0;
			while (number > 1) {
				if (number % primeList[newerIndex] == 0) {
					number /= primeList[newerIndex];
					finalList[newestIndex] = primeList[newerIndex];
					newestIndex++;
				}

				else {
					newerIndex++;
				}
			}

			for (int i = 0; i < newestIndex - 1; i++) {
				System.out.print(finalList[i] + " ");
			}
			System.out.println(finalList[newestIndex - 1]);
		}
		in.close();

	}
}

