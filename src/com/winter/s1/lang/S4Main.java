package com.winter.s1.lang;

import java.util.Scanner;

public class S4Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";

		// 문자는 불변이라 기존꺼 바뀌지 않음
		String result = name.substring(3); // 3번부터 -> 3포함
		System.out.println(result);

		result = name.substring(3, 5); // 5번은 미포함
		System.out.println(result);

		// 확장자 - 이 파일이 어떤 종류의 파일인지 구별하려고 하는 것
		System.out.println("파일 명을 입력하세요. 확장자 포함 : ");
		name = sc.next(); // hello.img
		// String subName = name.substring(0, name.length() - 4); // length자체는 길이 - 1 :
		// 인덱스 길이
		// 인덱스에서 필요없는 부분만 분리
		// 확장자만 분리

		// 이제 이름만 뽑아보는 코드 작성 Q1 --> pptx일거면 위에처럼 안되니까~
		// 길이 hello.pptx; "."부터 제거 하자
//		int pointNum = name.indexOf(".");
//		String subName = name.substring(0, pointNum);
//		System.out.println(subName);

		// 선생님 풀이 -> 확장자만 분리 (jpg, png, gif, jpeg, jiff)
		int idx = name.lastIndexOf("."); // 파일명 안에 .을 넣을수도 있다는 것 유의
		result = name.substring(idx + 1); // 확장자명만 분리
		System.out.println(result); // 해야 할 것을 글로써보는게 좋다~

		// ********문자열 비교 유의
		// 이미지 파일이냐 아니냐 판단 코드 작성~ Q2
		if (result.equals("jpg") || result.equals("jpeg") || result.equals("jiff") || result.equals("png")
				|| result.equals("giff")) {
			System.out.println("해당 파일은 이미지 파일입니다.");
		} else {
			System.out.println("이미지 파일이 아닙니다.");
		}
	}
}
