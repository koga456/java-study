package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class LocalDateTimeTest {
	public static void main(String[] args) {
		
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);
		
		LocalDateTime l2 = LocalDateTime
				.of(2014, 1, 1, 9, 5, 0, 0);
		System.out.println(l2);
		
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println(z1);
		
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l3);
		
		System.out.println("ÉçÉìÉhÉì:" + z1.getYear() + z1.getMonth() + z1.getDayOfMonth());
		System.out.println("ìåãû:" + l3.getYear() + l3.getMonth() + l3.getDayOfMonth());
	}
}