package com.winter.s5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {
	public static void main(String[] args) {
		// 클래스는 어디서나 사용 가능 -> 다만 생성자는 사용 불가 private이기 때문에
		Single single = Single.get(); // 뉴싱글해서 주겠다.

		// 현재 시간과 날짜 정보가 만들어 짐
		Calendar ca = new GregorianCalendar();
		ca = Calendar.getInstance(); // 객체를 받아오겠다 ;;

		// 멤버변수
		System.out.println(ca.get(Calendar.YEAR)); // 년도를 return
		System.out.println(ca.get(Calendar.HOUR_OF_DAY)); // 시간을 return
		System.out.println(ca.get(Calendar.DAY_OF_MONTH)); // date
		System.out.println(ca.get(Calendar.MONTH) + 1); // month는 0에 시작

		Date date = ca.getTime();
		System.out.println(date); // 참조 변수를 찍으면

		Calendar future = Calendar.getInstance(); // 현재 시간
		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17); // 넘어갑니더
		future.set
		
		System.out.println(future.getTime());

	}
}
