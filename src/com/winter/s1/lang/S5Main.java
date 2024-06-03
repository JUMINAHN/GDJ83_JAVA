package com.winter.s1.lang;

public class S5Main {
	public static void main(String[] args) {

		String name = " wi          nter        ";
		System.out.println(name.length());
		name = name.trim(); // 공백 제거(앞뒤) --> 가운데 공백은 제거안됨 앞뒤만 됨!!
		System.out.println(name);
		System.out.println(name.length());

		String name2 = "winter   ";
		name2 = name2.strip();
		System.out.println(name2);
		System.out.println(name2.length());

		// Charsequence = 문자열이라 생각하기
		name = name.replace("  ", ""); // 가운데 공백 제거하기
		System.out.println(name);
		System.out.println(name.length());
	}
}
