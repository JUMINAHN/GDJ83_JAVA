package com.winter.s1.lang; //이클래스 현 패키지

public class S1Main {

	public static void main(String[] args) {
		// import 생략 가능 한 것
		// 1)같은 패키지 내에 있는 클래스는 생략
		// 2)java.lang 내에 있는 클래스를 사용할 때 import 생략
		Object obj = new Object(); // Object도 클래스이자 오브젝트
		Object obj2 = new Object();
		System.out.println(obj == obj2); // 주소값끼리 비교

		// String 알고가기
		String n = new String("winter");
		String n2 = "winter"; // 이것또한 참조변수

		System.out.println(n == n2); // 주소값끼리 비교
		// 참조변수를 찍으면 toString()을 자동호출한다 -> 주소값을 호출 -> 모든클래스는 오브젝트
		// toString, eqauls 오버라이딩
		// method를 호출할 수 있어야 함

		char ch = n.charAt(0); // 문자의 0번째 목록 출력
		System.out.println(ch);
		int num = n.length();
		System.out.println(num);
	}
}
