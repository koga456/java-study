package date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class InstantTest {
	public static void main(String[] args) {
		
		Instant i1 = Instant.now();
		System.out.println(i1);
		
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		long l = i2.toEpochMilli();
		System.out.println(l);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);
		
		ZonedDateTime z2 = ZonedDateTime
				.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		System.out.println("“Œ‹:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ƒƒ“ƒhƒ“:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		if (z2.isEqual(z3)) {
			System.out.println("‚±‚ê‚ç‚Í“¯‚¶uŠÔ‚ğw‚µ‚Ä‚¢‚Ü‚·");
		}
	}
}