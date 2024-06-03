package com.winter.s1.lang;

import java.util.Scanner;

public class ExInputWon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요 : ");
		String txt = sc.next();
//		int sum = 0;
//		for (int i = 1; i <= txt.length(); i++) {
//			sum = i * 1000;
//		} 
		System.out.println("최종 금액은 : " + txt.length() * 1000 + "원 입니다");

	}

}
