package chap15.time;

import java.time.LocalDateTime;

public class Main15_5 {

	public static void main(String[] args) {
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		LocalDateTime lf = l.plusDays(100);
		System.out.println(lf);
		

	}

}
