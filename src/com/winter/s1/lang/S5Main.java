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

		name = "winter-24*서울";
		name = name.replace("*", "-");
		String[] datas = name.split("-"); // 하나의 문자열을 여러개의 문자열로 나누어 작업 (파싱)
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

		// valueof 만들기 --> Static 선언을 쓸 수 있는가 // 문서를 보고 제대로 쓸 수 있는가 없는가를 봐야함
		// 다 string으로 바꾸겠다.
		String s = String.valueOf(10.2);
		System.out.println(10.2 + " "); // 새로운 객체가 더 만들어진다.

		String sth1 = String.valueOf(3); // 숫자를 문자로 바꿔줌
		String sth2 = String.valueOf(false); // name을 false로 바꿔줌?
		String sth3 = String.valueOf(0L);

		System.out.println(sth1);
		System.out.println(sth2);
		System.out.println(sth3);

	}
}
