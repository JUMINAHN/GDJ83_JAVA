package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력 : "); // 991225-1234567
		String jumin = sc.next(); // '-'때문에 문자열로 입력받는다.

		// 9개 인덱스까지
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5 (검증용 숫자)
		// 18 15 4 10 12 42 8 18 6 12 20 30 -> 다 더함 대충 122이라고 가정
		// 총합을 11로 나눈 나머지를 구한다. -> 나머지 1
		// 나머지를 11로 뺀 결과 값을 검증용 숫자랑 같은지 비교
		// 11 - 1 (10) != 7; --> 같으면 제대로 된 번호
		// 뺀 결과값이 두자리일경우 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자랑 비교

		boolean flag = true;
		int sum = 0;

		String jum = jumin.replace("-", "");
		for (int i = 0; i < jumin.length() - 1; i++) { // 길이 잘보기;;
			String z = jum.substring(i, i + 1);
			int num1 = Integer.parseInt(z);
			System.out.println(num1); // 뽑은걸 숫자로 보냄

			if (i >= 0 && i <= 5) {
				sum += (num1 * (i + 2));
			} else if (i == 6) {
				sum += 0;
			} else if (i >= 7 && i <= 8) {
				sum += (num1 * (i + 2));
			} else if (i >= 9 && i <= 12) {
				sum += (num1 * (i - 7));
			}
		}
		System.out.println("총합 : " + sum);
		int other = sum % 11; // 11로나눈 나머지
		System.out.println("나머지 : " + other);
		if (other >= 10) {
			flag = ((other / 10) == jumin.charAt(13));
		} else {
			flag = (other == jumin.charAt(13));
		}

		if (flag) {
			System.out.println("유효성 검증 성공");
		} else {
			System.out.println("유효성 검증 실패");
		}
	}

}
