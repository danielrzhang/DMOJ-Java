package other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Necroposting {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate firstDate = LocalDate.parse(in.readLine(), formatter);
		LocalDate secondDate = LocalDate.parse(in.readLine(), formatter);

		long result = ChronoUnit.DAYS.between(firstDate, secondDate);
		System.out.println(result);

	}
}