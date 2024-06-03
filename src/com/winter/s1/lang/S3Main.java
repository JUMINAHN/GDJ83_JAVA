package com.winter.s1.lang;

public class S3Main {
	public static void main(String[] args) {
		String name = "finfl.pdf";
		// indexof 메서드

		// int ch이 == char인것이다.
		// char타입넣으면 -> int가 된다. 형변환때문에
		// int num = name.indexOf("f", 3); // 문자가 있는 위치 전달
		// 못 찾으면 -1을 반환하겠다.
		// 젤 첫번째 찾은 것에서 끝나고, 더 안찾는다.

		// System.out.println(num); // 문자는 첫글자의 index번호
		// 텍스트안에 순서대로 돌면서 찾기****??? ??

		boolean flag = true;
		int num = 0;
		int result = -1;
		while (flag) {
			result = name.indexOf("f", num);
			if (result == -1) {
				break;
			}
			num = 1 + result;
			System.out.println(result);
		}
		System.out.println("종료");
	}
}
