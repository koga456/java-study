package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exec2 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		System.out.println(LocalDateTime.of(2017, Month.JANUARY, 1, 1, 23, 45));
		System.out.println(LocalDateTime.of(2017, 1, 1, 1, 23, 45, 678_000_000));
		
		System.out.println(LocalDateTime.parse("2017-01-01T01:23:45.678"));
		
		LocalDateTime datetime2 = LocalDateTime.of(2017, Month.JANUARY, 2, 3, 45, 59, 890_000_000);
		System.out.println("年" + datetime2.getYear());
		System.out.println("月" + datetime2.getMonth());
		System.out.println("月（数字）" + datetime2.getMonthValue());
		System.out.println("日" + datetime2.getDayOfMonth());
		System.out.println("時" + datetime2.getHour());
		System.out.println("分" + datetime2.getMinute());
		System.out.println("秒" + datetime2.getSecond());
		System.out.println("ナノ秒" + datetime2.getNano());
		
		LocalDateTime dateTime3 = LocalDateTime.of(2017, Month.JANUARY, 2, 3, 21, 30, 15);
		System.out.println("3日後" + dateTime3.plusDays(3));
		System.out.println("100日前" + dateTime3.minusDays(100));
		System.out.println("30秒前" + dateTime3.minusSeconds(30));
		System.out.println("元の値" + dateTime3);
	}
}
