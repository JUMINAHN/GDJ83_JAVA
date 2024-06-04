package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3Solve4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력 : "); // 991225-1234567
		String jumin = sc.next(); // '-'때문에 문자열로 입력받는다.

		// 선생님 풀이
		// char n1 = jumin.charAt(0);
		// n1을 string으로 바꾸는 방법? => prmitive type과 + char type = 문자열
		// String n2 = String.valueOf(n1);
		// int num1 = Integer.parseInt(n2);
		// int num1 = Integer.parseInt(n1 + ""); // prmitive type --> valueOf;;
		// System.out.println(num1 * 2);

		int sum = 0;
		boolean flag = true;
		jumin = jumin.replace("-", "0");
		for (int i = 0; i < jumin.length(); i++) {
			char n1 = jumin.charAt(i); // 0번째 인덱스의 정보 char이 들어간다.
			String n2 = String.valueOf(n1); // 0번째 인덱스를 String화 한다.
			int num1 = Integer.parseInt(n2); // 0번째 인덱스에 들어가있는 것을 int화한다 -> int에 담는다.
			if (i >= 0 && i <= 5) {
				sum += (num1 * (i + 2));
				System.out.println(sum);
			} else if (i == 6) {
				sum += 0;
				System.out.println(sum);
			} else if (i >= 7 && i <= 8) {
				sum += (num1 * (i + 1));
				System.out.println(sum);
			} else if (i >= 9 && i <= 12) {
				sum += (num1 * (i - 7));
				System.out.println(sum);
			}
		}
		System.out.println("총합 : " + sum);
		int other = (sum % 11) - 1; // 11로나눈 나머지 --> 5 ..지금 6이뜸 : 정확하게 떨어지는것 연습해보기~
		// System.out.println(204 % 11 + "나머지 << ");
		System.out.println("나머지 : " + other);
		char c1 = jumin.charAt(13);
		String c2 = String.valueOf(c1);
		int c3 = Integer.parseInt(c2);
		if (other >= 10) {
			flag = ((other / 10) == c3);
		} else {
			flag = (other == c3);
		}

		if (flag) {
			System.out.println("유효성 검증 성공");
		} else {
			System.out.println("유효성 검증 실패");
		}
	}
}
//

// ========

//		String birth = jumin.substring(0, 2);
//		// 노가다 방식
//		String newBirth = "19" + birth;
//		String now = "2024";
//		int result = Integer.parseInt(now) - Integer.parseInt(newBirth);
//		System.out.println("현재 나이는 ? : " + (result + 1) + "살");

// Quiz2 -> 범위값 지정
//		int birthValue = Integer.parseInt(birth);
//		String newBirth = "";
//		if (birthValue >= 25 && birthValue <= 99) {
//			newBirth = "19" + birthValue;
//		} else if {
//			newBirth = "20" + birthValue;
//		System.out.println(newBirth);
//		String now = "2024";
//		int result = Integer.parseInt(now) - Integer.parseInt(newBirth);
//		System.out.println("현재 나이는 ? : " + (result + 1));

// ========

// Quiz1 -> substring으로 방식
// System.out.println((int)ch % 2); --> 몫과 나머지로 접근
//		String newOne = jumin.substring(7, 8);
//		if (newOne.equals("1") || newOne.equals("3")) {
//			System.out.println("남자입니다.");
//		} else if (newOne.equals("2") || newOne.equals("4")) {
//			System.out.println("여자입니다.");
//		}
