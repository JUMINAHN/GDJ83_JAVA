package com.winter.s1;

public class Test {

	public static void main(String[] args) {
		// 문서에서 생략은 public을 의미
		Object obj = new Object();
		Test test = new Test();

		// toString -> 참조변수를 출력하면 내부적으로 toString()이나옴
		// toString은 참조변수 찍은거랑 같은거다.
		// 기본적으로쓰는 메서드들 필요하면 내용을 바꿔서 써라 -> 오버라이딩
		String str = obj.toString();
		String test1 = test.toString();
		System.out.println(test1);

		// String -> 문자열이 모인 문자배열
		// 얘출력
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		String name = "winter";
		System.out.println(name); // 참주변수를 찍으면 주소가 나와야하는데 문자열이 나왔던 이유는 toString()오버라이딩

		// String name = new String("winter");
		// String name ="winter"과 같다.

	}

}
