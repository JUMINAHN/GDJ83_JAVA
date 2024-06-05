package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3_Solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력 : "); // 991225-1234567
		String jumin = sc.next(); // '-'때문에 문자열로 입력받는다.

		// 선생님 풀이
		// jumin.replace("-", "");
		int c = 2; // 2부터 시작
		int sum = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			char n1 = jumin.charAt(i);
			if (n1 == '-') {
				continue; // 증감식으로 돌아간다 계속 증가
			}
			String n2 = String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			sum += (num1 * c);
			c++; // 증가
			if (c > 9) {
				c = 2; // c에 2를 대입해서 다시 시작
			}
		}
		// sum = sum%11;
		sum %= 11;
		sum = 11 - sum;
		if (sum >= 10) {
			sum %= 10;
		}

		// sum == jumin.charAt(jumin.length()-1) 안됨 -> char와 int비교
		int a = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length() - 1))); // 제일 안쪽부터 해석
		// 한줄에 작성하면 쓸때 없는 변수가 필요없다. --> 안쓰는 변수는 불필요하니까~
		if (sum == a) {
			System.out.println("OK");
		} else {
			System.out.println("재발급");
		}
	}
}
