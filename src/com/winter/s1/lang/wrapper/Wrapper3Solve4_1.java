package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3Solve4_1 {
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
			if (i >= 9 && i <= 12) {
				sum += (num1 * (i - 7));
				System.out.println(sum);
			}
		}
		System.out.println("총합 : " + sum);

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
