package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력 : "); // 991225-1234567
		String jumin = sc.next(); // '-'때문에 문자열로 입력받는다.

		// Quiz 1.성별 검증 -> 8번째 1,3 / 2,4 -> 5, 6 외국인 탈북자 --> 성별검증만 받자
		char ch = jumin.charAt(7); // char은 equals가 안됨
		if (ch == '1' || ch == '3') { // 글자 하나 Char끼리 비교해야함을 잊지말자!
			System.out.println("남자입니다.");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자입니다.");
		}

		// Quiz 2. 나이를 계산 -> 2024년 - 출생년도, 나이계산하는 것을 밑에서
		String birth = jumin.substring(0, 2);
//		int birthValue = Integer.parseInt(birth);
//		String newBirth = "";
//		if (birthValue >= 25 && birthValue <= 99) {
//			newBirth = "19" + birthValue;
//		}
//		System.out.println(newBirth);
//		String now = "2024";
//		int result = Integer.parseInt(now) - Integer.parseInt(newBirth);
//		System.out.println("현재 나이는 ? : " + (result + 1));

		// 노가다 방식
		String newBirth = "19" + birth;
		String now = "2024";
		int result = Integer.parseInt(now) - Integer.parseInt(newBirth);
		System.out.println("현재 나이는 ? : " + (result + 1) + "살");

		// 0~24 사이 25~99사이는 -->IF로 바꾸고 싶은데

		// Quiz1 -> substring으로 방식
		// System.out.println((int)ch % 2); --> 몫과 나머지로 접근
//		String newOne = jumin.substring(7, 8);
//		if (newOne.equals("1") || newOne.equals("3")) {
//			System.out.println("남자입니다.");
//		} else if (newOne.equals("2") || newOne.equals("4")) {
//			System.out.println("여자입니다.");
//		}

	}
}
