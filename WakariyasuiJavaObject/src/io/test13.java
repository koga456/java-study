package io;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class test13 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date d1 = new Date();
		c.setTime(d1);
		
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(d1));
		
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, 3);
		Date d2 = c.getTime();
		System.out.println(df.format(d2));
		
		c.set(2020, 11, 20, 13, 30);
		Date d3 = c.getTime();
		System.out.println(df.format(d3));
		
		System.out.println("”N=" + c.get(Calendar.YEAR));
		System.out.println("ŒŽ=" + c.get(Calendar.MONTH));
		System.out.println("“ú=" + c.get(Calendar.DATE));
	}
}
