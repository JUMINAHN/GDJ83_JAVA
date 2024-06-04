package com.winter.s1.lang.wrapper;

public class Wrapper1 { // 감싼다
	public static void main(String[] args) {
		// 자바는 기본적으로 class단위로 이루어져 있다. (클래스 == 데이터 타입)
		// 래퍼클래스를 엄청많이쓴다~
		// int를 object(객체)화 -> Integer (oracle문서 참고)
		System.out.println(Integer.BYTES); // 이걸보고 primitive type이 만들어짐
		System.out.println(Integer.MAX_VALUE); // int 최대값
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // 32 -> 32비트 (4바이트) -> 1바이트 : 8비트
		// Integer 기본 생성자 없음
		// 문자열도 쓸 수 있음 -> 문자열을 숫자로 바꾸기 위해서
		Integer i = new Integer("10"); // 쓸 순 있지만 쓰지말라는 이야기~
		int num = 10; // prmitive -> 객체 형태로 감싸고자 한다.
		i = new Integer(10); // 숫자 10을 객체타입으로 바꿔 쓰자 (감쌈) --> 기존에
		// ParseInt를 많이 씀
		int num1 = Integer.parseInt("10");
		double num2 = Double.parseDouble("3.14");
		Long num3 = Long.parseLong("10L");

		// wrapper
		num = 10; // Integer라는 클래스 타입으로 바꾸고 싶을 때
		Integer n1 = num;// Integer타입을 담을 수 있음
		// n1은 지역변수이면서 레퍼런스 타입 -> n1은 주소값이 들어가있는 것(참조변수)
		// int가 Integer에 들어갈 수 있다. : 오토박싱 --> 다른걸로 바꿀 수 있다.
		// ****이 타입으로 된다는 것만 알고 있으면 된다. (다형성_관계를 맺는 것_상속_ // 과 다르다)

		num = n1; // auto-unboxing (기본형안에 primitive type을 담는다)
		// n1 = 3.14;//Integer type의 클래스를 넣던가 int type을 넣던가 할 수 있다.

		Double d1 = 3.12;
		n1 = (int) 3.12; // 굳이 넣고 싶으면? 형변환

		// String에 있었던 valueOf도 셀프로 해보기;
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		// 비번을 넣었을때 하나라도 대문자가 나오냐? -> equals? 한글자씩

	}
}
