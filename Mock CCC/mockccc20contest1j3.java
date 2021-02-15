import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class mockccc20contest1j3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		BigDecimal first = new BigDecimal(in.readLine());
		BigDecimal second = new BigDecimal(in.readLine());

		BigDecimal result = first.multiply(second).divide(new BigDecimal("4")).setScale(2, RoundingMode.HALF_UP);
		System.out.println(result);
	}

}
