package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodTest {
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter
				.ofPattern("yyyy/MM/dd");
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);
		
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		
		LocalDate d3 = d2.plus(p2);
		
		String str = d3.format(f);
		System.out.println(str);
	}
}
