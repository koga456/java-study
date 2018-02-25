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
		System.out.println("■Calendarの値");
		System.out.println(calendar);
		System.out.println("■getTimeの値");
		System.out.println(calendar.getTime());
		
		calendar.set(calendar.MINUTE, 18);
		System.out.println("分の指定:" + calendar.getTime());
		
		calendar.set(2013, 9, 22, 18, 36, 42);
		System.out.println("全部指定:" + calendar.getTime());
		
		System.out.println("日の表示:" + calendar.get(Calendar.DATE));
		System.out.println("秒の表示:" + calendar.get(Calendar.SECOND));
		
		calendar.add(calendar.YEAR, 2);
		System.out.println("年の加算:" + calendar.getTime());
		
		calendar.add(calendar.MONTH, -2);
		System.out.println("月の減算:" + calendar.getTime());
	}
}
