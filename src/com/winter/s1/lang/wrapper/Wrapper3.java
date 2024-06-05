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
		// 선생님 풀이
		String y = jumin.substring(0, 2);
		int r = 1900;
		if (ch == '3' || ch == '4') { // 상기 코드 이용
			r = 2000;
		}
		int year = r + Integer.parseInt(y);
		System.out.println(2024 - year);

		// Quiz 3. 주민번호 유효성 검증 --> 주민 번호를 만들 때 중복되면 안된다.
		// 마지막 자릿수 그동네에서 몇번째에 태어난거냐
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5 (검증용 숫자)
		// 18 15 4 10 12 42 8 18 6 12 20 30 -> 다 더함 대충 122이라고 가정
		// 총합을 11로 나눈 나머지를 구한다. -> 나머지 1
		// 나머지를 11로 뺀 결과 값을 검증용 숫자랑 같은지 비교
		// 11 - 1 (10) != 7; --> 같으면 제대로 된 번호
		// 뺀 결과값이 두자리일경우 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자랑 비교

		// substring?
		int sum = 0;
		jumin = jumin.replace("-", "0");
		for (int i = 0; i < jumin.length(); i++) { // 주민 안을 다 돌아
			char c = jumin.charAt(i); // 0번째의 내용 c에
			String c1 = String.valueOf(c);
			int charNum = Integer.parseInt(c1); // 들어간 숫자 무엇인지? --> 지금은 9만 있음
			if (i >= 0 && i <= 5) {
				sum += charNum * (i + 2);
			} else if (i == 6) {
				sum += 0;
			} else if (i >= 7 && i <= 8) {
				sum += charNum * (i + 1);
			} else if (i >= 9 && i <= 12) {
				sum += charNum * (i - 7);
			}
		}

		System.out.println("총 합계는 ? : " + sum);
		int other = 11 - (sum % 11); // 11에서 나머지 뺀 값
		System.out.println("나머지 출력 : " + other);
		char e = jumin.charAt(13);
		String e1 = String.valueOf(e);
		int endNum = Integer.parseInt(e1);
		boolean result = true;
		if (other >= 10) {
			result = ((other / 10) == endNum);
		} else {
			result = (other == endNum);
		}

		if (result) {
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
