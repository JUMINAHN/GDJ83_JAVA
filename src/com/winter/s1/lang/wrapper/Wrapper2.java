package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {
	// Q. 비번을 넣었을때 하나라도 대문자가 나오는가? 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next(); // String으로 받아서
		boolean flag = true;
		for (int i = 0; i < pw.length(); i++) {
			char c = pw.charAt(i);
			if (!Character.isUpperCase(c)) {
				flag = false;
			} else {
				break;
			}
		}
		if (flag) {
			System.out.println("대문자 한 개 이상 발견!");
		} else {
			System.out.println("대문자는 한 개 이상 있어야 합니다.");
		}

	}
}
