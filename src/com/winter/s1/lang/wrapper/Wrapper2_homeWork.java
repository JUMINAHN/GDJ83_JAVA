package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2_homeWork {
	// 숫자 1개이상 있어야한다.
	// Q. 비번 길이는 최소 6글자 이상이어함 (homework); --> 숫자검증 isDigit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next(); // String으로 받아서
		boolean section = true;

		if (pw.length() < 6) {
			System.out.println("숫자 길이를 확인해주세요");
			section = false;
		}

		while (section) {
			String flag = "최소 1개 이상의 대/소문자, 숫자가 있어야 합니다.";
			char[] result = new char[pw.length()];
			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isUpperCase(ch)) {
					result[i] = ch;
				}
			}

			char[] result2 = new char[result.length];
			for (int i = 0; i < result.length; i++) {
				if (Character.isUpperCase(result[i])) { // 대문자면 true -> 아니면 false
					result2[i] = result[i];
				}
			}
			System.out.println(flag);
			break;
		}

		// 숫자만ParseInt어째하지 ?
//		char[] result3 = new char[result2.length];
//		for (int i = 0; i < result2.length; i++) {
//			if (Character.isDigit(result2[i])) { // 대문자면 true -> 아니면 false
//				result3[i] = result2[i];
//				flag = "통과";
//				break;
//			}
//		}

		// 대소문자 검증 완료
	}
}
