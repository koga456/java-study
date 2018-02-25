package date;

import java.util.Calendar;
import java.util.Date;

public class Exec {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.getTime());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("��Calendar�̒l");
		System.out.println(calendar);
		System.out.println("��getTime�̒l");
		System.out.println(calendar.getTime());
		
		calendar.set(calendar.MINUTE, 18);
		System.out.println("���̎w��:" + calendar.getTime());
		
		calendar.set(2013, 9, 22, 18, 36, 42);
		System.out.println("�S���w��:" + calendar.getTime());
		
		System.out.println("���̕\��:" + calendar.get(Calendar.DATE));
		System.out.println("�b�̕\��:" + calendar.get(Calendar.SECOND));
		
		calendar.add(calendar.YEAR, 2);
		System.out.println("�N�̉��Z:" + calendar.getTime());
		
		calendar.add(calendar.MONTH, -2);
		System.out.println("���̌��Z:" + calendar.getTime());
	}
}
