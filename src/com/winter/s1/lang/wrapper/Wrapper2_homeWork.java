package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2_homeWork {
	// Q. 대소문자 숫자 1개이상 있어야한다.
	// Q. 비번 길이는 최소 6글자 이상이어함 (homework); --> 숫자검증 isDigit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next(); // String으로 받아서

		// 둘다 있어야 함 -> 하나하나 검증,, contain안쓰고
		// 대문자 아닌건 걍 -> 빠지고, 대문자인것들만 charAt()으로 검증하면 되지 않을까?
		// -> 그리고 그뒤에 길이 검증하면 되지 않을까?
		String flag = "최소 1개 이상의 대/소문자가 있어야 합니다.";
		char[] result = new char[pw.length()];
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) { // 대문자면 true -> 아니면 false --> Character
				result[i] = ch;
			}
		}

		char[] result2 = new char[result.length];
		for (int i = 0; i < result.length; i++) {
			if (Character.isUpperCase(result[i])) { // 대문자면 true -> 아니면 false
				result2[i] = result[i];
				flag = "통과";
				break;
			}
		}
		System.out.println(flag);
		// 대소문자 검증 완료
	}
}
