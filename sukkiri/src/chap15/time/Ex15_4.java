package chap15.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		System.out.println(c.getTime());
		Date date = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(date);
		System.out.println(s);
		

	}

}
