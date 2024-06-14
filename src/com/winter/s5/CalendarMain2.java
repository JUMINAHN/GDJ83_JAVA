package com.winter.s5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance(); // 현재 날짜

		Calendar birth = Calendar.getInstance();// 현재 날짜
		// 태어난 년 월 일
		birth.set(1998, 9, 6);
		System.out.println(birth.getTime());
		// 요일이 맞는지

		long c = ca.getTimeInMillis();
		c = (c / (1000 * 60 * 60 * 24));
		long b = birth.getTimeInMillis(); // 날짜를 계산할 때는 밀리세컨즈로 계산한다
		b = b + 1000 * 60 * 60 * 24 * 100L; // *100하면 100일 뒤 날짜로 담음
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());

		// 특정한 날짜로 굴리라 --> roll
		String n = "1995-03-21";
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));
		System.out.println(ca.getTime());
		// 문자열을 칼랜더로?

		ca = Calendar.getInstance(); // 객체 생성 --> 오늘 날짜로
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm"); // 현재시간을 이런 패턴으로 만들어줘
		String s = sd.format(ca.getTime());
		System.out.println(s);

		String id = UUID.randomUUID().toString(); // 절대 중복되는 문자열이 나올 수 없다.
		System.out.println(id);
	}
}
