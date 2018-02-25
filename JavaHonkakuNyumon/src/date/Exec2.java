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
		System.out.println("�N" + datetime2.getYear());
		System.out.println("��" + datetime2.getMonth());
		System.out.println("���i�����j" + datetime2.getMonthValue());
		System.out.println("��" + datetime2.getDayOfMonth());
		System.out.println("��" + datetime2.getHour());
		System.out.println("��" + datetime2.getMinute());
		System.out.println("�b" + datetime2.getSecond());
		System.out.println("�i�m�b" + datetime2.getNano());
		
		LocalDateTime dateTime3 = LocalDateTime.of(2017, Month.JANUARY, 2, 3, 21, 30, 15);
		System.out.println("3����" + dateTime3.plusDays(3));
		System.out.println("100���O" + dateTime3.minusDays(100));
		System.out.println("30�b�O" + dateTime3.minusSeconds(30));
		System.out.println("���̒l" + dateTime3);
	}
}
