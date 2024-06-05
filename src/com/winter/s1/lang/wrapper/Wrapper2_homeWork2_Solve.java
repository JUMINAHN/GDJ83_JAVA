package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2_homeWork2_Solve {
	// 숫자 1개이상 있어야한다.
	// Q. 비번 길이는 최소 6글자 이상이어함 (homework); --> 숫자검증 isDigit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next(); // String으로 받아서

		// 선생님 풀이
		String result = "최소 1개 이상의 대문자가 있어야 합니다.";
//		int upper = 0; // 대문자의 개수를 담으려고 한다.
//		int lower = 0; // 소문자의 개수
//		int digit = 0; // 숫자가 몇개 담기느냐?
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		for (int i = 0; i < pw.length(); i++) { // for문이 끝낫을 때 끝까지 비교.. --> 한번이라도 다 들어갔다 나왔는지 검증
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) { // 대문자면 true -> 아니면 false
				upper = true;// upper++;
			} else if (Character.isLowerCase(ch)) { // ch가 소문자 입니까?
				lower = true; // lower++;
			} else if (Character.isDigit(ch)) { // 숫자입니까?
				digit = true;// digit++;
			} else {

			}
		}
		// 3개의 변수가 각각 0보다 크면 된다.
		// upper > 0 && lower > 0 && digit > 0
		if (upper && lower && digit) { // 3개가 모두 일치한다면 한개 이상 다 들어간다.
			System.out.println("통과");
		} else {
			System.out.println("fail");
		}
		System.out.println(result);

	}
}
